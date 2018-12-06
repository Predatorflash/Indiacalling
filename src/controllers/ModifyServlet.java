package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.StatementMgr;
import bean.Plan;


public class ModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String s1=request.getParameter("planid");
		String s2=request.getParameter("type");
		String s3=request.getParameter("plantype");
		String s4=request.getParameter("plansubtype");
		String s5=request.getParameter("planname");
		String s6=request.getParameter("amount");
		String s7=request.getParameter("validity");
		Plan p=new Plan();
		p.setPlanId(s1);
		p.setType(s2);
		p.setPlanType(s3);
		p.setPlanSubType(s4);
		p.setPlanName(s5);
		p.setAmount(s6);
		p.setValidity(s7);
	
		ArrayList<Plan> row= new ArrayList<Plan>();
int flag=StatementMgr.UpdatePlan(p);
		if(flag==1)
		{

			row=StatementMgr.displayPlan();
			 request.setAttribute("results", row);
			 RequestDispatcher rd = getServletContext().getRequestDispatcher("/DisplayDelete.jsp");
			 rd.forward(request, response);
		}
		else
		{
			row=StatementMgr.displayPlan();
			 request.setAttribute("results", row);
			 RequestDispatcher rd = getServletContext().getRequestDispatcher("/DisplayDelete.jsp");
			 rd.forward(request, response);
		}
		}
		
	}

	

