

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
 * Servlet implementation class viewFlights
 */
public class viewFlights extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewFlights() {
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
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_mng","root","root");
			Statement stmt=con.createStatement();			
			
			//String origin= request.getParameter("origin");
			//String destination = request.getParameter("destination");
			String origin = "Ahmedabad";
			String destination = "Kolkata";
			
			//String query = "select emailId from userLogin where emailId='" + emailId + "' and password='" + password +"'";
			//String query = "select emailId from userLogin;";
			String query = "select F_CODE,manufacturer,model,origin,destination,start_date,departure_time,arrival_time,no_of_seats,services,review from flight_details where origin='"+origin+"' and destination = '"+destination+"';";
			ResultSet rs=stmt.executeQuery(query);
			boolean st=rs.next();
			String arr[]= new String[12];
			arr[0]="";
			if(st)
			{
				do
				{
					for(int i=1;i<12;i++)
					{
						arr[i]=rs.getString(i);
						System.out.println(arr[i]);
						
					}
				}while(rs.next());
				
					request.setAttribute("F_CODE", arr[1]);
					request.setAttribute("manufacturer", arr[2]);
					request.setAttribute("model", arr[3]);
					request.setAttribute("origin", arr[4]);
					request.setAttribute("destination", arr[5]);
					request.setAttribute("start_date", arr[6]);
					request.setAttribute("departure_time", arr[7]);
					request.setAttribute("arrival_time", arr[8]);
					request.setAttribute("no_of_seats", arr[9]);
					request.setAttribute("services", arr[10]);
					request.setAttribute("review", arr[11]);
			     
				
				
				RequestDispatcher rd = request.getRequestDispatcher("showFlights.jsp");
			    rd.include(request, response);
				 
			}
			else
			{
				
				out.write("Flights not available");
				RequestDispatcher rd = request.getRequestDispatcher("viewFlights.jsp");
			    rd.include(request, response);
			}
			
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
