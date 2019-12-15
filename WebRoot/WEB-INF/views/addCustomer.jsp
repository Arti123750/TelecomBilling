<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Telecome Billing System</title>
	</head>
	<body>
		<h2>Add Customer Data</h2>
		<form:form method="POST" action="/telecombilling/save.html">
	   		<table>
			    <tr>
			        <td><form:label path="customer_Id">Customer ID:</form:label></td>
			        <td><form:input path="customer_Id" value="${customer.customer_Id}" readonly="true" /></td>
			    </tr>
			    <tr>
			        <td><form:label path="customer_Name">Customer Name:</form:label></td>
			        <td><form:input path="customer_Name" value="${customer.customer_Name}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="customer_Age">Customer Age:</form:label></td>
			        <td><form:input path="customer_Age" value="${customer.customer_Age}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="customer_MobileNo">Customer Mobile No:</form:label></td>
			        <td><form:input path="customer_MobileNo" value="${customer.customer_MobileNo}"/></td>
			    </tr>
			    
			    <tr>
			        <td><form:label path="customer_Address">customer Address:</form:label></td>
                    <td><form:input path="customer_Address" value="${customer.customer_Address}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="customer_Credit">Customer Credit:</form:label></td>
                    <td><form:input path="customer_Credit" value="${customer.customer_Credit}"/></td>
			    </tr>
			    <tr>
			      <td colspan="2"><input type="submit" value="Submit"/></td>
		      </tr>
			</table> 
		</form:form>
		
  <c:if test="${!empty customers}">
		<h2>List of All Users</h2>
	<table align="left" border="1">
		<tr>
			<th>Customer ID</th>
			<th>Customer Name</th>
			<th>Customer Age</th>
			<th>Customer Mobile No</th>
			<th>Customer Address</th>
			<th>Customer Credit</th>
			<th>Actions on Row</th>
		</tr>

		<c:forEach items="${customers}" var="customer">
			<tr>
				<td><c:out value="${customer.customer_Id}"/></td>
				<td><c:out value="${customer.customer_Name}"/></td>
				<td><c:out value="${customer.customer_Age}"/></td>
				<td><c:out value="${customer.customer_MobileNo}"/></td>
				<td><c:out value="${customer.customer_Address}"/></td>
				<td><c:out value="${customer.customer_Credit}"/></td>
				
				
				<td align="center"><a href="edit.html?customer_Id=${customer.customer_Id}">Edit</a> | <a href="delete.html?customer_Id=${customer.customer_Id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
	</body>
</html>