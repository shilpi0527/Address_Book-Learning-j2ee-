<!DOCTYPE HTML>
<html>
<%
    if ((session.getAttribute("User_Id") == null) || (session.getAttribute("User_Id") == "")) {
%>
You are not logged in<br/>
<a href="index.jsp">Please Login</a>
<%} else {
%>
Welcome <%=session.getAttribute("User_Id")%>
<tr height=25%><td colspan=2><jsp:include page="Welcome.html"/></td></tr>
<a href='logout.jsp'><font size="3" color="white">LOGOUT</font></a></h1><br>
<a href='Mainpg.jsp'><font size="3" color="white">CLICK HERE TO CONTINUE</font></a>
</table>
<%
    }
%>
</html>