<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        
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

        <title>Home</title>
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

<hr style="background-color:black">

        <table width="100%">
             
             <td colspan="5" rowspan="10">
                 <h3>Table of selected items.</h3>
             		 <table class="table table-hover table-light" width="100%">
             			<tr>
             				<th>Item no.</th>
             				<th>Fruit</th>
             				<th>Required quantity(Kg)</th>
             				<th>price</th>

             			</tr>
             			<tr>
             				<td>1</td>
             				<td>Apple</td>
             				<td>15</td>
             				<td>450</td>
             				
             			</tr>
             			<tr>
             				<td>2</td>
             				<td>Banana</td>
             				<td>10</td>
             				<td>150</td>
             				
             			</tr>
             			<tr>
             				<th colspan="3" > Total price </th>
             				<td>600</td>
             			</tr>
                                <tr><td><button class="btn btn-success" type="submit" style="background-color:burlywood; border-color:black; color:black">Buy</button></td></tr>
             		</table>
             		
             		
             </td></tr>
            
        </table> 
    </body>
</html>
