<%-- 
    Document   : GameOver.jsp
    Created on : Apr 29, 2023, 9:04:18 AM
    Author     : codeysolomon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <title>Game Over!! </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    
     
    <body style="background-color: black; width: 50%; margin-left: auto; margin-right: auto;">
        <h1 style="color:red; width: 50%; margin-left: auto; margin-right: auto;"> GAME OVER!!! </h1>
        
        <img src="images/snake1.gif" alt="snakegif1" style="width:300px;height:300px;">
        <img src="images/snakegif.gif" alt="snakegif2" style="width:300px;height:300px;" >
            
        <br>
        
        <form action="SnakeServlet2">
            <button type = "submit"> Click Here To View Your Stats And Leaderboard </button>
         
        </form>
        
      
        
        
    
        
    </body>
</html>
