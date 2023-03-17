package spacecoding.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    private Connection connection;
    public DatabaseManager(){
        this.connection=Database.getDBConnection();
    }

    public ResultSet getAllUsers(){
        Statement stmt;
        String sql;
        ResultSet resultSet=null;
        try {
            stmt=connection.createStatement();
            sql="SELECT * FROM users";
            resultSet=stmt.executeQuery(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return  resultSet;
    }

}
