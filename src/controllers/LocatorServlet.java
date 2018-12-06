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
import database.StatementMgr;
import bean.Location;

/**
 * Servlet implementation class LocatorServlet
 */

public class LocatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LocatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
	
		String s1=request.getParameter("loc");
		
	
		Location lo=new Location();
		lo.setCity(s1);
	
	 ArrayList<Location> row= new ArrayList<Location>();
	ResultSet rs=StatementMgr.grantloc(lo);
	int flag=0;
	try {
		  while (rs.next()) { 
			  Location l=new Location();
              l.setCity(rs.getString(1));
              l.setStoreName(rs.getString(2));
              l.setStoreAddress(rs.getString(3));
              l.setContactNo(rs.getString(4));
              row.add(l);
              flag=1;
              System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3)+rs.getString(4));
              
}
if(flag==1)
{

request.setAttribute("results", row);
     RequestDispatcher rd = getServletContext().getRequestDispatcher("/LocatorJsp.jsp");
     rd.forward(request, response);
}
else
{
	RequestDispatcher rd = getServletContext().getRequestDispatcher("/Locator.jsp");
    rd.forward(request, response);
}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
