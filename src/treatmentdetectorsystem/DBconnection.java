/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treatmentdetectorsystem;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Al Azad
 */
public class DBconnection {
     java.sql.Connection conn = null;
    
    public static java.sql.Connection ConnecrDb()
    {
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tmdsystem","root","");
                // JOptionPane.showMessageDialog(null,"Connection Establist");
                    return conn;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
