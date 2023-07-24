/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bankdatabse;
 import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author bhush
 */
public class Operations {
     Connection con;

    public Operations() throws Exception {
        con = DBConnection.dbconnection();
        String q = "insert into branch values (?,?,?)";
         PreparedStatement p = (PreparedStatement) con.prepareStatement(q);
         
        
         p.setString(1,"Gandhi Nagar");
         p.setString(2,"Sangamner");
          p.setInt(3,1000000);
        
         p.executeUpdate();
         
        System.out.println("information enterd in table");
       
         
         
        
    }
    public static void main(String[] args) {
         try {
             Operations op = new Operations();
         } catch (Exception ex) {
             Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
}
