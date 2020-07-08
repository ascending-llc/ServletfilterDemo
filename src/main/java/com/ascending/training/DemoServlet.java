package com.ascending.training;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        PrintWriter out = resp.getWriter();
//        out.println("Welcome ASCENDING");
        System.out.println(req.getServletPath());
        if(req.getServletPath().equals("/")){
            resp.setContentType("text/html");

            // Get an output stream to use in sending the output to the client.
            ServletOutputStream out = resp.getOutputStream();
            // Put together the HTML code for the output.
            out.println("<html>");
            out.println("<head><title>ASCENDING Servlet Demo</title></head>");
            out.println("<body>");
            out.println("<h1>Welcome ASCENDING</h1>");
            out.println("<a href='/another'>another page link</a>");
            out.println("</body></html>");
        }else{
            resp.setContentType("text/html");

            // Get an output stream to use in sending the output to the client.
            ServletOutputStream out = resp.getOutputStream();
            // Put together the HTML code for the output.
            out.println("<html>");
            out.println("<head><title>ASCENDING Servlet Demo</title></head>");
            out.println("<body>");
            out.println("<h1>Another Page</h1>");
            out.println("<a href='/'>landing page</a>");
            out.println("</body></html>");

        }
        System.out.println("We are in HelloServlet");
    }
}
