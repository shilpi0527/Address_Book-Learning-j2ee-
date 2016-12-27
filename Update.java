

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	Connection con;
	Statement stmt;
	ResultSet rs;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String Name=request.getParameter("Name");
		String Address=request.getParameter("Address");
		String Email_Id=request.getParameter("Email_Id");
		String mob_num=request.getParameter("mob_num");
		
	        try
            {  
	        	
	        	Class.forName("com.mysql.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://localhost/shilpi", "root", "159753@Sp#");
	            stmt = con.createStatement();
	            stmt.executeUpdate("Update Address_book set Address='"+Address+"',Email_Id='"+Email_Id+"', mob_num='"+mob_num+"' where Name='"+Name+"'");
	            
	            response.sendRedirect("View.jsp");
	      
					
					
				
			
            }  
            catch (Exception e)
            {  
              out.println(e);  
            }  
 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
