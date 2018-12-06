package controllers;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.StatementMgr;
import bean.Login;
import bean.Plan;

public class PlanSubscribeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public PlanSubscribeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		String username=(String) session.getAttribute("username");
		String amm=request.getParameter("amm");
		session.setAttribute("Rcamt",amm);
		String planid=request.getParameter("param");
		String plantype=request.getParameter("plantype");
		session.setAttribute("plantype",plantype);
		Plan p=new Plan();
		Login l=new Login();
		p.setPlanType(plantype);
		p.setPlanId(planid);
		l.setUserName(username);
			StatementMgr.AddSubscribe(p,l);
				 ArrayList<Plan> rs= new ArrayList<Plan>();
					rs=StatementMgr.displayPlanInOrder();
					request.setAttribute("results", rs);
		     RequestDispatcher rd = request.getRequestDispatcher("/SubscribeRecharge.jsp");
		     rd.forward(request, response);
		
		
		
			
			
	}
	}

