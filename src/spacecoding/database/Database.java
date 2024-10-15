package spacecoding.database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String DB_DRIVER ="com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql://localhost:8889/info";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static Connection getDBConnection(){
        Connection dbConnection=null;
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            dbConnection= DriverManager.getConnection(DB_CONNECTION,DB_USER,DB_PASSWORD);
            System.out.println("Connection OK");
        } catch (SQLException e) {
            System.out.println("Connection Error");
            throw new RuntimeException(e);
        }
        return dbConnection;
    }
}
// TODO1: Rifare questa sezione 