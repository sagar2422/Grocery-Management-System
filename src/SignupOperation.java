
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bhush
 */
public class SignupOperation {
     public static boolean signup(String username ,String password ,String crpassword,  String Address , String Fname, String Lname , String email  ,String Mobile , JFrame frame ){
        try{
              Connection con = (Connection) DBConnection.dbconnection();
              String query = "INSERT INTO Customer VALUES ('" + username+"','"+ password + "' ,'"+crpassword+"' ,'" +Address +"' , '"+Fname+"' ,'"+Lname+"' ,'"+email+"', '"+Mobile+"')  ";
              Statement statement = con.createStatement();
              statement.executeUpdate(query);
      return true; 
               
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error: "+e.getMessage());
        }
        return false;
}
}
