package database;

import java.sql.*;

public class MyFirstJdbcConnection {

    //10 pierwszych imion i nazwisk osób z tabeli Contact bazy AdventureWorks
    //select top 10 * from Person.Contact
    public static void main(String[] args) {
        String connectionURL = "jdbc:sqlserver://morfeusz.wszib.edu.pl;encrypt=true;trustServerCertificate=true;databaseName=AdventureWorks;user=**********;password=********;";
        String sql = "select top 10 * from Person.Contact";
        try(Connection con = DriverManager.getConnection(connectionURL);
            Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
