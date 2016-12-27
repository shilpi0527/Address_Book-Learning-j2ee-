
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;  charset=UTF-8">
        <title>Login</title>
        <style type="text/css">
	body {
        background-image: url("giffy8.gif ");
      	 } 
 	</style>    
    </head>
    <body>
   
            
 <tr height=25%><td colspan=2><jsp:include page="Page.jsp"/></td>   
 <form method="get" action="login.jsp">
  <center>
  <table border="1" width="30%" cellpadding="3" bgcolor=lavender>
     <thead>
     <tr>
    <th colspan="2">Login Here</th>
     </tr>
     </thead>
      <tbody>
    <tr>
 <td>User_Id</td>
    <td><input type="text" name="User_Id" value="" /></td>
     </tr>
     <tr>
   <td>Password</td>
   <td><input type="password" name="Password" value="" /></td>
          </tr>
    <tr>
  <td><input type="submit" value="Login" /></td>
     <td><input type="reset" value="Reset" /></td>
           </tr>
          <tr>
    <td colspan="2">Yet Not Registered!! <a href="Registration.jsp">Register Here</a></td>
           </tr>
   </tbody>
   </table>
  </center>
   </form>
   </body>
</html>
