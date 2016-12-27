<%
session.setAttribute("User_Id", null);
session.invalidate();
response.sendRedirect("index.jsp");
%>