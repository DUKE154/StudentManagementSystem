/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionProvider {
    public static Connection getCon(){
        try{
            //looking for driver class in jar file added in library
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentresult", "root", "UHBijn!@#123");
            return con;
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
    
    public static void main(String args[]){
        ConnectionProvider obj = new ConnectionProvider();
        Connection c = obj.getCon();
    }
}

