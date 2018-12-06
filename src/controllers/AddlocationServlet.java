package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.StatementMgr;
import bean.Location;


public class AddlocationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AddlocationServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value=request.getParameter("param");	
		if(value.equalsIgnoreCase("addloc"))
		{
					ArrayList<Location> row= new ArrayList<Location>();
					row=StatementMgr.displayLocation();		 
		request.setAttribute("results", row);
		     RequestDispatcher rd = request.getRequestDispatcher("/DisplayLocation.jsp");
		     rd.forward(request, response);
		}
	else if(value.equalsIgnoreCase("delloc"))
	{
		ArrayList<Location> row= new ArrayList<Location>();
		row=StatementMgr.displayLocation(); 
request.setAttribute("results", row);
 RequestDispatcher rd = getServletContext().getRequestDispatcher("/LocationDelete.jsp");
 rd.forward(request, response);
	}
	else if(value.equalsIgnoreCase("addnewLocation"))
	{
	
		String city=request.getParameter("city");	
		String storeName=request.getParameter("storeName");	
		String storeAddress=request.getParameter("storeAddress");	
		String contactNo=request.getParameter("contactNo");	
		Location l=new Location();
		l.setCity(city);
		l.setStoreName(storeName);
		l.setStoreAddress(storeAddress);
		l.setContactNo(contactNo);
		ArrayList<Location> arr= new ArrayList<Location>();
		StatementMgr.addLoc(l);
		 arr=StatementMgr.displayLocation();
request.setAttribute("results", arr);
 RequestDispatcher rd = getServletContext().getRequestDispatcher("/DisplayLocation.jsp");
 rd.forward(request, response);
	}
	
	}
}
