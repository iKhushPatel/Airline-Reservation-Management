

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewDetails
 */
public class ViewDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewDetails() {
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
		
		try{
			
			
			
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta content=\"text/html; charset=ISO-8859-1\"");
			out.println("http-equiv=\"content-type\">");
			out.println("<title>zcdzfd</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<form method=\"post\" name=\"ViewDetails\"><br>");
			out.println("ID:"+2);
			out.println("  <input size=\"5\" type=\"text\"><br>");
			out.println("First Name :   <input name=\"\" type=\"text\"> Middle Name : <input");
			out.println("name=\"\" type=\"text\"> Last Name :<input name=\"\" type=\"text\"><br>");
			out.println("Address :       <textarea rows=\"5\" cols=\"30\">" +""); 
			out.println(" "); 
			out.println("City :"); 
			out.println("State :"); 
			out.println("Pincode  :"); 
			out.println("Contact No :  "); 
			out.println("Email Id : "); 
			out.println("DOB :"); 
			out.println("Age :"); 
			out.println("Gender"); 
			out.println(""); 
			out.println(""); 
			out.println(""); 
			out.println(""); out.println(""); out.println(""); out.println(""); 
			
			
			
			
			
		}	
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
