package com.deloitte.q8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class q8 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public q8() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		 // Set refresh, autoload time as 5 seconds
	      response.setIntHeader("Refresh", 5);
	 
	      // Set response content type
	      response.setContentType("text/html");
	 
	      // Get current time
	      Calendar calendar = new GregorianCalendar();
	      String am_pm;
	      int hour = calendar.get(Calendar.HOUR);
	      int minute = calendar.get(Calendar.MINUTE);
	      int second = calendar.get(Calendar.SECOND);
	      
	      if(calendar.get(Calendar.AM_PM) == 0)
	        am_pm = "AM";
	      else
	        am_pm = "PM";
	 
	      String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
	    
	      PrintWriter out = response.getWriter();
	      String title = "Auto Page Refresh using Servlet";
	    
	      
	      out.println(
	         "<head><title>" + title + "</title></head>\n"+
	         
	         "<p>Current Time is: " + CT + "</p>\n"
	      );
	   }
	   

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
