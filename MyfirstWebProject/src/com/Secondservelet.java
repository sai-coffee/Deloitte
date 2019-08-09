package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Secondservelet
 */
public class Secondservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Secondservelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    int counter=0;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gn= request.getParameter("guestName");
		String col= request.getParameter("color");
		
		counter++;
		response.setContentType("text/html");
		response.getWriter().println("<h1>Hello !"+gn);
	//	response.getWriter().println("<h1 font color=+col")
		
		response.getWriter().println("<h1>you are visitor number"+counter);
		
	}

}