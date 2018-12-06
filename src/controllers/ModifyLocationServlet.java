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

/**
 * Servlet implementation class ModifyLocationServlet
 */

public class ModifyLocationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyLocationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String s1=request.getParameter("locid");
		String s2=request.getParameter("city");
		String s3=request.getParameter("storename");
		String s4=request.getParameter("storeaddress");
		String s5=request.getParameter("contactno");
		
		Location p=new Location();
		p.setLocId(s1);
		p.setCity(s2);
		p.setStoreName(s3);
		p.setStoreAddress(s4);
		p.setContactNo(s5);
		
	
		ArrayList<Location> row= new ArrayList<Location>();
int flag=StatementMgr.UpdateLocation(p);
		if(flag==1)
		{

			row=StatementMgr.displayLocation();
			 request.setAttribute("results", row);
			 RequestDispatcher rd = getServletContext().getRequestDispatcher("/LocationDelete.jsp");
			 rd.forward(request, response);
		}
		else
		{
			row=StatementMgr.displayLocation();
			 request.setAttribute("results", row);
			 RequestDispatcher rd = getServletContext().getRequestDispatcher("/LocationDelete.jsp");
			 rd.forward(request, response);
		}
		}
	}



