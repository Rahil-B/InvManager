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
             <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
 	 <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
 	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
 	 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

    </head>
    <body>
        <style>
            td {font-weight: bold;}
        </style>
        <hr>
        <br>
        <!--div class="container">
  
  		<ul class="list-inline">
    			<li><a href="/InvManager/CollectionManager/CollectionManagerHome" class="btn btn-primary"><h4>Home</h4></a></li>
    			<li><a href="/InvManager/CollectionManager/NewSupply" class="btn btn-primary"><h4>New Supply</h4></a></li>
    			<li><a href="/InvManager/CollectionManager/Supplies" class="btn btn-primary"><h4>My Supplies</h4></a></li>
    			<li><a href="/InvManager/CollectionManager/History" class="btn btn-primary"><h4>View Supply History</h4></a></li>
			
    			<li><a href="/InvManager/Login/LogOut.jsp" class="btn btn-primary"><h4>Log out</h4></a></li>
  		</ul>
	</div>
        <hr-->
        
        <table class="table table-hover table-light" width="100%" >
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