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


public class DeletePlanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeletePlanServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	

	
		response.setContentType("text/html");
		String s1=request.getParameter("id");
	
		int flag=0;
		ArrayList<Plan> row= new ArrayList<Plan>();
		flag=StatementMgr.deletePlan(s1);
		if(flag==1)
		{
			row=StatementMgr.displayPlan();
			 request.setAttribute("results", row);
			 RequestDispatcher rd = getServletContext().getRequestDispatcher("/DisplayDelete.jsp");
			 rd.forward(request, response);
		 }
		else
		{  
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/DisplayDelete.jsp");
		       rd.forward(request, response);
		}
	}
	}


