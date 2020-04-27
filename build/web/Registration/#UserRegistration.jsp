<%-- 
    Document   : UserRegistration
    Created on : 22 Mar, 2020, 10:45:29 PM
    Author     : RAHIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<body>
            <form action = "/InvManager/UserRegistrationServlet" method="POST">
                    <table border = "1">
                    <tr>
                        <td colspan = "3"> <font color="red">* Required fields </font></td>
                    </tr>
                    <tr>
                        <td> <font color="red">*</font> First Name : </td>
                        <td colspan = "2">
                            <input type = "text" name = "first_name" id="first_name">
                        </td>
                    </tr>
                    <tr>
                        <td> <font color="red">*</font> Last Name : </td>
                        <td colspan = "2">
                            <input type = "text" name = "last_name" id="last_name" >
                        </td>
                    </tr>
                    
                     <tr>
                        <td> <font color="red">*</font> Phone no : </td>
                        <td colspan = "2">
                            <input type = "text" name = "ph_no" >
                        </td>
                    </tr>
                     <tr>
                        <td> <font color="red">*</font> Email id : </td>
                        <td colspan = "2">
                            <input type = "email" name = "email" >
                        </td>
                    </tr>
                    <tr>
			<td> <font color="red">*</font> New Password : </td>
                        <td colspan = "2">
                            <input type = "password" name = "password">
                        </td>
                    </tr>
                    <tr>
			<td> <font color="red">*</font> Reenter new Password : </td>
                        <td colspan = "2">
                             <input type = "password" name = "repassword" >
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <font color="red">*</font>Gender
                        </td>
                        <td colspan = "2">
                            Male <input type="radio" name="gender" value="male" checked>
                                                        Female<input type="radio" name="gender" value="female"> 
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <font color="red">*</font> Birth date : 
                        </td>
                        <td colspan="2">
                            <input type="date" name="dob" id="dob">
                        </td>
                    </tr>
                    <tr>
                        <td>
                             User type : 
                        </td>
                        <td colspan = "2">
                            <input type ="radio" name = 'u_type' value = 'buyer'> Buyer
                            <input type ="radio" name = 'u_type' value = 'transport'> Transport staff
                            <input type ="radio" name = 'u_type' value = 'collection'> Collection manager
                            <input type ="radio" name = 'u_type' value = 's_admin'> Storage administrator
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <font color="red">*</font> Identity Number : 
                        </td>
                        <td colspan="2">
                            <input type="text" name="id_num" id="id_num" >
                        </td>
                    </tr>
                    <tr>
                        <td colspan = "3">
                            Addresss : 
                        </td>
                    </tr>
                    <tr>
                        <td colspan = "3">
                            <textarea name ="address" rows = "5" cols = "100">
                            </textarea>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type ="submit" name ="register" value ="Register">
                        </td>
                        <td>
                            <input type ="reset" name ="reset" value ="Reset">
                        </td>
                            
                        <td>
                            <a href ="/InvManager/">Log in</a>
                        </td>
                    </tr>
		</table>
                
            </form>

	</body>
</html>
