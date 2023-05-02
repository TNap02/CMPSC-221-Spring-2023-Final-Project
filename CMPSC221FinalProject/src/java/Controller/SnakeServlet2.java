/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;


import Model.ScoreMethods;
import Model.DatabaseClass;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 *
 * @author codeysolomon
 */
public class SnakeServlet2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        ScoreMethods scoreBot = new ScoreMethods();
        DatabaseClass dataBot = new DatabaseClass();
        
        scoreBot.setScoreAndTime();
        String userScore = scoreBot.getScore();
        String userTime = scoreBot.getTime();
        
        ArrayList leaderboard = dataBot.topTenLeaderboard();
        String score1 = (String) leaderboard.get(0);
        String score2 = (String) leaderboard.get(1);
        String score3 =(String) leaderboard.get(2);
        String score4 =(String) leaderboard.get(3);
        String score5 =(String) leaderboard.get(4);
        String score6 =(String) leaderboard.get(5);
        String score7 =(String) leaderboard.get(6);
        String score8 =(String) leaderboard.get(7);
        String score9 =(String) leaderboard.get(8);
        String score10 =(String) leaderboard.get(9);
        System.out.println(score1);
        System.out.println(leaderboard);
        
       request.setAttribute("userScore", userScore);
       request.setAttribute("userTime", userTime);
       request.setAttribute("score1",score1);
       request.setAttribute("score2",score2);
       request.setAttribute("score3",score3);
       request.setAttribute("score4",score4);
       request.setAttribute("score5",score5);
       request.setAttribute("score6",score6);
       request.setAttribute("score7",score7);
       request.setAttribute("score8",score8);
       request.setAttribute("score9",score9);
       request.setAttribute("score10",score10);
        
        
        
        
       //Connects to the view
       String url = "/SnakeStats.jsp";
       getServletContext().getRequestDispatcher(url).forward(request, response); 
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
