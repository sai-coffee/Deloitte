package com;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitee.cms.model.Customer;
import com.deloitte.cms.dao.impl.CustomerDAOimpl;
import com.deloitte.dao.CustomerDAO;

/**
 * Servlet implementation class CustomerServelet
 */
public class CustomerServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int gn= Integer.parseInt(request.getParameter("customerId"));
		String name= request.getParameter("customerName");
		String add= request.getParameter("customerAddress");
		int billAmt= Integer.parseInt(request.getParameter("billAmount"));
		
		Customer customer = new Customer(gn,name,add,billAmt);
		CustomerDAO customerDAO= new CustomerDAOimpl();
		boolean red=customerDAO.insertCustomer(customer);
		if(red)
		{
			response.getWriter().println("record saved");
		}
		else
		{
			response.getWriter().println("record not saved");
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
}
