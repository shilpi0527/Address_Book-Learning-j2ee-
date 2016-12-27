

import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Updatee
 */
@WebServlet("/Updatee")
public class Updatee extends HttpServlet {
	Connection con;
	ResultSet rs;
	Statement stmt;
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updatee() {
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
		
	        try
            {  
	        	
	        	Class.forName("com.mysql.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://localhost/shilpi", "root", "159753@Sp#");
	            stmt = con.createStatement();
	            rs=stmt.executeQuery("Select * from Address_book where Name='"+Name+"'");
	            if(rs.next())
	            {
	            	out.print("<Form action='Update'>");
	            	out.print("<table width=30% height=25% border=2 bgcolor= lavender align=center>");
	            	out.print("<tr><td>Name<input type=text name= 'Name' value='"+rs.getString(1)+"'><br></td></tr>");
	            	out.print("<tr><td>Address <input type=text name= 'Address' value='"+rs.getString(2)+"'><br></td></tr>");
	            	out.print("<tr><td>Email_Id <input type=text name= 'Email_Id' value='"+rs.getString(3)+"'><br></td></tr>");
	            	out.print("<tr><td>mob_num <input type=text name= 'mob_num' value='"+rs.getString(4)+"'><br></td></tr>");
	            	out.print("<tr><td><input type=submit name=n6 value=SUBMIT></td></tr>");
	      
	            }	      
            }
	        catch(Exception e)
	        {
	        	out.print(e);
	        }
					
				
			
            
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
