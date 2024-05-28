package az.students.dbConnection;

import az.students.constants.DatabaseConstants;

import java.sql.Connection;
import java.sql.DriverManager;

import static az.students.constants.DatabaseConstants.*;

public class DatabaseConnection {
    public static Connection connect() {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println("Can not connect to DB");
        }
        return null;
    }
}
