package controllers;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import database.StatementMgr;
import bean.Plan;


public class UpdatePlanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public UpdatePlanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	String s1=request.getParameter("param");
	Plan p= new Plan();
	 p.setPlanId(s1);
		p=StatementMgr.viewPlan(p);
		request.setAttribute("plan",p);	
  RequestDispatcher rd = getServletContext().getRequestDispatcher("/UpdatePlan.jsp");
  rd.forward(request, response);
	}

}
