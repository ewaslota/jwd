package database.lab19;

import java.sql.*;

public class FindPersonsApp {
    private static final String DB_HOST = "morfeusz.wszib.edu.pl";
    private static final int DB_PORT = 1433;
    private static final String DB_USER = "eslota";
    private static final String DB_PASS = "........";
    private static final String DB_NAME = "eslota";

    public static void main(String[] args) {
        String connectionURL = "jdbc:sqlserver://morfeusz.wszib.edu.pl;encrypt=true;trustServerCertificate=true;databaseName=AdventureWorks;user=**********;password=********;";
        String sql = "select top 10 * from Person.Contact WHERE LastName = 'Anderson'";
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