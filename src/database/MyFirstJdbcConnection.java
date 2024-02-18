package database;

import java.sql.DriverManager;
import java.sql.SQLException;

public class MyFirstJdbcConnection {
    public static void main(String[] args) {
        String connectionURL = "jdbc:sqlserver://localhost;encrypt=true;user=MyUserName;password=*****;";
        try {
            DriverManager.getConnection(connectionURL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
