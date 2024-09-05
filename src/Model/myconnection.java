/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sanja
 */
public class myconnection {
        
    // create a function to connect with mysql database
    
    public static Connection getConnection(){
     
      /*  try {
            String url = "jdbc:sqlserver://storedb8.database.windows.net:1433;database=testDB;user=sanjaya@storedb8;password=supunS@8;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
            String username = "sanjaya";
            String password = "supunS@8";
            
           return DriverManager.getConnection(url, username, password);
           // System.out.println("ok");
        } catch (SQLException ex) {
            System.out.println("error");
            Logger.getLogger(myconnection.class.getName()).log(Level.SEVERE, null, ex);
            
        }
         return null;*/
        Connection con = null ;
     
     try {
         
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/pos7","root","123");
         return con;
         
         
     } catch (ClassNotFoundException | SQLException e) {
         
         System.out.println(e);
         return null;
     }
     
    }

    public static PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
