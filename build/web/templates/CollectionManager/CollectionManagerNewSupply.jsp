<%-- 
    Document   : CollectionManagerNewSupply
    Created on : 20 Apr, 2020, 8:11:41 PM
    Author     : RAHIL
--%>

<%@page import="java.util.List"%>
<%@page import="Models.Fruits"%>
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

        <title>New Supply</title>
    </head>
    <body>
         <hr>
        <br>
        <div class="container">
  
  		<ul class="list-inline">
    			<li><a href="/InvManager/CollectionManager/CollectionManagerHome" class="btn btn-primary"><h4>Home</h4></a></li>
    			<li><a href="/InvManager/CollectionManager/NewSupply" class="btn btn-primary"><h4>New Supply</h4></a></li>
    			<li><a href="/InvManager/CollectionManager/Supplies" class="btn btn-primary"><h4>My Supplies</h4></a></li>
    			<li><a href="/InvManager/CollectionManager/History" class="btn btn-primary"><h4>View Supply History</h4></a></li>
			
    			<li><a href="/InvManager/Login/LogOut.jsp" class="btn btn-primary"><h4>Log out</h4></a></li>
  		</ul>
	</div>
        <hr>
        <table width="100%"  align="center" style="height:200px" >
             <tr>
		        
		         <td colspan="5" rowspan="10">
		         
                             <h3>Generate new supply request</h3><br>
             		<form action = "" method="POST">
                    <table class="table table-hover table-light" width="100%">
            			<tr>	
            						<th colspan='3'>New Supply</th>
            			</tr>        
            			<tr>
            					<td colspan='1'>Fruit:</td>
            					<td>
		        					<select name="fruit_id">
		        						<!--value=fruit id-->
				                        
                                                        <%
                                                            List<Fruits> fl=(List<Fruits>)request.getAttribute("fruit_list");
                                                            for(Fruits f :fl){
                                                            
                                                        %>
                                                        <option value="<%=f.getFruitId()%>"><%=f.getFruitName()%></option>
                                                        <%
                                                            }
                                                        %>
				                        
		                        	</select>
            					</td>
            			</tr>
            			<tr>
            					<td colspan='1'>Quantity:</td>
            					<td>
                                                    <select name="qty" >
                                                        <option value="0" > 0 </option>
                                                        <%
                                                            for(int i=1;i<20;i++){
                                                        %>
                                                        <option value="<%=i%>" > <%=i%> </option>
                                                        <% } %>
		                        	</select>
                            	</td>
            			</tr>
            			<tr>
            				<td colspan='1'>Source</td>
            				<td>
		        					<select name="farm_type">
				                        <option value="1" > F1 </option>
				                        <option value="2" > F2 </option>
				                        <option value="3" > F3 </option>
				                        <option value="4" > F4 </option>
				                        
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
            					<input class="btn btn-success" type='submit' value='Submit'>
            				</td>
            			</tr>
					</table>
                
            </form>
             		
             		
             </td></tr>
           
        </table> 
    </body>
</html>
