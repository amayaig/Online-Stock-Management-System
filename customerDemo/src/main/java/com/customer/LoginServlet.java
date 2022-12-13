package com.customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String userName = request.getParameter("uid");      //uid = user name that entered by the user in the login form(login.jsp)
		String password = request.getParameter("pass");
		
		
		
		   
		
		try {
			List<Customer> cusDetails  = CustomerDBUtil.validate(userName, password);  //calling the validate method
			request.setAttribute("cusDetails", cusDetails);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		} 
		
		RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");  //give the page that needed to go from thr servlet
		dis.forward(request, response);
		
	}

}