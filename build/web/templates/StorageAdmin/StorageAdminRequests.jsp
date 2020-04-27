<%-- 
    Document   : StorageAdminRequests
    Created on : 23 Apr, 2020, 1:08:12 AM
    Author     : RAHIL
--%>

<%@page import="Models.Inventory"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="Models.Supplies"%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Supply Requests</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	 <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
 	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
 	 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

        <script>
            function setReq(par1){
                window.location.replace("/InvManager/ManageSupplies/SetReqStatus?"+par1);
            }
        </script>
    </head>
    <body>
        
        <hr>
	<br>
		<div class="container">
  
  		<ul class="list-inline">
    			<li><a href="/InvManager/StorageAdmin/AdminHome" class="btn btn-primary"><h4>Home</h4></a></li>
    			<li><a href="/InvManager/StorageAdmin/UpcomingSupply" class="btn btn-primary"><h4>Upcoming Supply</h4></a></li>
    			<li><a href="/InvManager/StorageAdmin/Requests" class="btn btn-primary"><h4>Pending Supply Request</h4></a></li>
    			<li><a href="/InvManager/StorageAdmin/History" class="btn btn-primary"><h4>History</h4></a></li>
    			<li><a href="/InvManager/Login/LogOut.jsp" class="btn btn-primary"><h4>Log out</h4></a></li>
  		</ul>
	</div>

	<hr style="background-color:black">
        
        <table  width="100%">
           
             <td colspan="4" rowspan="10">
                 <h3>Table of pending supply requests..</h3>
             		<table class="table table-hover table-light" width="100%">
             			<tr>
             				<th>Fruit</th>
             				<th>Quantity(Kg)</th>
             				<th>Price(Per kg)</th>
             			</tr>
             			
                                
                                <%
                                    int warId=(Integer)request.getSession().getAttribute("warId");
                                    
                                    List<Inventory> inv_list=(List<Inventory>) request.getAttribute("inv_list");
                                    HashMap<Integer,String> fruit_names=(HashMap<Integer,String>)request.getAttribute("fruit_names");
                                    for(Inventory s:inv_list){
                                %>
                                
                                 <tr>
                                    <td><%=fruit_names.get(s.getFruitId())%></td>
                                    <td><%=s.getQuantityAvail()%></td>
                                    <td><%=s.getPrice()%></td>
             			</tr>
                                <%}%>
             		</table>
             		
             		
             </td></tr>
            
        </table> 
        <table width="100%"  align="center" style="height:200px" >
                         <td colspan="5" rowspan="10">
                             <h3> Table for upcoming requests </h3><br>
             		<table class="table table-hover table-light" width="100%">
             			<tr>
             				<th>Supply no.</th>
             				<!--th>Status</th-->
             				<th>Fruit</th>
             				<th>Quantity(Kg.)</th>
             				<th>Source</th>
             				<th>Request Date</th>
                                        <th>Supply Date</th>
             				<th>Action</th>
             			</tr>
             			
                                <%
                                    
                                    Date prevDate=null;
                                    List<Supplies> supplies_list=(List<Supplies>) request.getAttribute("supplies_list");
                                    
                                    for(Supplies s:supplies_list){
                                %>
                                
                                <%if(prevDate==null||prevDate.compareTo(s.getRequestDate())!=0){%>
                                <tr><td colspan="7"><h4><%=s.getRequestDate()%></h4></td></tr>
                                <%prevDate=s.getRequestDate();%>
                                <%}%>
                                
                                <tr>
                                    <td><%=s.getSupplyId()%></td>
                                    <!--td><%
                                    String status=null;
                                        if(s.getDesId()==0){
                                            status="Pending";
                                        }
                                        else if(s.getDesId()==-1){
                                            status="Declined";
                                        }
                                        else {
                                            status="Accepted";
                                        }
                                    
                                    %>
                                    <%=status%>
                                    </td-->
                                    <td><%=fruit_names.get(s.getFruitId())%></td>
             				<td><%=s.getQuantity()%></td>
                                        <td><%=s.getSourceType()+s.getSourceId()%></td>
                                        <td><%=s.getRequestDate()%></td>
                                        <td><%=s.getSupplyDate()%></td>
                                        <td><input type="button" name="acc_req" class="btn btn-success" value="Accept" onclick='setReq("<%=
                                                "supplyId="+s.getSupplyId()+"&warId="+warId%>")'/>
                                            <input type="button" name="dec_req" class="btn btn-success" value="Decline" onclick='setReq("<%=
                                                "supplyId="+s.getSupplyId()+"&warId=-1"%>")'/>
                                        </td>
             			</tr>
                                <%}%>
             		</table>
             </td></tr>
        </table> 
    </body>
</html>
