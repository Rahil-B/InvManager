<%-- 
    Document   : CollectionManagerSupplies
    Created on : 20 Apr, 2020, 8:13:09 PM
    Author     : RAHIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Supplies</title>
    </head>
    <body>
        <table border='1' width="100%"  align="center" style="height:200px" >
             <tr><td><a href="/InvManager/CollectionManager/CollectionManagerHome">Home</a></td>
             <td colspan="5" rowspan="10">
             		Table for upcoming requests
             		<table border="1" width="100%">
             			<tr>
             				<th>Supply no.</th>
             				<th>Status</th>
             				<th>Fruit</th>
             				<th>Quantity(Kg.)</th>
             				<th>Source</th>
             				<th>Request Date</th>
             				<th>Action</th>
             			</tr>
             			<tr>
             				<td>S2001230001</td>
             				<td>Pending</td>
             				<td>Apple</td>
             				<td>30</td>
             				<td>F0100100001</td>
             				<td>23/01/2020</td>
             				<td><input type="button" name="gen_rec" value="Generate receipt"/></td>
             			</tr>
             		</table>
             		
             		
             		
             </td></tr>
             <tr><td><a href="/InvManager/CollectionManager/NewSupply">New Supply</a></td></tr>             
             <tr><td><a href="/InvManager/CollectionManager/Supplies">My Supplies</a></td></tr>
             <tr><td><a href="/InvManager/CollectionManager/History">View Supply History</a></td></tr>
             <tr><td><a href="/InvManager/Login/LogOut.jsp">Log out</a></td></tr>

        </table> 
    </body>
</html>
