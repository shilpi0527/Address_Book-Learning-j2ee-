

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class View
 */
@WebServlet("/View")
public class View extends HttpServlet {
	Connection con;
	Statement stmt;
	ResultSet rs;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public View() {
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
	      
	    
	        try 
	        
	        {	
	            Class.forName("com.mysql.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://localhost/shilpi", "root", "159753@Sp#");
	          stmt = con.createStatement();
	   
	         out.print("<tr height=25%><td colspan=2><jsp:include page='Welcome.html'/></td></tr></table>"); 
	         
	         out.println("<table width=50% border =3>");
	          ResultSet rs = stmt.executeQuery("select * from address_book");
	          
	          while(rs.next())
	          {
	        	  
	        	  out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td>");
	        	  out.print("<td><a href='Delete?Name="+rs.getString(1)+"'>Delete</a></td>");
	        	  out.print("<td><a href='Updatee?Name="+rs.getString(1)+"'>Update</a></td></tr>");
	          }
	         
	          
	          	out.print("</table>");
	        	
	
	        	
	   
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
