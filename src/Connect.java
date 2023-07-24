import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bhush
 */
public class Connect {
     Connection connection;
     String url = "jdbc:postgresql://localhost:2002/postgres";
     String user = "postgres";
     String password = "Bhushan";
public Connection dbConnection(){
     try{
         
     
     Class.forName("org.postgresql.Driver");
     } catch (ClassNotFoundException e ){
         e.getMessage();
     }
         try {
             DriverManager.getConnection(url,user,password);
             JOptionPane.showMessageDialog(null,"Connected");
         } catch (SQLException ex) {
             java.util.logging.Logger.getLogger(DBConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null," Failed to Connect");
         }
          
         return connection;
}
      public static void main(String[] args) {
          Connect db = new Connect();
          db.dbConnection();
        
    }
}