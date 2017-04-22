

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
 * Servlet implementation class bookFlight
 */
public class bookFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bookFlight() {
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
		String arr[]=new String[12];
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_mng","root","root");
			Statement stmt=con.createStatement();			
			
			arr[0] = (String)request.getParameter("R_CODE");
			arr[1] = (String)request.getParameter("P_ID");
			arr[2] = (String)request.getParameter("F_CODE");
			arr[3] = (String)request.getParameter("date_of_reservation");
			arr[4] = (String)request.getParameter("seats_reserved");
			arr[5] = (String)request.getParameter("class");
			arr[6] = (String)request.getParameter("price");
			
			for(int i=0;i<6;i++)
			{
				System.out.println(arr[i]);
			}
			
			
			String fields = "(R_CODE,P_ID,F_CODE,date_of_reservation,seats_reserved,class,price)";
			
			//String query = "select emailId from userLogin;";
			
			String sql = "insert into flight_reservations "+fields + " values('"+arr[0]+"','"+arr[1]+"','"+arr[2]+"','"+arr[3]+"','"+arr[4]+"','"+arr[5]+"','"+arr[6]+"');";
			int rs=stmt.executeUpdate(sql);
			boolean st;
			if(rs==1)
			{
				st=true;
			}
			else
			{
				st=false;
			}
			
			
			if(st)
			{
				out.println("Ticket Booked");
				out.println("Flight Booked");
				RequestDispatcher rd = request.getRequestDispatcher("Airline.jsp");
			    rd.forward(request, response); 
			}
			else
			{
				
				out.write("Values are Missing");
				RequestDispatcher rd = request.getRequestDispatcher("viewFlights.jsp");
			    rd.include(request, response);
			}
			
			
			System.out.println("Done");
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
