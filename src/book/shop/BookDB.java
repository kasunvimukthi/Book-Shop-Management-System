/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.shop;



import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class BookDB {
    
      private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "book_shop";
    private static Integer portnumber = 3306;
    private static String password = "";
    
    public static Connection getConnection()
    {
        Connection client = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            client = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" Get Connection -> " + BookDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        return client;
        
        
        
        
    }

    static Connection ConnecrDb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

   
//     public static Connection connect()
//    {
//        Connection con=null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_shop?","root","");
//
//
//        } catch (Exception e) {
//            System.out.println("inter.BookDB.connect()");
//            JOptionPane.showMessageDialog(null, e);
//        }
//       return con;
//    }
    }
