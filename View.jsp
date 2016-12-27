<!DOCTYPE html>
<html>
<%@ page import="java.sql.* "
	%>
<%
try{
 Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/shilpi", "root", "159753@Sp#");
  Statement stmt = con.createStatement();%>
  <table width=100% height=100% border=1 bgcolor=lavender>
	<tr height='25%'> <td colspan=2><jsp:include page="Welcome.html"/></td></tr>
	
	<a href='logout.jsp'><font size="3" color="white">LOGOUT</font></a></h1><br>
  <table width=100% height=20% border=2 bgcolor=orange>
<tr align=center><td><a href="Add.jsp">ADD</a></td>
<td><a href="Delete.jsp">DELETE</a></td>
<td><a href="Search.jsp">SEARCH</a></td>
<td><a href="Update.jsp">UPDATE</a></td>
<td><a href="View.jsp">VIEW</a></td></tr>
  
  <% out.print("<table width=100% height=50% border=3 bgcolor=White>");
  out.print("");
  out.print("</table>");
  out.println("<table width=50% border =2 align=center>");
  ResultSet rs = stmt.executeQuery("select * from address_book");
  
  while(rs.next())
  {
	  
	  out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td>");
 }
 
  	
  	out.print("</table>");
  
}
catch(Exception e)
{
	out.print(e);
}


%>
</html>