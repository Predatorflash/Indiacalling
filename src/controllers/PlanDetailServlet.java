package controllers;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
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

/**
 * Servlet implementation class PlanDetailServlet
 */

public class PlanDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PlanDetailServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		HttpSession session = request.getSession();
String amount=request.getParameter("p");
		
		
		session.setAttribute("amount", amount);
		String amt=request.getParameter("pay");
		session.setAttribute("amt", amt);
		Plan p = new Plan();
		Login l=new Login();
		String uname = (String) session.getAttribute("username");
		l.setUserName(uname);
		String s1 = request.getParameter("param");
		if (s1.equalsIgnoreCase("p1")) {

			ArrayList<Plan> row = new ArrayList<Plan>();
			ResultSet rs = StatementMgr.grantPlan();
			int flag = 0;
			try {
				while (rs.next()) {
					Plan pl = new Plan();
					pl.setPlanName(rs.getString(3));
					pl.setType(rs.getString(1));
					pl.setPlanSubType(rs.getString(2));
					pl.setAmount(rs.getString(4));
					pl.setValidity(rs.getString(5));
					row.add(pl);
					flag = 1;
				}
				if (flag == 1) {
					request.setAttribute("results", row);
					RequestDispatcher rd = request.getRequestDispatcher("Prepaid.jsp");
					rd.forward(request, response);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (s1.equalsIgnoreCase("p2")) {

			ArrayList<Plan> row = new ArrayList<Plan>();
			ResultSet rs = StatementMgr.grantPlanPost();
			int flag = 0;
			try {
				while (rs.next()) {
					Plan pl = new Plan();
					pl.setPlanName(rs.getString(3));
					pl.setType(rs.getString(1));
					pl.setPlanSubType(rs.getString(2));
					pl.setAmount(rs.getString(4));
					pl.setValidity(rs.getString(5));
					row.add(pl);
					flag = 1;
				}
				if (flag == 1) {
					request.setAttribute("results", row);
					RequestDispatcher rd = getServletContext()
							.getRequestDispatcher("/Postpaid.jsp");
					rd.forward(request, response);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (s1.equalsIgnoreCase("plans")) {
			

			ArrayList<Plan> rs = new ArrayList<Plan>();
			rs = StatementMgr.displayPlanInOrder();
			request.setAttribute("results", rs);
			RequestDispatcher rd = request.getRequestDispatcher(
					"/Subscribe.jsp");
			rd.forward(request, response);
		} else if (s1.equalsIgnoreCase("prepaid")) {
			Plan c=new Plan();
			c.setPlanType("pre");
			ArrayList<Plan> rs = new ArrayList<Plan>();
			rs = StatementMgr.retriewPreHistory(c,l);
			request.setAttribute("prepaid", rs);
			RequestDispatcher rd = request.getRequestDispatcher(
					"/PrepaidRecharge.jsp");
			rd.forward(request, response);
		}
		if (s1.equalsIgnoreCase("postpaid")) {
			p.setPlanType("post");
			ArrayList<Plan> rs = new ArrayList<Plan>();
			rs = StatementMgr.retriewPreHistory(p,l);
			request.setAttribute("postpaid", rs);
			RequestDispatcher rd = request.getRequestDispatcher(
					"PostpaidRecharge.jsp");
			rd.forward(request, response);
		}
		else 
			if(s1.equalsIgnoreCase("recharge"))
			{
				RequestDispatcher rd = request.getRequestDispatcher("/RechargePrepaid.jsp");
			     rd.forward(request, response);
			}
			else
				if(s1.equalsIgnoreCase("bill"))
				{
					RequestDispatcher rd = getServletContext().getRequestDispatcher("/Recharge.jsp");
				     rd.forward(request, response);
				}
				else if(s1.equalsIgnoreCase("add"))
				{
					ArrayList<Plan> row= new ArrayList<Plan>();
					row=StatementMgr.displayPlan();
				 
		request.setAttribute("results", row);
		     RequestDispatcher rd = getServletContext().getRequestDispatcher("/AddPlan.jsp");
		     rd.forward(request, response);
				}
				else if(s1.equalsIgnoreCase("del"))
				{
					ArrayList<Plan> row= new ArrayList<Plan>();
					row=StatementMgr.displayPlan();
				 
			request.setAttribute("results", row);
			 RequestDispatcher rd = getServletContext().getRequestDispatcher("/DisplayDelete.jsp");
			 rd.forward(request, response);
				}

	}
}
