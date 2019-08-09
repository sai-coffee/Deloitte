package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Welcome() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	int counter = 0;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
   		String gn= request.getParameter("guestName");
   		String color[]= request.getParameterValues("color");
   		
   		counter++;
   		response.setContentType("text/html");
   		if(color==null)
   		{
   			response.getWriter().println("No colour selected");
   		}
   		else
   			
   				for(String c:color)
   				{
   					response.getWriter().println("<br/><font color ="+ c +">Hello"+gn+"In sai's website");
   					
   				}
   		response.getWriter().println("<h1>you are visitor number"+counter);
   		
   				}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("do get");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("do post");
		doGet(request, response);
	}
	
   		
   	
	}


