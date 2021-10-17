package com.deloitte.q6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class q6
 */
@WebServlet("/q6")
public class q6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public q6() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
        //get stream obj
        PrintWriter pw = response.getWriter();
        
        pw.println("<h2>"+"You have successfully clicked the link" + "</h2>");
        //close stream object
        pw.close();
	}

	
}
