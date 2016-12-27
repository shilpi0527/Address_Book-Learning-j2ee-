<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration 1</title>
    </head>
    <body>
<tr height=25%><td colspan=2><jsp:include page="Page.jsp"/></td>
 <form method="post" action="Registration">
    <center>
 <table border="1" width="30%" cellpadding="5" bgcolor="gold">
   <thead>
      <tr>
 <th colspan="2">Enter Information Here</th>
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
<td>mob_num</td>
 <td><input type="text" name="mob_num" value="" /></td>
        </tr>
  <tr>
   <td>User_Id</td>
   <td>
   <input type="text" name="User_Id" value="" /></td>
       </tr>
        <tr>
     <td>Password</td>
 <td><input type="Password" name="Password" value="" /></td>
       </tr>
           <tr>
        <td><input type="submit" value="Submit" /></td>
     <td><input type="reset" value="Reset" /></td>
    </tr>
     </tbody>
            </table>
            </center>
        </form>
    </body>
</html>
