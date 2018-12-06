package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.StatementMgr;
import bean.Location;


public class UpdateLocationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UpdateLocationServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String s1=request.getParameter("param");
		Location l= new Location();
		 l.setLocId(s1);
			l=StatementMgr.viewLocation(l);
			request.setAttribute("loc",l);	
	  RequestDispatcher rd = getServletContext().getRequestDispatcher("/UpdateLocation.jsp");
	  rd.forward(request, response);
	}


}
