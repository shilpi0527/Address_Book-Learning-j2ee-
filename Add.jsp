<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADD CONTACT</title>
</head>
<body>

<table width=100% height=50% border=3 bgcolor=White>
<tr height=25%><td colspan=2><jsp:include page="Welcome.html"/></td>

</table>
 Welcome <%=session.getAttribute("User_Id")%>
<a href="logout.jsp"><font size="3" color="white">LOGOUT</font><br></a>

<table width=100% height=20% border=2 bgcolor="orange">
<tr align=center ><td><a href="Add.jsp">ADD</a></td>
<td><a href="Delete.jsp">DELETE</a></td>
<td><a href="Search.jsp">SEARCH</a></td>
<td><a href="Update.jsp">UPDATE</a></td>
<td><a href="View.jsp">VIEW</a></td>
</tr>
</table>

<form method="post" action="Add">
  <center>
  <table border="1" width="30%" cellpadding="3" bgcolor=lavender>
     <thead>
     <tr>
    <th colspan="2">ADD A CONTACT</th>
     </tr>
     </thead>
      <tbody>
    <tr>
 <td>Name</td>
    <td><input type="text" name="Name" value="" /></td>
     </tr>
     <tr>
   <td>Address</td>
   <td><input type="text" name="Address" value="" /></td>
          </tr>
  <tr>
 <td>Email_Id</td>
    <td><input type="text" name="Email_Id" value="" /></td>
     </tr>
    <tr>
 <td>mob_num</td>
    <td><input type="text" name="mob_num" value="" /></td>
     </tr>
   
    <tr>
  <td><input type="submit" value="SUBMIT" /></td>
     <td><input type="reset" value="RESET" /></td>
           </tr>
    </tbody>
   </table>
  </center>
  
</Form>
</body>
 </head>

</body>
</html>