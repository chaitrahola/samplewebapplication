package com.niit.loginapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("calling do get method"); //display method on console not on webpage
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("calling dopost method");
		
		String UserName=(String) request.getParameter("UserName");
		String password=(String) request.getParameter("password");
		
		System.out.println("UserName:" +UserName);
		System.out.println("Password:" +password);
		
		if(UserName.equals("niit")&&password.equals("niit"))
		{ System.out.println("credentials are correct");
		
		}
		else 
		System.out.println(" Invalid credentials");
			
	}

}
