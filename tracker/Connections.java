/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tracker;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author baile
 */
public class Connections {
    static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/covidTracker","Gostomski","CSC310bmg");
        
        }catch(Exception ex){
            System.out.print(""+ex);
        }
        return con;
    }
}
