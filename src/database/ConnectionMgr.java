package database;



	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMgr {
	static Connection conn;
		public static Connection grantConn( ) {
			try
			{System.out.println("I am in grantconnection");
				Class.forName("oracle.jdbc.driver.OracleDriver");
				 try {
					conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","flash","flash");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		 
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			return conn;
		}	
		public static  void releaseConn(Connection c)
		{
			try
			{System.out.println("I am in releaseconnection");
			    c.close();
			    //System.out.println("released" );	
			   
			}
			catch (SQLException sqle) 
			{
			    System.out.println("SQL Exception thrown: " + sqle);	
			}
			
		}
	}


