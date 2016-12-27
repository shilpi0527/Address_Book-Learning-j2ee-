<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <form method="post" action="reg.jsp">
            <center>
            <table border="1" width="30%" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Enter Information Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>User_Id</td>
                        <td><input type="text" name="User_Id" value="" /></td>
                    </tr>
                    <tr>
                        <td>Pasword</td>
                        <td><input type="text" name="Password" value="" /></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="Email" value="" /></td>
                    </tr>
                    <tr>
                        <td>Branch</td>
                        <td><input type="text" name="Branch" value="" /></td>
                    </tr>
                    <tr>
                        <td>Contact</td>
                        <td><input type="text" name="COntact" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">Already registered!! <a href="index.jsp">Login Here</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>
    </body>
</html>
