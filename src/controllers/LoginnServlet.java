package controllers;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.StatementMgr;
import bean.Login;

/**
 * Servlet implementation class LoginnServlet
 */

public class LoginnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public LoginnServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int flag = 0;
		String param=request.getParameter("param");
		Login l=new Login();
		String s1=request.getParameter("uname");	
	String s2=request.getParameter("passwd");
	System.out.println(s1);
	System.out.println(s2);
	HttpSession session=request.getSession();
	session.setAttribute("username", s1);
	l.setUserName(s1);
	l.setPassword(s2);
if(param.equalsIgnoreCase("login"))
{
	if((l.getUserName().equalsIgnoreCase("")&& l.getPassword().equalsIgnoreCase(""))||l.getUserName().equalsIgnoreCase("")||l.getPassword().equalsIgnoreCase(""))
	{
		RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
		rd.forward(request, response);
		  
	}
	
	else
	{
	
	try {
	
		ResultSet r=StatementMgr.grantSet(l);
		
		while(r.next())
		{
			String u=r.getString(1);
			String p=r.getString(2);
			String uT=r.getString(3);
			System.out.println("hello"+uT);
	
		if(u.equalsIgnoreCase(l.getUserName())&& p.equalsIgnoreCase(l.getPassword()) && uT.equalsIgnoreCase("A"))
			{
		
				flag=1;
			}
			else
				if(u.equalsIgnoreCase(l.getUserName())&& p.equalsIgnoreCase(l.getPassword()) && uT.equalsIgnoreCase("C"))
				{
					flag=2;	
				}
			
				
		}		
		
		if(flag==1)
		{
			RequestDispatcher rd=request.getRequestDispatcher("Admin.jsp");
			rd.forward(request, response);
		}
		else
			
		if(flag==0){
			
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");  
			rd.forward(request, response);
		}
		else
			if(flag==2)
			{
				
				RequestDispatcher rd=request.getRequestDispatcher("User.jsp");
				rd.forward(request, response);
			}
		
	}	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

	} else if(param.equalsIgnoreCase("logout"))
	{
		session.invalidate();
		RequestDispatcher rd=request.getRequestDispatcher("Login.html");
		rd.forward(request, response);
	}
	else if(param.equalsIgnoreCase("Alogout"))
	{
		session.invalidate();
		RequestDispatcher rd=request.getRequestDispatcher("Login.html");
		rd.forward(request, response);
	}
}	
}

