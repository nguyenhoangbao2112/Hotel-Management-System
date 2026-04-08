/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;
/**
 *
 * @author WOW
 */
public class connectdb {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS?useSSL=false","root","YourPassword");
            return con;
        }
            catch (Exception e){
                    return null;
                    }
    }
}
  

