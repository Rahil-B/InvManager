<%-- 
    Document   : LogOut
    Created on : 20 Apr, 2020, 12:35:25 PM
    Author     : RAHIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Logging Out!</h1>
        <%
            HttpSession sess=request.getSession(false);
            sess.invalidate();
            response.sendRedirect("/InvManager/");
            
       %>
    </body>
</html>
