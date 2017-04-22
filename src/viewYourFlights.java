

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
 * Servlet implementation class viewYourFlights
 */
public class viewYourFlights extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewYourFlights() {
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
			
			
			
			
			String r_code=request.getParameter("R_CODE");
			System.out.println(r_code);
			
			String fields = "R_CODE,P_ID,F_CODE,date_of_reservation,seats_reserved,class,price";
			
			//String query = "select emailId from userLogin;";
			
			String sql = "select "+fields + " from flight_reservations where R_CODE= '" +r_code+ "';";
			ResultSet rs = stmt.executeQuery(sql);
			arr[0]="";
			while(rs.next())
			{
				for(int i=1;i<=7;i++)
				{
					arr[i]= rs.getString(i);
					System.out.println(arr[i]);
				}
			}
			
			request.setAttribute("R_CODE", arr[1]);
			request.setAttribute("P_ID", arr[2]);
			request.setAttribute("F_CODE", arr[3]);
			request.setAttribute("date_of_reservation", arr[4]);
			request.setAttribute("seats_reserved", arr[5]);
			request.setAttribute("class", arr[6]);
			request.setAttribute("price", arr[7]);
			
			RequestDispatcher rd = request.getRequestDispatcher("viewYourFlights.jsp");
		    rd.include(request, response);
		    
			
			
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
