

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	Connection con;
	Statement stmt;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
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
		 	String Name = request.getParameter("Name");
	        //@SuppressWarnings("unused")
			//String Password = request.getParameter("Password");

            try
            {  
              
              Class.forName("com.mysql.jdbc.Driver");  
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shilpi", "root", "159753@Sp#");  
              Statement stmt = con.createStatement();
              stmt.executeUpdate("delete from address_book where Name='"+Name+"'");
              response.sendRedirect("Mainpg.jsp");
              //out.print("Values are successfully deleted from the database");
 
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
