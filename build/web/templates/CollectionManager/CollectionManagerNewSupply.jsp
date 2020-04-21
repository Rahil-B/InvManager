<%-- 
    Document   : CollectionManagerNewSupply
    Created on : 20 Apr, 2020, 8:11:41 PM
    Author     : RAHIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Supply</title>
    </head>
    <body>
        <table border='1' width="100%"  align="center" style="height:200px" >
             <tr>
		         <td><a href="/InvManager/CollectionManager/CollectionManagerHome">Home</a></td>
		         <td colspan="5" rowspan="10">
		         
             		Generate new supply request
             		<form action = "AddSupply" method="POST">
                    <table border = "1" width="100%">
            			<tr>	
            						<th colspan='3'>New Supply</th>
            			</tr>        
            			<tr>
            					<td colspan='1'>Fruit:</td>
            					<td>
		        					<select name="fruit_type">
		        						<!--value=fruit id-->
				                        <option value="1" > Apple </option>
				                        <option value="2" > Mangoe </option>
				                        <option value="3" > Kiwi </option>
				                        <option value="4" > Orange </option>
				                        <option value="5" > Grapes </option>
		                        	</select>
            					</td>
            			</tr>
            			<tr>
            					<td colspan='1'>Quantity:</td>
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
            				<td colspan='1'>Source</td>
            				<td>
		        					<select name="farm_type">
				                        <option value="1" > F </option>
				                        <option value="2" > 02 </option>
				                        <option value="3" > 03 </option>
				                        <option value="4" > 04 </option>
				                        <option value="5" > 05 </option>
		                        	</select>
            						<input type='text' name='farm_id' required >
            				</td> 
            			</tr >
            			<tr>
            				<td colspan='1'>Supply date</td>
            				<td><input type='date' name='supply_date' /></td>
            			</tr>
            			<tr>
            				<td>	
            					<input type='submit' value='Submit'>
            				</td>
            			</tr>
					</table>
                
            </form>
             		
             		
             </td></tr>
             <tr><td><a href="/InvManager/CollectionManager/NewSupply">New Supply</a></td></tr>             
             <tr><td><a href="/InvManager/CollectionManager/Supplies">My Supplies</a></td></tr>
             <tr><td><a href="/InvManager/CollectionManager/History">View Supply History</a></td></tr>
             <tr><td><a href="/InvManager/Login/LogOut.jsp">Log out</a></td></tr>

        </table> 
    </body>
</html>
