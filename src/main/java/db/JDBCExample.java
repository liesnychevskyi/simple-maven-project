package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {

    public static void main(String[] argv) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            System.out.println("Failed to load Class com.mysql.jdbc.Driver");
        }

        Connection conn = null;
        String dbUrl = "jdbc:mysql://localhost:9000/wordpress";
        String user = "root";
        String password = "password";
        try {
            conn = DriverManager.getConnection(dbUrl ,user, password);

            System.out.println("Successfully connected!");

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}