
import ch.vorburger.mariadb4j.DB;
import ch.vorburger.mariadb4j.DBConfigurationBuilder;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestCreateScript {
    private static DB db;
    private static Connection connection;

    @BeforeAll
    public static void setup() throws Exception {
        DBConfigurationBuilder configBuilder = DBConfigurationBuilder.newBuilder();
        configBuilder.setPort(0);
        db = DB.newEmbeddedDB(configBuilder.build());
        db.start();

        connection = DriverManager.getConnection(
            "jdbc:mariadb://localhost:" + db.getConfiguration().getPort() + "/test",
            "root",
            ""
        );

        java.io.Reader reader = new java.io.InputStreamReader(
            TestCreateScript.class.getResource("/create-database.sql").openStream()
        );

        ScriptRunner sr = new ScriptRunner(connection);
        sr.setStopOnError(true);
        sr.runScript(reader);
    }

    @AfterAll
    public static void tearDown() throws Exception {
        connection.close();
        db.stop();
    }

    @Test
    public void checkUserColumns() throws Exception {
        String[] columns = {"id", "username", "password" };
        String[] types = {"int(11)", "varchar(255)", "varchar(255)"};
        String[] keys = {"PRI", "", ""};
        String[] extra = {"auto_increment", "", ""};

        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SHOW COLUMNS FROM users");
            while (resultSet.next()) {
                String column = resultSet.getString("Field");
                boolean found = false;
                for (int i = 0; i < columns.length; i++) {
                    String c = columns[i];
                    if (column.equals(c)) {
                        if (!resultSet.getString("Type").equals(types[i])) {
                            throw new Exception("Column " + column + " has wrong type - Expected: " + types[i] + " Found: " + resultSet.getString("Type"));
                        }
                        if (!resultSet.getString("Key").equals(keys[i])) {
                            throw new Exception("Column " + column + " has wrong key type - Expected: " + keys[i] + " Found: " + resultSet.getString("Key"));
                        }
                        columns[i] = null;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    throw new Exception("Column " + column + " not expected");
                }
            }

            for (String c : columns) {
                if (c != null) {
                    throw new Exception("Column " + c + " not found");
                }
            }
        }
    }

    @Test
    public void topicUserForeignKeyShouldExist() throws Exception {
        String query = """
                SELECT *
                FROM information_schema.KEY_COLUMN_USAGE
                WHERE TABLE_NAME = 'topics'
                    AND COLUMN_NAME = 'author_id'
                    AND REFERENCED_TABLE_NAME = 'users'
                    AND REFERENCED_COLUMN_NAME = 'id'
                """;

        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            if (!resultSet.next()) {
                throw new Exception("Foreign key constraint not found");
            }
        }
    }

    @Test
    public void commentUserForeignKeyShouldExist() throws Exception {
        String query = """
                SELECT *
                FROM information_schema.KEY_COLUMN_USAGE
                WHERE TABLE_NAME = 'comments'
                    AND COLUMN_NAME = 'author_id'
                    AND REFERENCED_TABLE_NAME = 'users'
                    AND REFERENCED_COLUMN_NAME = 'id'
                """;

        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            if (!resultSet.next()) {
                throw new Exception("Foreign key constraint not found");
            }
        }
    }

    @Test
    public void commentTopicForeignKeyShouldExist() throws Exception {
        String query = """
                SELECT *
                FROM information_schema.KEY_COLUMN_USAGE
                WHERE TABLE_NAME = 'comments'
                    AND COLUMN_NAME = 'topic_id'
                    AND REFERENCED_TABLE_NAME = 'topics'
                    AND REFERENCED_COLUMN_NAME = 'id'
                """;

        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            if (!resultSet.next()) {
                throw new Exception("Foreign key constraint not found");
            }
        }
    }
}
