<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MAIN PAGE</title>
</head>
<body>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<table>
<table width=100% height=50% border=3 bgcolor=White>
<tr height=25%><td colspan=2><jsp:include page="Welcome.html"/></td>
Welcome <%=session.getAttribute("User_Id")%>
<a href="logout.jsp" align="right">LOGOUT<br></a>
</table>
</table>
<table border=1 width=100% bgcolor=lime>
<tr align=center><td><a href="Add.jsp">ADD</a></td>
<td><a href="Delete.jsp">DELETE</a></td>
<td><a href="Search.jsp">SEARCH</a></td>
<td><a href="View.jsp">VIEW</a></td>
<td><a href="Update.jsp">UPDATE</a></td>
</table>
</body>
</html>