/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dasun
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    
    public static Connection getConnection() {

        Connection con = null;

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=SuperMarketDB;"
                    + "user=sa;"
                    + "password=1234;"
                    + "encrypt=true;"
                    + "trustServerCertificate=true;"
            );

            System.out.println("Connected");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
    
}
