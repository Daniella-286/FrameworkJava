/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu;

/**
 *
 * @author Daniella
 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Hello extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<HTML>"); 
        out.println("<HEAD><TITLE>Bonjour tout le monde</TITLE></HEAD>"); 
        out.println("<BODY>"); 
        out.println("<BIG>Bonjour tout le monde</BIG>"); 
        out.println("</BODY></HTML>");
    } 
}
