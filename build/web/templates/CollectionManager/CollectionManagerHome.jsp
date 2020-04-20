<%-- 
    Document   : CollectionManager
    Created on : 20 Apr, 2020, 12:54:53 PM
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
    	<tbl1>
        <table border='1'  width="100%"  align="center" style="height:200px">
             <tr><td><a href="supplyStaff_home.html">Home</a></td>
             <td colspan="5" rowspan="10">
             		Table for upcoming supplies //which are approved
             		<table border="1" width="100%" >
             			<tr>
             				<th>Supply no.</th>
             				<th>Fruit</th>
             				<th>Quantity(Kg.)</th>
             				<th>Source</th>
             				<th>Request Date</th>
             				<th>Action</th>
             			</tr>
             			<tr>
             				<td>S2001240001</td>
             				<td>Mangoe</td>
             				<td>30</td>
             				<td>F0100100001</td>
             				<td>24/01/2020</td>
             				<td><input type="button" name="gen_rec" value="Generate receipt"/></td>
             			</tr>
             		</table>
             </td></tr>
             <tr><td><a href="supplyStaff_newSupply.html">New Supply</a></td></tr>             
             <tr><td><a href="supplyStaff_supplies.html">My Supplies</a></td></tr>
             <tr><td><a href="supplyStaff_history.html">View Supply History</a></td></tr>
             <tr><td><a href="/InvManager/Login/LogOut.jsp">Log out</a></td></tr>
        </table>
        </tbl1> 
    </body>
</html>
