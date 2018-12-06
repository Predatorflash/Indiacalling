package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import bean.Location;
import bean.Login;
import bean.Plan;
import bean.Query;

	public class StatementMgr {
		static Connection con;
			public  static int grantStmt(Login l) throws SQLException
			{
			 con=ConnectionMgr.grantConn();
				int i=0;
			
				 PreparedStatement ps=null;
				 try {
					ps=con.prepareStatement("insert into login values('user_'||userId.nextval,?,?,?,?,?)");
					ps.setString(1, l.getUserName());
					ps.setString(2, l.getPassword());
					ps.setString(3, l.getContactNo());
					ps.setString(4, l.getUserType());
					ps.setString(5, l.getEmail());
					i=ps.executeUpdate();
					 ConnectionMgr.releaseConn(con);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
					 return i;
		
		}	
			public  static ResultSet grantSet(Login l) 
			{
				con=ConnectionMgr.grantConn();
				ResultSet rs=null;
			PreparedStatement stmt=null;
			try{System.out.println("Str"+l.getUserName());
			System.out.println(l.getPassword());
			 stmt=con.prepareStatement("select userName,password,userType from login where userName=? and password=?" );
			stmt.setString(1, l.getUserName());
			stmt.setString(2, l.getPassword());
				 rs=stmt.executeQuery();
				
			}catch(SQLException e){
				e.printStackTrace();
			}
			return rs;	
		}	
			public  static ArrayList<Plan> displayPlan()
			{
				ArrayList<Plan> row= new ArrayList<Plan>();
				 con=ConnectionMgr.grantConn();
				ResultSet rs=null;
			PreparedStatement stmt=null;
			 try {
				stmt=con.prepareStatement("select * from plan");
				 rs=stmt.executeQuery();
				 while (rs.next()) { 
					  Plan pl=new Plan();
		              pl.setPlanId(rs.getString(1));
		              pl.setPlanName(rs.getString(2));
		              pl.setType(rs.getString(3));
		              pl.setPlanType(rs.getString(4));
		              pl.setPlanSubType(rs.getString(5));
		              pl.setAmount(rs.getString(6));
		              pl.setValidity(rs.getString(7));
		              row.add(pl);
		             
		}  ConnectionMgr.releaseConn(con);
				 //con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			return row;	
		}	
			public  static ResultSet grantSet1(Connection con) throws SQLException
			{
			//Login l=new Login();
				ResultSet rs=null;
			PreparedStatement stmt=null;
			 stmt=con.prepareStatement("select * from plan where planType='pre'");
				 rs=stmt.executeQuery();
			
			return rs;	
		}	
			public  static ResultSet grantSet2(Connection con) throws SQLException
			{
		
				ResultSet rs=null;
			PreparedStatement stmt=null;
			 stmt=con.prepareStatement("select * from plan where planType='pos'");
				 rs=stmt.executeQuery();
			
			return rs;	
		}
			public static ResultSet grantloc( Location lo) {
				ResultSet rs=null;
			con=ConnectionMgr.grantConn();
				PreparedStatement stmt=null;
				 try {
					stmt=con.prepareStatement("select * from location where city=?");
					stmt.setString(1,lo.getCity());
					 rs=stmt.executeQuery();
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return rs;	
			}
			public static ResultSet grantDrop(Connection con) {
				ResultSet rs=null;
				PreparedStatement stmt=null;
				 try {
					stmt=con.prepareStatement("select distinct city from location");
					 rs=stmt.executeQuery();
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return rs;	
			}
			public static ResultSet grantPlan() {
				ResultSet rs=null;
				 con=ConnectionMgr.grantConn();
				PreparedStatement stmt=null;
				 try {
					stmt=con.prepareStatement("select type,planSubType,planName,amount,validity  from plan where planType='pre' order by type,planSubType,amount asc");
					 rs=stmt.executeQuery();
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return rs;	
			}
			public static ResultSet grantPlanPost() {
				ResultSet rs=null;
		
				con=ConnectionMgr.grantConn();
				PreparedStatement stmt=null;
				 try {
					stmt=con.prepareStatement("select type,planSubType,planName,amount,validity  from plan where planType='post' order by type,planSubType,amount asc");
					 rs=stmt.executeQuery();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return rs;	
			}
			public static int writeQuery(Query q) throws SQLException {
				int i=0;
				con=ConnectionMgr.grantConn();
				 PreparedStatement ps=null;
				 try {
					ps=con.prepareStatement("insert into query values(queryId_seq.nextval,?,?,?,?,?,?,?)");
					ps.setString(1, q.getUserName());
					ps.setString(2, q.getUserCity());
					ps.setString(3, q.getUserMail());
					ps.setString(4,q.getContactNo());
					ps.setString(5,q.getUserQuery());
					ps.setString(6, q.getStatus());
					ps.setString(7,q.getAnswer());
					i=ps.executeUpdate();
					 ConnectionMgr.releaseConn(con);
					//con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
					 return i;
			}
			public  static ArrayList<Query> retriewQuery()
			{
				ArrayList<Query> row= new ArrayList<Query>();
			con=ConnectionMgr.grantConn();
				ResultSet rs=null;
			PreparedStatement stmt=null;
			 try {
				stmt=con.prepareStatement("select userName,userQuery,answer,status from query");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				 try {
					rs=stmt.executeQuery();
					 while (rs.next()) { 
						  Query pl=new Query();
			              pl.setUserName(rs.getString(1));
			              pl.setUserQuery(rs.getString(2));
			              pl.setAnswer(rs.getString(3));
			              pl.setStatus(rs.getString(4));
			              row.add(pl);
			} ConnectionMgr.releaseConn(con);
					 //con.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
				 return  row;
			}
			
			public static int deleteQuery(String s)  {
				
				int i=0;
			
				con=ConnectionMgr.grantConn();
				 PreparedStatement ps=null;
				 try {
					ps=con.prepareStatement("delete from query where queryid=? ");
					ps.setString(1,s);
					
					 i=ps.executeUpdate();
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 return i;
				
			}
			
			public  static ArrayList<Query> retriewQuerys()
			{
				ArrayList<Query> row= new ArrayList<Query>();
				 con=ConnectionMgr.grantConn();
				ResultSet rs=null;
			PreparedStatement stmt=null;
			 try {
				stmt=con.prepareStatement("select queryId,userName,userQuery,answer,status from query where status='unanswered'");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				 try {
					rs=stmt.executeQuery();
					 while (rs.next()) { 
						  Query pl=new Query();
						  pl.setQueryId(rs.getString(1));
			              pl.setUserName(rs.getString(2));
			              pl.setUserQuery(rs.getString(3));
			              pl.setAnswer(rs.getString(4));
			              pl.setStatus(rs.getString(5));
			              row.add(pl);
			} //con.close();
					 ConnectionMgr.releaseConn(con);
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
				
			
				 return  row;
			}
			public static int answerQuery(String s1,String s2) {
				int i=0;
		
				con=ConnectionMgr.grantConn();
				 PreparedStatement ps=null;
				 try {
					ps=con.prepareStatement("update query set answer=?,status='Answered' where queryId=? ");
					ps.setString(1,s2);
					ps.setString(2,s1);
					 i=ps.executeUpdate();
					//con.close();
					 ConnectionMgr.releaseConn(con);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 return i;
			}	
			public  static ArrayList<Query> answeredQuerys()
			{
				ArrayList<Query> row= new ArrayList<Query>();
				con=ConnectionMgr.grantConn();
				ResultSet rs=null;
			PreparedStatement stmt=null;
			 try {
				stmt=con.prepareStatement("select queryId,userName,userQuery,answer,status from query where status='unanswered'");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				 try {
					rs=stmt.executeQuery();
					 while (rs.next()) { 
						  Query pl=new Query();
						  pl.setQueryId(rs.getString(1));
			              pl.setUserName(rs.getString(2));
			              pl.setUserQuery(rs.getString(3));
			              pl.setAnswer(rs.getString(4));
			              pl.setStatus(rs.getString(5));
			              row.add(pl);
			}  ConnectionMgr.releaseConn(con);
					 //con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
				 return  row;
			}
			public  static int addNewPlan(Plan l) throws SQLException
			{
		 con=ConnectionMgr.grantConn();
				int i=0;
			
				 PreparedStatement ps=null;
				 try {
					ps=con.prepareStatement("insert into Plan values(planId_sequen.nextval,?,?,?,?,?,?)");
					
					ps.setString(1, l.getPlanName());
					ps.setString(2, l.getType());
					ps.setString(3, l.getPlanType());
					ps.setString(4, l.getPlanSubType());
					ps.setString(5, l.getAmount());
					ps.setString(6, l.getValidity());
					i=ps.executeUpdate();
			//con.close();
					 ConnectionMgr.releaseConn(con);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
					 return i;
		
		}
			public static int deletePlan(String s1) {
			 con=ConnectionMgr.grantConn();
				int i=0;
			
				 PreparedStatement ps=null;
				 try {
					ps=con.prepareStatement("delete from plan where planId=?");
					
					ps.setString(1,s1);
					 i=ps.executeUpdate();
					//con.close();
					 ConnectionMgr.releaseConn(con);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
					 return i;
		
		}
			public static Plan viewPlan(Plan p2) {
				 con=ConnectionMgr.grantConn();
			Plan p=new Plan();
				 PreparedStatement ps=null;
				 try {
					ps=con.prepareStatement("select * from plan where planid=?");
					ps.setString(1, p2.getPlanId());
					
					 ResultSet rs=ps.executeQuery();
							 while (rs.next()) { 
								
								  p.setPlanId(rs.getString(1));
					              p.setPlanName(rs.getString(2));
					              p.setType(rs.getString(3));
					              p.setPlanType(rs.getString(4));
					              p.setPlanSubType(rs.getString(5));
					              p.setAmount(rs.getString(6));
					              p.setValidity(rs.getString(7));               
					} 
						//con.close();
							 ConnectionMgr.releaseConn(con);
				} catch (SQLException e) {
					e.printStackTrace();
				}
		
					 return p;
			}
			public static int UpdatePlan(Plan p) {
				int i=0;
				
				con=ConnectionMgr.grantConn();
				 PreparedStatement ps=null;
				 try {
					ps=con.prepareStatement("update plan set type=?,plantype=?,plansubtype=?,planname=?,amount=?,validity=? where planId=? ");
				
					ps.setString(1,p.getType());
					ps.setString(2,p.getPlanType());
					ps.setString(3,p.getPlanSubType());
					ps.setString(4,p.getPlanName());
					ps.setString(5,p.getAmount());
					ps.setString(6,p.getValidity());
					ps.setString(7,p.getPlanId());
					 i=ps.executeUpdate();
					// con.close();
					 ConnectionMgr.releaseConn(con);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 return i;
			}
			public static ArrayList<Location> displayLocation() {
				ArrayList<Location> row= new ArrayList<Location>();
			con=ConnectionMgr.grantConn();
				ResultSet rs=null;
			PreparedStatement stmt=null;
			 try {
				stmt=con.prepareStatement("select * from location");
				
					rs=stmt.executeQuery();
					 while (rs.next()) { 
						  Location pl=new Location();
						 pl.setLocId(rs.getString(1));
						 pl.setCity(rs.getString(2));
			              pl.setStoreName(rs.getString(3));
			              pl.setStoreAddress(rs.getString(4));
			              pl.setContactNo(rs.getString(5));
			              
			              row.add(pl);
			}  //con.close();
					 ConnectionMgr.releaseConn(con);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
				 return  row;
			}
			public static int addLoc(Location l) {
			 con=ConnectionMgr.grantConn();
				int i=0;
			
				 PreparedStatement ps=null;
				 try {
					ps=con.prepareStatement("insert into location values(locid_seq.nextval,?,?,?,?)");
					
				
					ps.setString(1, l.getCity());
					ps.setString(2, l.getStoreName());
					ps.setString(3, l.getStoreAddress());
					ps.setString(4, l.getContactNo());
					 i=ps.executeUpdate();
				
			//con.close();
					 ConnectionMgr.releaseConn(con);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
					 return i;
			}
			public static int deleteLocation(String s1) {
			 con=ConnectionMgr.grantConn();
				int i=0;
			
				 PreparedStatement ps=null;
				 try {
					ps=con.prepareStatement("delete from location where locId=?");
					
					ps.setString(1,s1);
					 i=ps.executeUpdate();
					// con.close();
					 ConnectionMgr.releaseConn(con);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
					 return i;
			}
			public static Location viewLocation(Location l) {
			 con=ConnectionMgr.grantConn();
				Location p=new Location();
					 PreparedStatement ps=null;
					 try {
						ps=con.prepareStatement("select * from location where locid=?");
						ps.setString(1, l.getLocId());
						
						 ResultSet rs=ps.executeQuery();
								 while (rs.next()) { 
									
									  p.setLocId(rs.getString(1));
						              p.setCity(rs.getString(2));
						              p.setStoreName(rs.getString(3));
						              p.setStoreAddress(rs.getString(4));
						              p.setContactNo(rs.getString(5));
						}  ConnectionMgr.releaseConn(con);
								// con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
			
						 return p;
			}
			public static int UpdateLocation(Location p) {
				int i=0;
				
				con=ConnectionMgr.grantConn();
				 PreparedStatement ps=null;
				 try {
					ps=con.prepareStatement("update location set city=?,storename=?,storeaddress=?,contactno=?where locId=? ");
				
					ps.setString(1,p.getCity());
					ps.setString(2,p.getStoreName());
					ps.setString(3,p.getStoreAddress());
					ps.setString(4,p.getContactNo());
					ps.setString(5,p.getLocId());
					
					 i=ps.executeUpdate();
					 ConnectionMgr.releaseConn(con);
			//	con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 return i;
			}
			public static ArrayList<Plan> displayPlanInOrder() {
				ArrayList<Plan> row= new ArrayList<Plan>();
			con=ConnectionMgr.grantConn();
				ResultSet rs=null;
			PreparedStatement stmt=null;
			 try {
				stmt=con.prepareStatement("select * from plan order by plantype desc");
				 rs=stmt.executeQuery();
				 while (rs.next()) { 
					  Plan pl=new Plan();
					  pl.setPlanId(rs.getString(1));
					   pl.setPlanType(rs.getString(4));
		        
		              pl.setType(rs.getString(3));
		           
		              pl.setPlanSubType(rs.getString(5));
		              pl.setPlanName(rs.getString(2));
		              pl.setAmount(rs.getString(6));
		              pl.setValidity(rs.getString(7));
		              row.add(pl);
		}  //con.close();
				 ConnectionMgr.releaseConn(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			return row;	
	}
			public static int AddSubscribe(Plan p,Login l) {
			con=ConnectionMgr.grantConn();
				int i=0;
				
				 PreparedStatement ps=null;
				 try {
					ps=con.prepareStatement("insert into history values(?,?)");
					
				
					ps.setString(1,l.getUserName());
					ps.setString(2, p.getPlanId());
					 i=ps.executeUpdate();
					 ConnectionMgr.releaseConn(con);
					//con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
					 return i;
			}
			public  static ArrayList<Plan> retriewPreHistory(Plan p2,Login l)
			{
				ArrayList<Plan> row= new ArrayList<Plan>();
			con=ConnectionMgr.grantConn();
				ResultSet rs=null;
			PreparedStatement stmt=null;
			 try {
				stmt=con.prepareStatement("select distinct p.type,p.planType,p.planSubType,p.planName,p.amount,p.validity from plan p,history h where h.planid=p.planid and plantype=? and username=?");
				stmt.setString(1,p2.getPlanType());
				stmt.setString(2,l.getUserName());
				rs=stmt.executeQuery();
				 while (rs.next()) { 
					  Plan p=new Plan();
		              p.setType(rs.getString(1));
		              p.setPlanType(rs.getString(2));
		              p.setPlanSubType(rs.getString(3));
		              p.setPlanName(rs.getString(4));
		              p.setAmount(rs.getString(5));
		              p.setValidity(rs.getString(6));
		              row.add(p);
				 } 
				 //con.close();
				 ConnectionMgr.releaseConn(con);
				
			 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
				 return  row;
			}
	}