

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RetriveSpecificData
 */
public class RetriveSpecificData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetriveSpecificData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String arr[] = new String[13];
		try{
			
			String pid= (String) request.getParameter("SearchId");
			System.out.println(pid);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_mng","root","root");
			Statement stmt=con.createStatement();			
		
			
			String sql= " select p_id,first_name,middle_name,last_name,address,city,state,pincode,contact_no,emailId, data_of_birth,age from passenger_master where p_id='"+pid+"';";
		      //String query = "select emailId from userLogin;";
		
			ResultSet rs=stmt.executeQuery(sql);
			rs.next();
			
			/*while(rs.next())
			{
				for(int i=0;i<12;i++)
				{
					//System.out.println(rs.getString(i+1));					
				}
			
			}*/
			
			for(int i=0;i<=12;i++)
	    	{
	    		arr[i]=rs.getString(i+1);
	    		
	    	}
	        
			request.setAttribute("p_id", arr[0]);
			
		     request.setAttribute("first_name", arr[2]);
		      request.setAttribute("middle_name", arr[3]);
		      request.setAttribute("surname", arr[4]);
		      request.setAttribute("address", arr[5]);
		      request.setAttribute("city", arr[6]);
		      request.setAttribute("state", arr[7]);
		      request.setAttribute("pincode", arr[8]);
		      request.setAttribute("contact_no", arr[9]);
		      request.setAttribute("email_id", arr[10]);
		      request.setAttribute("data_of_birth", arr[11]);
		      request.setAttribute("age", arr[12]);
	      
			
			
			RequestDispatcher rd = request.getRequestDispatcher("ShowPassengerDetails.jsp");
		    rd.forward(request, response); 
			
			 
		}
		catch(SQLException e)
		{
			e.printStackTrace();	
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
