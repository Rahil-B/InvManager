<%-- 
    Document   : Login
    Created on : 22 Mar, 2020, 2:13:03 PM
    Author     : RAHIL
--%>

<%@page import="Validators.PasswordValidator"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="javax.servlet.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%="Connected " +request.getParameter("user_email") %>
        <%
            String user_email=request.getParameter("user_email");
            String user_passwd=request.getParameter("user_passwd");
            //PasswordValidator pv =new PasswordValidator("jdbc:mysql://127.0.0.1:3306/ce4_13","root","");
            PasswordValidator pv =new PasswordValidator();
            try{
                if(pv.isValid(user_email,user_passwd)){
                    HttpSession sess=request.getSession();
                    sess.setAttribute("user_email", user_email);
                    sess.setAttribute("user_type", pv.temp);
                    switch(pv.temp){
                        case("b"):
                            response.sendRedirect("/InvManager/Buyer/BuyerHome");
                            break;
                        case("c"):
                            response.sendRedirect("/InvManager/CollectionManager/CollectionManagerHome");
                            break;
                        case("s"):
                            response.sendRedirect("/InvManager/StorageAdmin/AdminHome");
                            break;
                        case("t"):
                            response.sendRedirect("/InvManager/Transport/TransportHome");
                            break;
                        default:
                            response.sendRedirect("/InvManager");
                }
                }
                else{
                    response.sendRedirect("/InvManager/");
                }
            }
            catch(Exception e){
                response.sendRedirect("/InvManager/");
            }
                
        %>
    </body>
</html>
