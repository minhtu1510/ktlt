/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ASUS
 */
public class DAO {
    public static Connection getDAO(){ 
    String url="jdbc:mysql://localhost:3306/ttktlt?autoReconnect=true&useSSL=false";
    String username="root";
    String password="minhtu15102003";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return(Connection) DriverManager.getConnection(url, username,password);
            
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    
}
    
}