package controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.StatementMgr;
import bean.Query;


public class WriteToUsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("sadasdasd");
		
		response.setContentType("text/html");
		Query q=new Query();
		String s1=request.getParameter("name");
	String s2=request.getParameter("city");
	String s3=request.getParameter("mail");
	String s4=request.getParameter("contact");
	String s5=request.getParameter("message");
	System.out.println(s1+s2+s3+s4+s5);
	if(s1.equalsIgnoreCase("")||s2.equalsIgnoreCase("")||s3.equalsIgnoreCase("")||s4.equalsIgnoreCase("")||s5.equalsIgnoreCase(""))
	{	
		RequestDispatcher rd=request.getRequestDispatcher("WriteToUs.jsp");
		rd.forward(request, response);
	}
	else
	{	
	q.setUserName(s1);
	q.setUserCity(s2);
	q.setUserMail(s3);
	q.setContactNo(s4);
	q.setUserQuery(s5);
	q.setStatus("unanswered");
	q.setAnswer("");
	try {
		int st1=StatementMgr.writeQuery(q);

		if(st1==1)
		{
			RequestDispatcher rd=request.getRequestDispatcher("indexeff.html");
			rd.forward(request, response);
		}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	}
		
	
	}

}
