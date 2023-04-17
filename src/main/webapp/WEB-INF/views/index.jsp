<%@page import="com.customer.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
	<h1>Customers List</h1>
	<table border="1">
		<tr>
			<th>Customer ID</th>
			<th>Customer Name</th>
			<th>Product Phone</th>
			<th>Product Address</th>
			<th>Actions</th>
		</tr>
		
		<!-- Using JSP to get the products list from the model -->
		<%
			List<Customer> customers = (List<Customer>) request.getAttribute("customers");
		
			if(customers != null) {
				
			
			// Iterating through the list of products with a loop
			for(Customer customer : customers) {
	
		%>
		
		<tr>
			<td><%= customer.getId() %></td>
			<td><%= customer.getName() %></td>
			<td><%= customer.getPhone() %></td>
			<td><%= customer.getAddress() %></td>
			<td>
				<a href="update?id=<%= customer.getId() %>">Edit</a>
				<a href="delete?id=<%= customer.getId() %>">Delete</a>
			</td>
		</tr>
		
		<%
				}	
			}
		%>
		
	</table>
	<a href="add">Add Product</a>
</body>
</html>
