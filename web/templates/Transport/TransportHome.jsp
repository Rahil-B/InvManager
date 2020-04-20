<%-- 
    Document   : TransportHome
    Created on : 20 Apr, 2020, 1:12:57 PM
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
    	<table1>
        <table border='1'  width="100%"  align="center" style="height:200px">
             <tr><td><a href="fieldStaff_home.html">Home</a></td>
             <td colspan="5" rowspan="10">
             		Table for upcoming supplies //which are approved
             		<table border="1" width="100%" >
             			<tr>
             				<th>Order no.</th>
             				<th>Fruit</th>
             				<th>Quantity(Kg.)</th>
             				<th>Source</th>
             				<th>Destination</th>
             				<th>set Status</th>
             			</tr>
             			<tr>
             				<td>O2001010001</td>
             				<td>Apple</td>
             				<td>30</td>
                             <td>F0100100001</td>
                             <td>F0100100002</td>
             				<td><input type="button" name="set_delivery" value="set Delivered" /></td>
             			</tr>
             		</table>
             </td></tr>
             <tr><td><a href="fieldStaff_schedule.html">Schedule</a></td></tr>             
             <tr><td><a href="fieldStaff_history.html">History</a></td></tr>
             <tr><td><a href="log_out.php">Log out</a></td></tr>
        </table>
        </table1> 
    </body>
</html>
