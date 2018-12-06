package controllers;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.StatementMgr;
import bean.Plan;


public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Plan l=new Plan();
		String s1=request.getParameter("type");
		String s2=request.getParameter("plantype");
		String s3=request.getParameter("plansubtype");
		String s4=request.getParameter("planname");
		String s5=request.getParameter("amount");
		String s6=request.getParameter("validity");
		
		l.setType(s1);
		l.setPlanType(s2);
		l.setPlanSubType(s3);
		l.setPlanName(s4);
		l.setAmount(s5);
		l.setValidity(s6);
	if((l.getType().equalsIgnoreCase("")&&l.getPlanType().equalsIgnoreCase("")&& l.getPlanType().equalsIgnoreCase(""))||l.getPlanName().equalsIgnoreCase("")||l.getAmount().equalsIgnoreCase("")||l.getValidity().equalsIgnoreCase(""))
	{
		RequestDispatcher rd=request.getRequestDispatcher("AddNewPlan.jsp");
		rd.forward(request, response);		  
	}	
	else
	{
	
	
	try {
		int flag=StatementMgr.addNewPlan(l);
		if(flag==1)
		{
			ArrayList<Plan> row= new ArrayList<Plan>();
			row=StatementMgr.displayPlan();
			request.setAttribute("results", row);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/AddPlan.jsp");
			rd.forward(request, response);		
		}
		else
		{
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/AddNewPlan.jsp");
			rd.forward(request, response);		
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}
	}
}
