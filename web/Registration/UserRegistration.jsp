<%-- 
    Document   : UserRegistration
    Created on : 22 Mar, 2020, 10:45:29 PM
    Author     : RAHIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    <title></title>
    <style>
        *{
            margin: 0;
            padding: 0;
            text-decoration: none;
            font-family: apple-system, BlinkMacSystemFont, sans-serif;
            box-sizing: border-box;
        }
        body{
            min-height: 100vh;
            background-image: linear-gradient(120deg,#f0b501,#8e44ad);
        }
        .button{
            text-align: center;
        }
        .login-form{
            width: 80%;
            background: #f1f1f1;
            height: 90%;
            padding: 3% 3%;
            border-radius: 10px;
            position: absolute;
            left: 50%;
            top: 50%;
            transform: translate(-50%,-50%);
        }
        .login-form h3{
            text-align: center;
            margin-bottom: 25px;
            color: #f12023;
        }
        .txtb{
            position: relative;
            margin: 5px 5px;
        }
        .txtb input{
            font-size: 15px;
            color: #333;
            border: 1px solid #750bcc;
            border-radius: 4px;
            width: 80%;
            outline: none;
            background: none;
            padding: 5px 5px;
            margin: 5px 10px;
            height: 30px;
        }
        .txtb span::before{
            content: attr(data-placeholder);
            position: absolute;
            top: 50%;
            left: 5px;
            color: #adadad;
            transform: translateY(-50%);
            z-index: -1;
            transition: .5s;
        }
        .txtb span::after{
            content: '';
            position: absolute;
            width: 0%;
            height: 2px;
            background: linear-gradient(120deg,#f0b501,#8e44ad);
            transition: .5s;
        }
        .focus + span::before{
            top: -5px;
        }
        .focus + span::after{
            width: 100%;
        }
        .logbtn{
            width: 49%;
            height: 50px;
            border: none;
            background: linear-gradient(120deg,#f0b501,#8e44ad,#f0b501);
            background-size: 200%;
            color: #fff;
            outline: none;
            cursor: pointer;
            transition: .5s;
            border-radius: 5px;
        }
        .logbtn:hover{
            background-position: right;
        }
        .bottom-text{
            margin-top: 60px;
            text-align: center;
            font-size: 13px;
        }
    </style>

</head>

	<body>
            <form action = "/InvManager/UserRegistrationServlet" method="POST" class="login-form">
                    <table>
                    <tr>
                        <td colspan = "3"> <font color="red">* Required fields </font></td>
                    </tr>
                    <tr>
                        <td> <font color="red">*</font> First Name : </td>
                        <td colspan = "2"  class="txtb">
                            <input type = "text" name = "first_name" id="first_name">
                        </td>
                    </tr>
                    <tr>
                        <td> <font color="red">*</font> Last Name : </td>
                        <td colspan = "2"  class="txtb">
                            <input type = "text" name = "last_name" id="last_name" >
                        </td>
                    </tr>
                    
                     <tr>
                        <td> <font color="red">*</font> Phone no : </td>
                        <td colspan = "2"  class="txtb">
                            <input type = "text" name = "ph_no" >
                        </td>
                    </tr>
                     <tr>
                        <td> <font color="red">*</font> Email id : </td>
                        <td colspan = "2"  class="txtb">
                            <input type = "email" name = "email" >
                        </td>
                    </tr>
                    <tr>
			<td> <font color="red">*</font> New Password : </td>
                        <td colspan = "2"  class="txtb">
                            <input type = "password" name = "password">
                        </td>
                    </tr>
                    <tr>
			<td> <font color="red">*</font> Reenter new Password : </td>
                        <td colspan = "2"  class="txtb">
                             <input type = "password" name = "repassword" >
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <font color="red">*</font>Gender
                        </td>
                        <td colspan = "2"  >
                            Male <input type="radio" name="gender" value="male" checked>
                                                        Female<input type="radio" name="gender" value="female"> 
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <font color="red">*</font> Birth date : 
                        </td>
                        <td colspan="2"  class="txtb">
                            <input type="date" name="dob" id="dob">
                        </td>
                    </tr>
                    <tr>
                        <td>
                             User type : 
                        </td>
                        <td colspan = "2" >
                            <input type ="radio" name = 'u_type' value = 'buyer'> Buyer
                            <input type ="radio" name = 'u_type' value = 'transport'> Transport staff
                            <br> <input type ="radio" name = 'u_type' value = 'collection'> Collection manager
                            <input type ="radio" name = 'u_type' value = 's_admin'> Storage administrator
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <font color="red"  >*</font> Identity Number : 
                        </td>
                        <td colspan="2"  class="txtb">
                            <input type="text" name="id_num" id="id_num" >
                        </td>
                    </tr>
                    <tr>
                        <td colspan = "3">
                            Addresss : 
                        </td>
                    </tr>
                    <tr>
                        <td colspan = "3"  class="txtb">
                            <textarea name ="address" rows = "3" cols = "70">
                            </textarea>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type ="submit" class="logbtn" name ="register" value ="Register">
                        </td>
                        <td>
                            <input type ="reset" class="logbtn" name ="reset" value ="Reset">
                        </td>
                            
                        <td>
                            <a href ="/InvManager/">Log in</a>
                        </td>
                    </tr>
		</table>
                
            </form>

	</body>
</html>
