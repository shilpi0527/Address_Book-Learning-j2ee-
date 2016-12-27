<!DOCTYPE html>
<html>
<%@ page import="java.sql.* "

	%>
<%
Connection con;
Statement stmt;
ResultSet rs;
response.setContentType("text/html");


String Name=request.getParameter("Name");
String Address=request.getParameter("Address");
String Email_Id=request.getParameter("Email_Id");
String mob_num=request.getParameter("mob_num");

try
{  
	
	Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost/shilpi", "root", "159753@Sp#");
    stmt = con.createStatement();
    rs=stmt.executeQuery("Select * from Address_book where Name='"+Name+"'");
    if(rs.next())%>
    
<table width=100% height=50% border=3 bgcolor=White>
<tr height=25%><td colspan=2><jsp:include page="Welcome.html"/></td></tr></table>
Welcome <%=session.getAttribute("User_Id")%>
<a href='logout.jsp'><font size="3" color="white">LOGOUT</font></a><br>
    
<%     {
	out.print("<Form action='Update'>");
	out.print("<table border='1' width='30%' cellpadding='3' bgcolor=lavender align=center><thead><tr><th colspan='2'>Update the Details</th></tr></thead>");
	out.print("<tbody><tr><td>Name</td><td><input type=text name= 'Name' value='"+rs.getString(1)+"'></td></tr>");
	out.print("<tr><td>Address</td><td><input type=text name= 'Address' value='"+rs.getString(2)+"'></td></tr>");
	out.print("<tr><td>Email_Id</td><td> <input type=text name= 'Email_Id' value='"+rs.getString(3)+"'></td></tr>");
	out.print("<tr><td>mob_num </td><td><input type=text name= 'mob_num' value='"+rs.getString(4)+"'></td></tr>");
	out.print("<tr><td colspan=2><input type=submit name=n6 value=SUBMIT></td></tr></tbody>");

    }	      
}
catch(Exception e)
{
	out.print(e);
}

%>
