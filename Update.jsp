<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UPDATE</title>
</head>
<Form action="Update2.jsp" method="get">


<table width=100% height=50% border=3 bgcolor=White>
<tr height=25%><td colspan=2><jsp:include page="Welcome.html"/></td></tr></table>
Welcome <%=session.getAttribute("User_Id")%>
<a href="logout.jsp"><font size="3" color="white">LOGOUT</font><br></a>

<table width=100% height=20% border=2 bgcolor=orange>
<tr align=center><td><a href="Add.jsp">ADD</a></td>
<td><a href="Delete.jsp">DELETE</a></td>
<td><a href="Search.jsp">SEARCH</a></td>
<td><a href="Update.jsp">UPDATE</a></td>
<td><a href="View.jsp">VIEW</a></td></tr>


</table>
<table border=3 width=30%>
<center>
<tr>
<td>Name</td>
<td><Input type=text name=Name></td>
</tr>

<tr>
<td colspan=2><input type=submit name=n6 value=SUBMIT></td>
</tr>

</table>
</body>
</Form>
</html>