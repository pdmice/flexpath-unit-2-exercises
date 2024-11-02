import ch.vorburger.mariadb4j.DB;
import ch.vorburger.mariadb4j.DBConfigurationBuilder;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ExerciseTests {
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
                ExerciseTests.class.getResource("/create-database.sql").openStream()
        );

        ScriptRunner sr = new ScriptRunner(connection);
        sr.setStopOnError(true);
        sr.setLogWriter(null);
        sr.setErrorLogWriter(null);
        sr.runScript(reader);
    }

    @AfterAll
    public static void tearDown() throws Exception {
        connection.close();
        db.stop();
    }

    @Test
    public void test() {
        // Your test code here
    }
}
