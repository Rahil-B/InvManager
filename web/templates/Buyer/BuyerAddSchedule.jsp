<%-- 
    Document   : BuyerAddSchedule
    Created on : 23 Apr, 2020, 8:38:50 AM
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

        <title>BuyerAddSchedule</title>
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
             
             <td colspan="6" rowspan="10">
                 <h3>Add your order details.</h3>
       
             		<table class="table table-hover table-light">
             			<tr>
             				<th colspan="2">Delivery day:</th>
             				<td>
             					<select name="od_day">
                                <option value="monday" > Monday </option>
                                <option value="tuesday" > Tuesday </option>
                                <option value="wednesday" > Wednesday </option>
                                <option value="thurday" > Thursday </option>
                                <option value="friday" > Friday </option>
                                <option value="saturday" > saturday </option>
                                <option value="sunday" > Sunday </option>
                            	</select>
             				</td>
             			</tr>
             			<tr>
             				<!--table border="1">
             				<tr-->
             					<th> SR.NO </th>
             					<th>Fruit type:</th>
             					<th>Required Quantity:</th>
             				</tr>
             				<tr>
             					<td>1</td>
             					<td><select name="fruit">
		                    	        <option value="apple" > Apple </option>
		                    	        <option value="banana" > Banana </option>
                        	    	</select>
                        	    </td>
       							
       							<td>
       								<select name="qty">			
		                    	        <option value="1" > 01 </option>
		                    	        <option value="2" > 02 </option>
		                    	        <option value="3" > 03 </option>
		                    	        <option value="4" > 04 </option>
		                    	        <option value="5" > 05 </option>
                        	    	</select>
                        	    </td>
             				</tr>
             				<tr>
             				<td colspan="3"><input class="btn btn-success" type="submit" value="Add more..."></td>
             				</tr>
             				<!--/table>
             			</tr-->
             			<tr>
             				<td colspan="3"><input class="btn btn-success" type="submit" value="Add order"></td>
             			</tr>
             		</table>
             	
             	
             		
             		
             </td>
             </tr>
            
        </table> 
  
    </body>
</html>
