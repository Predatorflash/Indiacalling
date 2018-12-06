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

/**
 * Servlet implementation class QueryDetailServlet
 */

public class QueryDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String s1=request.getParameter("param");
		if(s1.equalsIgnoreCase("p3"))
		{
	 ArrayList<Query> rs= new ArrayList<Query>();
		rs=StatementMgr.retriewQuery();
request.setAttribute("results", rs);
     RequestDispatcher rd = getServletContext().getRequestDispatcher("/FAQs.jsp");
     rd.forward(request, response);
		}
		
		else if(s1.equalsIgnoreCase("p"))
		{
			ArrayList<Query> row= new ArrayList<Query>();
			row=StatementMgr.retriewQuerys();
			request.setAttribute("results", row);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/AdminFAQs.jsp");
			rd.forward(request, response);
		}
		

		}
	}

