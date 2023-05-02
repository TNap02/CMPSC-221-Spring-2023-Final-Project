/**
 * CMPSC 221 Final Project Team 2 2023
 * DatabaseClass.java
 * Purpose: Interface with leader board database and push and pull data as needed
 * 
 * @author Codey Solomon
 * @verson 1.0 4/28/23
 */

package Model;

import java.sql.*;
import java.util.ArrayList;


public class DatabaseClass {
    
    //establish variables for connection
    String jdbcUrl = "jdbc:derby://localhost:1527/CMPSC221FinalDatabse";
    String username = "Team2";
    String password = "app1";
    
    //Checks database for a specific user based on user name and pin
    public boolean pullLogin(String searchUser, String pass){
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        }
        
        catch (Exception e){
            System.exit(-1);
        }
        
         try{
            Connection con =
                    DriverManager.getConnection(jdbcUrl,username ,password);

            Statement stmt = con.createStatement();
            
            String stmtString = "SELECT * FROM TEAM2.SNAKETABLE WHERE USERNAME = '" + searchUser + "' AND PASSWORD = '" + pass + "'";
            
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
    
    public ArrayList topTenLeaderboard(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        }
        
        catch (Exception e){
            System.exit(-1);
        }
        
        try{
            Connection con =
                    DriverManager.getConnection(jdbcUrl,username ,password);

            Statement stmt = con.createStatement();
            
            String stmtString = "SELECT USERNAME, SCORE, TIME FROM TEAM2.SNAKETABLE ORDER BY SCORE DESC FETCH FIRST 10 ROWS ONLY";
            
            ResultSet rs = stmt.executeQuery(stmtString);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
             ArrayList<String> leaderboard = new ArrayList<String>();
             
             String entry = "";

            int numberOfColumns = rsmd.getColumnCount();
            int rowCount = 1;
            
             while (rs.next()){
                for (int i = 1; i <= numberOfColumns; i++){
                      entry += rs.getString(i) + " ";
                }
                leaderboard.add(entry);
                entry = "";
                rowCount++;
            }
            
            stmt.close();

            con.close();   
            return leaderboard;
        }
        
        catch (Exception e){
            System.out.println(e);
            return null;
        }
        
      
    }
    
    public String recentScoreAndTime(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        }
        
        catch (Exception e){
            System.exit(-1);
        
        }
        try {
            Connection con =
                    DriverManager.getConnection(jdbcUrl,username ,password);

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            String stmtString = "SELECT SCORE, TIME FROM TEAM2.SNAKETABLE ";
            
            ResultSet rs = stmt.executeQuery(stmtString);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            String record = "";
            
            int numberOfColumns = rsmd.getColumnCount();
                    
            rs.last();
            
            for (int i = 1; i <= numberOfColumns; i++){
                      record += rs.getString(i) + " ";
                }
            
            stmt.close();

            con.close(); 
            
            return record;
          
        }
        
        catch (Exception e){
            System.out.println(e);
            return null;
        }
        
   }    
    
    public void pushInfo(String useruser, String passpass, int score, int time){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        }
        
        catch (Exception e){
            System.exit(-1);
        }
        
        try{
            Connection con =
                    DriverManager.getConnection(jdbcUrl,username ,password);
            
            Statement stmt = con.createStatement();
            
            String insert = "INSERT INTO TEAM2.SNAKETABLE (USERNAME, PASSWORD, SCORE, TIME) VALUES ('" + useruser + "', '" + passpass + "', " + score + ", " + time +")";
            
            stmt.executeUpdate(insert);
            
            stmt.close();
            
            con.close();
        }
        
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    
}
