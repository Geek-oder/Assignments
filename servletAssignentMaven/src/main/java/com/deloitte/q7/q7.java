package com.deloitte.q7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class q7 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public q7() {
        super();
       
    }

	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s = request.getSession();
		PrintWriter out = response.getWriter();
		
		String usernameEntered = request.getParameter("username");
		
		String passwordEntered = request.getParameter("password");
		
		if(usernameEntered=="admin" && passwordEntered=="deloitte") {
			out.println("Welcome");
		} else {
			out.println("Invalid");
		}
	}
}
