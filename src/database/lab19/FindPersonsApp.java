package database.lab19;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.*;

/**
 * Napisz program, który korzystając z bazy danych AdventureWorks wyświetli podstawowe dane 10. pierwszych osób (Person.Contact),
 * którzy mają na nazwisko „Anderson”.
 * Dokonaj modyfikacji powyższego programu, aby można było wyszukiwać osoby podając początek nazwiska.
 */
public class FindPersonsApp {
    private static final String DB_HOST = "morfeusz.wszib.edu.pl";
    private static final int DB_PORT = 1433;
    private static final String DB_USER = "eslota";
    private static final String DB_PASS = "*******";
    private static final String DB_NAME = "AdventureWorks";
    private static final String SQL1 = "select top 10 * from Person.Contact where LastName like 'Anderson'";
    private static final String SQL2 = "select top 10 * from Person.Contact where LastName like ?";

    public static void main(String[] args) throws SQLException {
        FindPersonsApp fap = new FindPersonsApp();
        try (Connection con = fap.connect(DB_USER, DB_PASS, DB_NAME);
             //Statement stmt = con.createStatement();
             PreparedStatement ps = con.prepareStatement(SQL2)) {
//             ResultSet rs = stmt.executeQuery(SQL1)) {
            ps.setString(1, args[0] + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName") + " " + rs.getString("EmailAddress"));

            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    public Connection connect(String userName, String password, String dbName) throws SQLServerException {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setTrustServerCertificate(true);
        ds.setUser(userName);
        ds.setPassword(password);
        ds.setDatabaseName(dbName);
        ds.setPortNumber(DB_PORT);
        ds.setServerName(DB_HOST);
        return ds.getConnection();
    }
}