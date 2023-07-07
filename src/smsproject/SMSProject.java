/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smsproject;
import java.sql.*;

/**
 *
 * @author HP
 */
public class SMSProject {
    
    static Statement connect() {
        String dbURL = "jdbc:mysql://localhost:3306/cms";
       
     try{  
            // Class.forName("com.mysql.jdbc.Driver");  
           Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/sms","root","root");  
            Statement stmt=con.createStatement();  
            System.out.println("connected");
            return stmt;
            // ResultSet rs=stmt.executeQuery("select * from users");  
            // while(rs.next())  
            // System.out.println(rs.getInt(1));  
            // con.close();  
            }
        catch (Exception e) {
            System.out.println("hello " + e.getMessage());
        }
       
       return null;
    }
    
//    to handle attendence
//    static ResultSet attendence() {
//        Statement statement = connect();
//        
////        stater
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Huuyr");
        connect();
        
        Statement stmt = connect();
        Login.renderUI();
//        stmt.executeUpdate()
        // TODO code application logic here
    }
    
}
