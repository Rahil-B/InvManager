<%-- 
    Document   : ErrorPage
    Created on : 20 Apr, 2020, 10:54:33 AM
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
        <h1><%=request.getParameter("msg")%></h1>
        <h1>Sorry For Inconvinency</h1>
        <a href="/InvManager/">login again</a>
    </body>
</html>
