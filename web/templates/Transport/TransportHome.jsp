<%-- 
    Document   : TransportHome
    Created on : 20 Apr, 2020, 1:12:57 PM
    Author     : RAHIL
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="Models.Supplies"%>
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
    			<li><a href="/InvManager/Transport/TransportHome" class="btn btn-primary"><h4>Home</h4></a></li>
    			<li><a href="/InvManager/Transport/TransportSchedule" class="btn btn-primary"><h4>Schedule</h4></a></li>
    			<li><a href="/InvManager/Transport/TransportHistory" class="btn btn-primary"><h4>History</h4></a></li>
    			<li><a href="/InvManager/Login/LogOut.jsp" class="btn btn-primary"><h4>Log out</h4></a></li>
  		</ul>
	</div>
	<hr>

        <script>
            
             function genReceipt(att1){
                window.location.replace("/InvManager/templates/CollectionManager/Receipt.jsp?"+att1);
                
            }
            
            function setDelivered(att1){
                window.location.replace("/InvManager/ManageDelivery/SetDelivered?"+att1);
                
            }
        </script>
        
        
    	<tbl1>
        <table width="100%"  align="center" style="height:200px">
             
             <td colspan="5" rowspan="10">
                 <h3>Todays transport list</h3><br>
             		<table class="table table-hover table-light" border="1" width="100%" >
             			<tr>
             				<th>Supply no.</th>
             				<th>Fruit</th>
             				<th>Quantity(Kg.)</th>
             				<th>Source</th>
                                        <th>destination</th>
             				<th>Request Date</th>
                                        <th>Supply Date</th>
             				<th>Action</th>
                                        
             			</tr>
             			
                                <%
                                    List<Supplies> supplies_list=(List<Supplies>) request.getAttribute("supplies_list");
                                    HashMap<Integer,String> fruit_names=(HashMap<Integer,String>)request.getAttribute("fruit_names");
                                    for(Supplies s:supplies_list){
                                %>
                                <tr>
                                    <td><%=s.getSupplyId()%></td>
                                    
                                    <td><%=fruit_names.get(s.getFruitId())%></td>
             				<td><%=s.getQuantity()%></td>
                                        <td><%=s.getSourceType()+s.getSourceId()%></td>
                                        <td><%=s.getDesId()%></td>
                                        <td><%=s.getRequestDate()%></td>
                                        <td><%=s.getSupplyDate()%></td>
             				<td><input type="button" class="btn btn-success" name="gen_rec" value="Delivered" onclick='setDelivered("<%=
                                                "supplyId="+s.getSupplyId()+"&fruitId="+s.getFruitId()+"&fruitName="+fruit_names.get(s.getFruitId())+"&quantity="+s.getQuantity()
                                                           +"&source="+s.getSourceType()+s.getSourceId()+"&requestDate="+s.getRequestDate()
                                                           +"&supplyDate="+s.getSupplyDate()+"&desId="+s.getDesId()%>")' 
                                                           <%if(s.getDesId()<=0){%><%="disabled"%><%}%>
                                                           />
                                        <input type="button" class="btn btn-success" name="gen_rec" value="Generate Receipt" onclick='genReceipt("<%=
                                                "supplyId="+s.getSupplyId()+"&fruitId="+s.getFruitId()+"&fruitName="+fruit_names.get(s.getFruitId())+"&quantity="+s.getQuantity()
                                                           +"&source="+s.getSourceType()+s.getSourceId()+"&requestDate="+s.getRequestDate()
                                                           +"&supplyDate="+s.getSupplyDate()+"&desId="+s.getDesId()%>")' 
                                                           <%if(s.getDesId()<=0){%><%="disabled"%><%}%>
                                                           /></td>
             			</tr>
                                <%}%>
                                
             		</table>
             </td></tr>
              </table>
        </tbl1>
        
        
    	<!--table1>
        <table   width="100%"  align="center" style="height:200px">
             
             <td colspan="5" rowspan="10">
             		<h3>Table for upcoming supplies //which are approved</h3>
             		<table class="table table-hover table-light" width="100%" >
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
             				<td><input class="btn btn-success" type="button" name="set_delivery" value="set Delivered" /></td>
             			</tr>
             		</table>
             </td></tr>
             </table>
        </table1--> 
    </body>
</html>
