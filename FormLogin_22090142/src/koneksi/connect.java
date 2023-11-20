/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ferdi
 */
public class connect {
    private static Connection connect;
    public static Connection getConnection()throws SQLException {
        String db = "jdbc:mysql://localhost:3306/dbperkuliahan";
        String user = "root";
        String pass = "";
        
        if(connect == null) {
            connect = DriverManager.getConnection(db, user, pass);
        }
        
        return connect;
    }
}
