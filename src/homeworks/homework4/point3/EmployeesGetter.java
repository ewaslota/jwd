package homeworks.homework4.point3;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**Napisz program, który połączy się z bazą danych i wyświetli wszystkie rekordy z tabeli Employees:
 stwórz w bazie danych tabelę Employees o strukturze przedstawionej poniżej,
 wstaw do tabeli przykładowe dane,
 napisz program z wykorzystaniem JDBC, aby pobrać i wyświetlić dane z tabeli.
 nazwa kolumny	typ
 EmployeeID	INT
 FirstName	VARCHAR(50)
 LastName	VARCHAR(50)
 Age	INT
 **/
/*
USE eslota;
DROP TABLE IF EXISTS Employees;
CREATE TABLE Employees
(
    EmployeeID	INT IDENTITY PRIMARY KEY,
    FirstName	VARCHAR(50) NOT NULL,
    LastName	VARCHAR(50) NOT NULL ,
    Age	INT NOT NULL
)

INSERT INTO Employees(FirstName, LastName, Age) VALUES ('Jan', 'Kowalski', 43);
INSERT INTO Employees(FirstName, LastName, Age) VALUES ('Adam', 'Nowak', 31);

 */
public class EmployeesGetter {
    private static final String DB_HOST = "morfeusz.wszib.edu.pl";
    private static final int DB_PORT = 1433;
    private static final String DB_USER = "eslota";
    private static final String DB_PASS = "*****";
    private static final String DB_NAME = "eslota";
    private static final String SELECT_ALL_EMPLOYEES_SQL = "SELECT * FROM Employees";
    public static void main(String[] args) {
        EmployeesGetter employeesGetter = new EmployeesGetter();
        try (Connection con = employeesGetter.connect(DB_USER, DB_PASS, DB_NAME);
             Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(SELECT_ALL_EMPLOYEES_SQL);
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("EmployeeID") + ", imię: " + rs.getString("FirstName") + ", nazwisko: " + rs.getString("LastName") + ", wiek: " + rs.getInt("Age"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection connect (String username, String password, String dbName) throws SQLServerException {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setTrustServerCertificate(true);
        ds.setUser(username);
        ds.setDatabaseName(dbName);
        ds.setPassword(password);
        ds.setPortNumber(DB_PORT);
        ds.setServerName(DB_HOST);
        return ds.getConnection();
    }
}
