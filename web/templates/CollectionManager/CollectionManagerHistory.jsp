<%-- 
    Document   : CollectionManagerHistory
    Created on : 20 Apr, 2020, 8:09:41 PM
    Author     : RAHIL
--%>

<%@page import="java.sql.Date"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
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

        <title>History</title>
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
        <table width="100%"  align="center" style="height:200px">
            
             <td colspan="5" rowspan="10">
                 <h3>Supply History </h3><br>
             		<table class="table table-hover table-light" width="100%" >
             			<tr>
             				<th>Supply no.</th>
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
                                    HashMap<Integer,String> fruit_names=(HashMap<Integer,String>)request.getAttribute("fruit_names");
                                    for(Supplies s:supplies_list){
                                %>
                                
                                <%if(prevDate==null||prevDate.compareTo(s.getRequestDate())!=0){%>
                                <tr><td colspan="7"><h4><%=s.getRequestDate()%></h4></td></tr>
                                <%prevDate=s.getRequestDate();%>
                                <%}%>
                                
                                <tr>
                                    <td><%=s.getSupplyId()%></td>
                                    
                                    <td><%=fruit_names.get(s.getFruitId())%></td>
             				<td><%=s.getQuantity()%></td>
                                        <td><%=s.getSourceType()+s.getSourceId()%></td>
                                        <td><%=s.getRequestDate()%></td>
                                        <td><%=s.getSupplyDate()%></td>
                                        
                                        <td><input type="button" class="btn btn-success" name="gen_rec" value="Generate Receipt" onclick='genReceipt("<%=
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
    </body>
</html>
