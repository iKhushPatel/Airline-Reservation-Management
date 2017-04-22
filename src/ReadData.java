

import java.io.IOException;
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
 * Servlet implementation class ReadData
 */
public class ReadData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadData() {
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
		
		String arr[]=new String[13];
		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_mng","root","root");
		      System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();
		      String p_id=request.getParameter("p_id");
		      //String sql = "SELECT emailId,password from userlogin";
		      String sql= " select p_id,first_name,middle_name,last_name,address,city,state,pincode,contact_no,emailId, data_of_birth,age from passenger_master where p_id='"+p_id+"';";
		      		//" where p_id='"+p_id+"';";
		      
		      ResultSet rs = stmt.executeQuery(sql);
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		         /*name  = rs.getString("name");
		         password = rs.getString("password");*/
		    	   
		    	System.out.println("\n\n");
		    	String str;
		    	for(int i=0;i<12;i++)
		    	{
		    		arr[i]=rs.getString(i+1);
		    		
		    	}
		        
		         //Display values
		         //System.out.print("Name: " + name);
		         //System.out.print(", Password: " + password + "\n");
		      }
		      //request.setAttribute("p_id", arr[0]);
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
		      
		      
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		//return arr;
	}

}
