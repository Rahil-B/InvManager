<%-- 
    Document   : StorageAdminHome
    Created on : 20 Apr, 2020, 1:07:42 PM
    Author     : RAHIL
--%>

<%@page import="Models.WareHouse"%>
<%@page import="java.util.HashMap"%>
<%@page import="Models.Inventory"%>
<%@page import="java.util.List"%>
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
        <a href="StorageAdminHistory.jsp"></a>
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
                 <form action="/InvManager/StorageAdmin/SetWareHouse" method="post" >
                 <h3>Table of Today's available fruits.</h3>
                 <h2>Warehouse-
                     <%
                         List<WareHouse> ware_list=(List<WareHouse>) request.getAttribute("ware_list");
                         int warId=(Integer)request.getSession().getAttribute("warId");
                     %>
                     <select name="warId" id="warId" onchange="form.submit()">
                         <%for(WareHouse w : ware_list){
                         %>
                         <%if(w.getWareHouseId()-warId==0){%>
                            <option value="<%=w.getWareHouseId()%>" selected><%=w.getWareHouseId()%></option>
                            <%}else{%>
                            <option value="<%=w.getWareHouseId()%>"><%=w.getWareHouseId()%></option>
                            <%}%>
                         <%}%>
                    </select>
                     
                    <!--%=(Integer)session.getAttribute("warId")%-->
                 </h2>
                 </form>
                        
             		<table class="table table-hover table-light" width="100%">
             			<tr>
             				<th>Fruit</th>
             				<th>Quantity(Kg)</th>
             				<th>Price(Per kg)</th>
             			</tr>
             			
                                
                                <%
                                
                                    
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
    </body>
</html>
