package com.deloitte.q4;


import java.io.PrintWriter;

 
import javax.servlet.http.*;  

  
  
public class FirstServlet extends HttpServlet {  
  
/**
	 * 
	 */
	private static final long serialVersionUID = -8640084292238013796L;

public void doGet(HttpServletRequest request, HttpServletResponse response){  
        try{  
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        String n=request.getParameter("userName");  
        out.print("Welcome "+n);  
          
        HttpSession session=request.getSession();  
        session.setAttribute("uname",n);  
  
        out.print("<a href='servlet2'>visit</a>");  
                  
        out.close();  
  
                }catch(Exception e){System.out.println(e);}  
    }  
  
} 