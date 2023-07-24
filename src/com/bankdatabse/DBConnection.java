package com.bankdatabse;



import java.sql.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bhush
 */
public class DBConnection {

    public static Connection dbconnection() throws Exception{
        String dbRoot = "jdbc:postgresql://";
        String hostName = "localhost:2002/";
        String dbName = "Bank Database";
        String dbUrl = dbRoot+hostName+dbName;
        
        String hostUsername = "postgres";
        String hostPassword = "Bhushan";
        
        Class.forName("org.postgresql.Driver");
        Connection myConn = (Connection)DriverManager.getConnection(dbUrl,hostUsername,hostPassword);
        
        return myConn;
    }
     public static void main(String[] args) throws Exception {
         DBConnection db = new DBConnection();
          DBConnection.dbconnection();
          
          
        
    }
}
