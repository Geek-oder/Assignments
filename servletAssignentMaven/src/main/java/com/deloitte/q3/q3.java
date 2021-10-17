package com.deloitte.q3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class q3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public q3() {
        super();
        
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s = request.getSession();
		PrintWriter out = response.getWriter();
		
		String nameEntered = request.getParameter("name");
		
		Integer ageEntered = Integer.parseInt(request.getParameter("age"));
		
		if(ageEntered >= 18) {
			
			response.sendRedirect("success.jsp");
		} else
			
			
			response.sendRedirect("failed.jsp");
	
		
}}
