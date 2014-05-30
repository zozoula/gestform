/*
 * MyDBConnection.java
 *
 * Created on 2005/01/16, 10:50
 */

package gestform;

import java.sql.*;

/**
 *
 * @author aNToNy
 */
public class MyDBConnect {
   
    private Connection myConnection;
    Statement stmt;
    ResultSet rs;
    
    /** Creates a new instance of MyDBConnection */
    public MyDBConnect() {

    }

    public void init(){
    
       try{
        
        Class.forName("com.mysql.jdbc.Driver");
        myConnection=DriverManager.getConnection("jdbc:mysql://82.127.32.30:3306/veyre_ppe2","root", "root");
        }
        catch(Exception e){
            System.out.println("Failed to get connection");
            e.printStackTrace();
        }
    }
    
    
    public Connection getMyConnection(){
        return myConnection;
    }
    
    
    public void close(ResultSet rs){
        
        if(rs !=null){
            try{
               rs.close();
            }
            catch(Exception e){}
        
        }
    }
    
     public void close(java.sql.Statement stmt){
        
        if(stmt !=null){
            try{
               stmt.close();
            }
            catch(Exception e){}
        
        }
    }
     
  public void destroy(){
  
    if(myConnection !=null){
    
         try{
               myConnection.close();
            }
            catch(Exception e){}
        
        
    }
  }
    
}