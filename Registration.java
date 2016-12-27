

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see Httstmtervlet#Httstmtervlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see 
	 */
    	/**
	 * @see Httstmtervlet#doPost(HttstmtervletRequest request, HttstmtervletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		 	String Name = request.getParameter("Name");
	        String Address = request.getParameter("Address");
	        String mob_num = request.getParameter("mob_num");
	        String User_Id = request.getParameter("User_Id");
	        String Password = request.getParameter("Password");
	        
	        try
            {  
              
              Class.forName("com.mysql.jdbc.Driver");  
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shilpi", "root", "159753@Sp#");  
              Statement stmt = con.createStatement();
              stmt.executeUpdate("Insert into registration values('"+Name+"','"+Address+"','"+mob_num+"','"+User_Id+"','"+Password+"')");
              out.print("Values are successfully inserted to the database");
              response.sendRedirect("index.jsp");
              
              
            }  
            catch (Exception e)
            {  
              out.println(e);  
            }  
                 
}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    		}


	

}
