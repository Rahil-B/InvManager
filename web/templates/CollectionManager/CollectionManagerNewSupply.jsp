<%-- 
    Document   : CollectionManagerNewSupply
    Created on : 21 Apr, 2020, 3:18:29 PM
    Author     : Zalak Bhingradiya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
 	 <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
 	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
 	 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


		<title>New Supply</title>
		<style>
	

			body{
						min-height: 100vh;
						background-color: #FFDAB9;
				 background-image: url("bg.png");
				}
			table {
				 border-collapse: collapse;
				  width: 100%;
				background-color:#00FA9A;
				margin:0% 1%;
			}
		
			th, td {
				  padding: 5px;
				  text-align: left;
				  border-bottom: 1px solid #008B8B;
			}
		
			
		
			</style>
		
    </head>
    <body>
        <hr>
        <br>
        <div class="container">
  
  		<ul class="list-inline">
    			<li><a href="/InvManager/CollectionManager/CollectionManagerHome" class="btn btn-primary"><h4>Home</h4></a></li>
    			<li><a href="/InvManager/CollectionManager/CollectionManagerNewSupply" class="btn btn-primary"><h4>New Supply</h4></a></li>
    			<li><a href="/InvManager/CollectionManager/CollectionManagerSupplies" class="btn btn-primary"><h4>My Supplies</h4></a></li>
    			<li><a href="/InvManager/CollectionManager/CollectionManagerHistory" class="btn btn-primary"><h4>View Supply History</h4></a></li>
			
    			<li><a href="/InvManager/Login/LogOut.jsp" class="btn btn-primary"><h4>Log out</h4></a></li>
  		</ul>
	</div>
        <hr>
        <br>
        <table width="100%"  align="center" style="height:200px" >
             <tr>
		         
		         <td colspan="5" rowspan="10">
		         
                             <h3>Generate new supply request</h3>
             		<form action = "AddSupply" method="POST">
                    <table width="100%">
            			<tr>	
            						<th colspan='3'>New Supply</th>
            			</tr>        
            			<tr>
            					<td colspan='1'>Fruit:</td>
            					<td>
		        					<select name="fruit_type">
		        						<!--value=fruit id-->
				                        <option value="1" > Apple </option>
				                        <option value="2" > Mango </option>
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
            					<input type='submit' class="btn btn-success" value='Submit'>
            				</td>
            			</tr>
					</table>
                
            </form>
             		
             		
             </td></tr>
             
        </table> 
    </body>
</html>
