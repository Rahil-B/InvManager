<%-- 
    Document   : CollectionManager
    Created on : 20 Apr, 2020, 12:54:53 PM
    Author     : RAHIL
--%>

<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="Models.Supplies"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <script>
            function genReceipt(att1){
                window.location.replace("/InvManager/templates/CollectionManager/Receipt.jsp?"+att1);
                
            }
        </script>
        
        
    	<tbl1>
        <table border='1'  width="100%"  align="center" style="height:200px">
             <tr><td><a href="/InvManager/CollectionManager/CollectionManagerHome">Home</a></td>
             <td colspan="5" rowspan="10">
             		Table for upcoming supplies //which are approved
             		<table border="1" width="100%" >
             			<tr>
             				<th>Supply no.</th>
             				<th>Fruit</th>
             				<th>Quantity(Kg.)</th>
             				<th>Source</th>
             				<th>Request Date</th>
                                        <th>Supply Date</th>
             				<th>Action</th>
             			</tr>
             			<tr>
             				<td>S2001240001</td>
             				<td>Mangoe</td>
             				<td>30</td>
             				<td>F0100100001</td>
             				<td>24/01/2020</td>
                                        <td>30/01/2020</td>
             				<td><input type="button" name="gen_rec" value="Generate receipt"/></td>
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
                                        <td><%=s.getRequestDate()%></td>
                                        <td><%=s.getSupplyDate()%></td>
             				<td><input type="button" name="gen_rec" value="Generate Receipt" onclick='genReceipt("<%=
                                                "supplyId="+s.getSupplyId()+"&fruitId="+s.getFruitId()+"&fruitName="+fruit_names.get(s.getFruitId())+"&quantity="+s.getQuantity()
                                                           +"&source="+s.getSourceType()+s.getSourceId()+"&requestDate="+s.getRequestDate()
                                                           +"&supplyDate="+s.getSupplyDate()+"&desId="+s.getDesId()%>")' 
                                                           <%if(s.getDesId()<=0){%><%="disabled"%><%}%>
                                                           /></td>
             			</tr>
                                <%}%>
                                
             		</table>
             </td></tr>
             <tr><td><a href="/InvManager/CollectionManager/NewSupply">New Supply</a></td></tr>             
             <tr><td><a href="/InvManager/CollectionManager/Supplies">My Supplies</a></td></tr>
             <tr><td><a href="/InvManager/CollectionManager/History">View Supply History</a></td></tr>
             <tr><td><a href="/InvManager/Login/LogOut.jsp">Log out</a></td></tr>
        </table>
        </tbl1> 
    </body>
</html>
