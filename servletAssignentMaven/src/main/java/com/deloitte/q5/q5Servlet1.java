package com.deloitte.q5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;


public class q5Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public q5Servlet1() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	    	
	    String selectedChoice=request.getParameter("course");  
	    out.print("Thanks for choosing " + selectedChoice);  
	    
	    Cookie ck=new Cookie("course", selectedChoice);//creating cookie object  
	    response.addCookie(ck);//adding cookie in the response  
	    
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
