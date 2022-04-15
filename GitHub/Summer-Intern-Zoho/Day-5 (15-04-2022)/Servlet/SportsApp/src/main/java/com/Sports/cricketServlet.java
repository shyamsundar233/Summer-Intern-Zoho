package com.Sports;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cricketServlet extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		
		out.println("<body>"
				+ "<center>" + 
				"<h1>");
		
		out.println("Cricket");
		
		out.println("</body>"
				+ "</center>" + 
				"</h1>");
		
		out.println("</head>");
		out.println("</html>");
		
		
	}

}
