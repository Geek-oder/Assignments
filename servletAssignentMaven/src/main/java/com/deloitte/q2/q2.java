package com.deloitte.q2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class q2
 */
@WebServlet("/q2")
public class q2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public q2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double n1 = Math.random();
		double n2 = Math.random();
		double n3 = Math.random();
		double n4 = Math.random();
		
		
		//set response content type
        response.setContentType("text/html");
        //get stream obj
        PrintWriter pw = response.getWriter();
        
        pw.println("<h2>"+"Number 1 is" + n1 + "</h2>");
        pw.println("<h2>"+"Number 1 is" + n2 + "</h2>");
        pw.println("<h2>"+"Number 1 is" + n3 + "</h2>");
        pw.println("<h2>"+"Number 1 is" + n4 + "</h2>");
        //close stream object
        pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
