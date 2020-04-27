<%-- 
    Document   : BuyerHome
    Created on : 20 Apr, 2020, 12:13:27 PM
    Author     : RAHIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
    </head>
    <body>
        <table border='1' width="100%">
             <tr><td><a href="buyer_home.html">Home</a></td>
             <td colspan="5" rowspan="10">
             		Table of available fruits.
             		<table border="1" width="100%">
             			<tr>
             				<th>Fruit</th>
             				<th>Quantity available(Kg)</th>
             				<th>Required quantity(Kg)</th>
             				<th></th>
             			</tr>
             			<tr>
             				<td>Apple</td>
             				<td>30</td>
             				<th><select name="o_qty">
                                <option value="1" > 01 </option>
                                <option value="2" > 02 </option>
                                <option value="3" > 03 </option>
                                <option value="4" > 04 </option>
                                <option value="5" > 05 </option>
                            </select></th>
                            <th><button type="submit" style="background-color:yellow; border-color:black; color:black">Add to cart</button></th>
             			</tr>
             			<tr>
             				<td>Banana</td>
             				<td>50</td>
             				<th><select name="o_qty">
                                <option value="1" > 01 </option>
                                <option value="2" > 02 </option>
                                <option value="3" > 03 </option>
                                <option value="4" > 04 </option>
                                <option value="5" > 05 </option>
                            </select></th>
                            <th><button type="submit" style="background-color:yellow; border-color:black; color:black">Add to cart</button></th>

             			</tr>
             		</table>
             		
             		
             		
             </td></tr>
             <tr><td><a href="buyer_orders.html">My Orders</a></td></tr>
             <tr><td><a href="buyer_cart.html">My Cart</a></td></tr>
             <tr><td><a href="buyer_schedule.html">Manage Schedule</a></td></tr>
             <tr><td><a href="buyer_add_schedule.html">Add Schedule</a></td></tr>
             <tr><td><a href="log_out.php">Log out</a></td></tr>

        </table> 
    </body>
</html>
