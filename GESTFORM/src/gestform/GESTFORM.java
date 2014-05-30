/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestform;

//import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author z
 * 
 * 
 * 
 *  

    public InsertTable() throws  Exception{

    mdbc=new MyDBConnection();
         mdbc.init();
         Connection conn=mdbc.getMyConnection();
         stmt= conn.createStatement(); 
 */
public class GESTFORM {
    
    private LoginFrame logFrame;
    public static boolean org;
    public static String id;
    protected static MyDBConnect mdbc;
    protected static Statement stmt; 
    protected static ResultSet rs; 

    
    // Constructeur 
    public GESTFORM  () throws SQLException{
        mdbc=new MyDBConnect();
        mdbc.init();
        Connection conn=mdbc.getMyConnection();
        stmt= conn.createStatement(); 
      
        this.logFrame = new LoginFrame();
        this.logFrame.setVisible(true);

}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
               
        GESTFORM gestform = new GESTFORM();
    }
    
}
