package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDB {
    private static final String URL = "jdbc:mysql://localhost:3306/db_inventaris_aset";
    private static final String USER = "root";  // Sesuaikan jika ada password
    private static final String PASSWORD = "";  // Jika MySQL memiliki password, ganti di sini
    
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Database Connection Error: " + e.getMessage());
            return null;
        }
    }
}
