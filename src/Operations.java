/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//import com.sun.jdi.connect.spi.Connection;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

/**
 *
 * @author bhush
 */
public class Operations {
    public static boolean login(String username , String password, JFrame frame){
        try{
              Connection con = (Connection) DBConnection.dbconnection();
              String Query = "SELECT username,pass FROM Customer WHERE username = '" + username+"' AND pass = '"+ password + "' ";
              PreparedStatement preparedStatement;
              preparedStatement = con.prepareStatement(Query);
              ResultSet rs = preparedStatement.executeQuery();
              
                while(rs.next()){
               LoginSession.username = rs.getString("username");
               LoginSession.password = rs.getString("pass");
               return true;
                }
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error: "+e.getMessage());
        }
        return false;
    }
}
