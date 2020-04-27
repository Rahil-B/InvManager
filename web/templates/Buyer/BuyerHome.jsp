<%-- 
    Document   : BuyerHome
    Created on : 20 Apr, 2020, 12:13:27 PM
    Author     : RAHIL
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
        <hr>
        <table  width="100%">
             
             <td colspan="5" rowspan="10">
                 <h3>Table of available fruits.</h3>
                 
             		<table class="table table-hover table-light" width="100%">
             			<tr>
             				<th>Fruit</th>
             				<th>Quantity available(Kg)</th>
             				
             				<th>Price</th>
                                        <th>Required quantity(Kg)</th>
             			</tr>
                                <tr>
                                    
             				<td>Mango</td>
             				<td>1500</td>
                                        <td>100</td>
             				<td><form action="/InvManager/Buyer/BuyerHome">
                                            <select name="o_qty">
                                            <option value="1" > 01 </option>
                                            <option value="2" > 02 </option>
                                            <option value="3" > 03 </option>
                                            <option value="4" > 04 </option>
                                            <option value="5" > 05 </option>
                                           </select>
                                                <input type="hidden" value="Mango" name="fruit">
                                                <input type="hidden" value="100" name="price">
                                            
                                            </td>
                                
                            
                             
                                    <td><button class="btn btn-success" type="submit" style="background-color:burlywood; border-color:black; color:black">Add to cart</button>
                                        </form>
                            </td>
                                
             			</tr>
                                
             			<tr>
             				<td>Apple</td>
             				<td>30</td>
                                        <td>80</td>
             				<td>
                                            <form action="/InvManager/Buyer/BuyerHome">
                                            <select name="o_qty">
                                            <option value="1" > 01 </option>
                                            <option value="2" > 02 </option>
                                            <option value="3" > 03 </option>
                                            <option value="4" > 04 </option>
                                            <option value="5" > 05 </option>
                                        </select>
                                            <input type="hidden" value="Apple" name="fruit">
                                 <input type="hidden" value="80" name="price">    
                                            </form>    
                                        </td>
                                
                                
                                        <td><button type="submit" class="btn btn-success" style="background-color:burlywood; border-color:black; color:black">Add to cart</button>
                                            </td>
             			</tr>
                 
                                <tr>
                                    
             				<td>Kiwi</td>
             				<td>50</td>
                                        <td>150</td>
             				<td><form action="/InvManager/Buyer/BuyerHome">
                                            <select name="o_qty">
                                            <option value="1" > 01 </option>
                                            <option value="2" > 02 </option>
                                            <option value="3" > 03 </option>
                                            <option value="4" > 04 </option>
                                            <option value="5" > 05 </option>
                                           </select>
                                                <input type="hidden" value="Kiwi" name="fruit">
                                                <input type="hidden" value="150" name="price">
                                            
                                            </td>
                                
                            
                             
                                    <td><button class="btn btn-success" type="submit" style="background-color:burlywood; border-color:black; color:black">Add to cart</button>
                                        </form>
                            </td>
                                
             			</tr>
                                
             			<tr>
                                    
             				<td>Banana</td>
             				<td>50</td>
                                        <td>40</td>
             				<td><form action="/InvManager/Buyer/BuyerHome">
                                            <select name="o_qty">
                                            <option value="1" > 01 </option>
                                            <option value="2" > 02 </option>
                                            <option value="3" > 03 </option>
                                            <option value="4" > 04 </option>
                                            <option value="5" > 05 </option>
                                           </select>
                                                <input type="hidden" value="Banana" name="fruit">
                                                <input type="hidden" value="15" name="price">
                                            
                                            </td>
                                
                            
                             
                                    <td><button class="btn btn-success" type="submit" style="background-color:burlywood; border-color:black; color:black">Add to cart</button>
                                        </form>
                            </td>
                                
             			</tr>
             		</table>
             		
                 
             		
             </td></tr>
             
        </table> 
    </body>
</html>
