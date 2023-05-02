<%-- 
    Document   : SnakeStats.jsp
    Created on : Apr 27, 2023, 1:57:58 PM
    Author     : codeysolomon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LEADERBOARD</title>
    </head>
    <body style="background-color: black; width: 50%; margin-left: auto; margin-right: auto;">
        <h1 style="color:azure; width: 50%; margin-left: auto; margin-right: auto;"> LEADERBOARD
        </h1>
        <%
          String score1 = (String) request.getAttribute("score1");
          String score2 = (String) request.getAttribute("score2");
          String score3 = (String)request.getAttribute("score3");
          String score4 = (String) request.getAttribute("score4");
          String score5 = (String)request.getAttribute("score5");
          String score6 = (String) request.getAttribute("score6");
          String score7 = (String) request.getAttribute("score7");
          String score8 = (String) request.getAttribute("score8");
          String score9 = (String) request.getAttribute("score9");
          String score10 = (String)request.getAttribute("score10");
          %>
          <p style="color:azure;"> 1: <%= score1 %> <p>
          <p style="color:azure;"> 2: <%= score2 %> <p>
          <p style="color:azure;"> 3: <%= score3 %> <p>
          <p style="color:azure;"> 4: <%= score4 %> <p> 
          <p style="color:azure;"> 5: <%= score5 %> <p> 
          <p style="color:azure;"> 6: <%= score6 %> <p>  
          <p style="color:azure;"> 7: <%= score7 %> <p> 
          <p style="color:azure;"> 8: <%= score8 %> <p>  
          <p style="color:azure;"> 9: <%= score9 %> <p>
          <p style="color:azure;"> 10: <%= score10 %> <p>
    </body>
</html>
