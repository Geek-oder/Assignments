package com.deloitte.q4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class SecondServlet extends HttpServlet {  
  
/**
	 * 
	 */
	private static final long serialVersionUID = 1006756450186126186L;

public void doGet(HttpServletRequest request, HttpServletResponse response)  {
     
  
        response.setContentType("text/html");  
        PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
          
        HttpSession session=request.getSession(false);  
        String n=(String)session.getAttribute("uname");  
        out.print("Hello "+n);  
  
        out.close();  
  
       }
    }  
      
  
