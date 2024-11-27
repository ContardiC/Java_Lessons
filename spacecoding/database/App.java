package spacecoding.database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {

        DatabaseManager dbManager=new DatabaseManager();

        ResultSet resultSet = dbManager.getAllUsers();
        try{
            while(resultSet.next()){
                //Display values
                System.out.print("ID: " + resultSet.getInt("id"));
                System.out.print(", email: " + resultSet.getString("email"));
                System.out.print(", password: " + resultSet.getString("password"));
            }
        }catch (SQLException e){
            System.out.println("erors");
        }

    }
}
