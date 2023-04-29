/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.*;

/**
 *
 * @author codeysolomon
 */
public class DatabaseClass {
    
    String jdbcUrl = "jdbc:derby://localhost:1527/CMPSC221FinalDatabse";
    String username = "Team2";
    String password = "app1";
    
    public boolean pullLogin(String searchUser){
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        }
        
        catch (Exception e){
            System.out.println(" driver failed to load.");
            System.exit(-1);
        }
        
         try{
            Connection con =
                    DriverManager.getConnection(jdbcUrl, username, password);

            Statement stmt = con.createStatement();
            
            String stmtString = "SELECT * FROM TEAM2.SNAKETABLE WHERE USERNAME = '" + searchUser + "'";
            
            ResultSet rs = stmt.executeQuery(stmtString);
            
            boolean hasRows = false;
            
            while (rs.next()){
                hasRows = true;
                break;
            }   
            
            stmt.close();

            con.close();
            
            return hasRows;
         }
         
         
         catch (Exception e){
            System.out.println(e);
           return false;
        }
         
         
    }
    
}
