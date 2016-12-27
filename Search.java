

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

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	Connection con;
	Statement stmt;
	ResultSet rs;
	

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Name = request.getParameter("Name");
		response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        try {
        	
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/shilpi", "root", "159753@Sp#");
          stmt = con.createStatement();
          // rs=stmt.executeQuery("");
         
          out.println("<table width 50%>");
          ResultSet rs = stmt.executeQuery("select * from address_book where Name='"+Name+"'");
          out.print("<html><Body background-image:giffy8.gif></body></html>");
    	  
          if(rs.next())
          {	  out.print("<table width=30% height=10% bgcolor=lavender align=center>");
        	  out.println("<tr><td>Record found in database</td></tr>");
        	  //out.print("<tr><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");
        	  
          }
          
          else
          {
        	  out.println("Enter the correct record name to be found");
          }
          
          	out.print("</table>");
          	out.print("<a href='Mainpg.jsp' align=center>CLICK HERE TO CONTINUE</a>");
      	  
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
