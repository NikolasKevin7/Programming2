/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_RSLatihan;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Koneksi {
    private static Connection KoneksiDatabse;
    public static Connection koneksikeDB() throws SQLException {
    try {
        String DB ="jdbc:mysql://localhost/db_rslatihan";
        String user="root";
        String pass="";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        KoneksiDatabse = (Connection) DriverManager.getConnection(DB,user,pass);
    } catch (Exception e)  {
      JOptionPane.showMessageDialog(null,"Tidak ada koneksi", "Error",                    
      JOptionPane.INFORMATION_MESSAGE);
      System.err.println(e.getMessage());
      System.exit(0);
     }
      return KoneksiDatabse;
    }
 }
   