<%-- 
    Document   : BuyerSchedule
    Created on : 23 Apr, 2020, 8:50:39 AM
    Author     : Zalak Bhingradiya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 	 <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
 	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
 	 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

        <title>BuyerSchedule</title>
    </head>
    <body>
        <hr>
	<br>
	<div class="container">
  
  		<ul class="list-inline">
    			<li><a href="/InvManager/Buyer/BuyerHome" class="btn btn-primary"><h4>Home</h4></a></li>
    			<li><a href="/InvManager/Buyer/BuyerOrder" class="btn btn-primary"><h4>My Orders</h4></a></li>
    			<li><a href="/InvManager/Buyer/BuyerCart" class="btn btn-primary"><h4>My Cart</h4></a></li>
    			<li><a href="/InvManager/Buyer/BuyerSchedule" class="btn btn-primary"><h4>Manage Schedule</h4></a></li>
			<li><a href="/InvManager/Buyer/BuyerAddSchedule" class="btn btn-primary"><h4>Add Schedule</h4></a></li>
    			<li><a href="/InvManager/Login/LogOut.jsp" class="btn btn-primary"><h4>Log out</h4></a></li>
  		</ul>
	</div>
        <hr>
        
        <table width="100%">
             
             <td colspan="5" rowspan="10">
                 <h3>Table of scheduled weekly orders .</h3>
             		 <table class="table table-hover table-light" width="100%">
             			<tr>
             				<th>Delivery day</th>
             				<th>Fruit</th>
             				<th>quantity(Kg)</th>
            

             			</tr>
             			<tr>
             				<td rowspan="2">Monday</td>
             				<td>Apple</td>
             				<td>15</td>     
             						        				
             			</tr>
             			<tr>
             				<td>Banana</td>
             				<td>10</td>

             				
             			</tr>
             			</table>
             </td></tr>
             
        </table> 
    
    </body>
</html>
