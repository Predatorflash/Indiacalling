package controllers;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import database.StatementMgr;
import bean.Query;

public class AnswerQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AnswerQueryServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String s1=(String) request.getSession().getAttribute("Id");
		String s2=request.getParameter("ans");
		int flag=0;
		flag=StatementMgr.answerQuery(s1,s2);
			if(flag==1)
			{
				ArrayList<Query> row= new ArrayList<Query>();
				row=StatementMgr.answeredQuerys();
				request.setAttribute("results", row);
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/AdminFAQs.jsp");
				rd.forward(request, response);
			}
		else
			{ 
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/AdminFAQs.jsp");
				rd.forward(request, response);
			}	
	}	
}
