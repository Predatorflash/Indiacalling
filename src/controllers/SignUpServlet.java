package controllers;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.StatementMgr;
import bean.Login;


public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SignUpServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Login l=new Login();
		String s1=request.getParameter("uname1");
	String s2=request.getParameter("contact1");
	String s3=request.getParameter("pass1");
	String s4=request.getParameter("email1");
	if(s1.equalsIgnoreCase("")||s2.equalsIgnoreCase("")||s3.equalsIgnoreCase("")||s4.equalsIgnoreCase(""))
	{
		RequestDispatcher rd=request.getRequestDispatcher("Login.html");
		rd.forward(request, response);
	}
	else
	{
	l.setUserName(s1);
	l.setContactNo(s2);
	l.setPassword(s3);
	l.setUserType("C");
	l.setEmail(s4);
	try {
		int st1=StatementMgr.grantStmt(l);
		if(st1==1)
		{
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.forward(request, response);
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}

	
	}
		
	}

}
