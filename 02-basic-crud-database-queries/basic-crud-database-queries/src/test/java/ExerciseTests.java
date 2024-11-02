import ch.vorburger.mariadb4j.DB;
import ch.vorburger.mariadb4j.DBConfigurationBuilder;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    public void test01GetLAUsers() throws Exception {
        // read statement from resources/01-get-la-users.sql
        java.io.Reader reader = new java.io.InputStreamReader(
            ExerciseTests.class.getResource("/01-get-la-users.sql").openStream()
        );
        



        var results = connection.prepareStatement("SELECT * FROM users WHERE city = 'Los Angeles'").executeQuery();
        var i = 0;

        while (results.next()) {
            if (!results.getString("city").equals("Los Angeles")) {
                Assertions.fail("City is not Los Angeles");
            }
            i++;
        }
        assertEquals(2, i);
    }

    @Test
    public void test02UniqueUserCities() {
        // Your test code here
    }

    @Test
    public void test03RevenuePerProduct() {
        // Your test code here
    }

    @Test
    public void test04FrequentlyOrdered() {

    }
}
