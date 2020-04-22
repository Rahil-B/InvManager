<%-- 
    Document   : Receipt
    Created on : 22 Apr, 2020, 7:34:18 PM
    Author     : RAHIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Receipt</title>
    </head>
    <body>
        <table style="width: 80%" border='1' >
            <tr><td colspan="2"><h1>Supply Receipt-<%=request.getParameter("supplyId")%></h1></td></tr>
            <tr>
                <td height='50'>
                    Supply date:    <%=request.getParameter("supplyDate")%> 
                </td>
                <td height='50'>
                    Request Date:    <%=request.getParameter("requestDate")%>
                </td>
            </tr>
            
            <tr>
                <td height='50'>
                    Supply Id:
                </td>
                <td height='50'>
                    <%=request.getParameter("supplyId")%>
                </td>
            </tr>
            
            <tr>
                <td height='50'>
                    Fruit Id:
                </td>
                <td height='50'>
                    <%=request.getParameter("fruitId")%>
                </td>
            </tr>
            
            <tr>
                <td height='50'>
                    Fruit Name:
                </td>
                <td height='50'>
                    <%=request.getParameter("fruitName")%>
                </td>
            </tr>
            
            <tr>
                <td height='50'>
                    Source:
                </td>
                <td height='50'>
                    <%=request.getParameter("source")%>
                </td>
            </tr>
            
            <tr>
                <td height='50'>
                    Quantity:
                </td>
                <td height='50'>
                    <%=request.getParameter("quantity")%>
                </td>
            </tr>
            
            <tr>
                <td height='50'>
                    Destination:
                </td>
                <td height='50'>
                    <%=request.getParameter("desId")%>
                </td>
            </tr>
            
            
            
        </table>
        
    </body>
</html>