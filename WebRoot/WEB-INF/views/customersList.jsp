<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>List of users</title>
</head>
<body>
<h1>List Of All Users</h1>
<h3><a href="add.html">Add New Users</a></h3>

<c:if test="${!empty customers}">
	<table align="left" border="1">
		<tr>
			<th>Customer ID</th>
			<th>Customer Name</th>
			<th>Customer Age</th>
			<th>Customer Mobile No</th>
			<th>Customer Address</th>
			<th>Customer Credit</th>
		</tr>

		<c:forEach items="${customers}" var="customer">
			<tr>
				<td><c:out value="${customer.customer_Id}" /></td>
				<td><c:out value="${customer.customer_Name}"/></td>
				<td><c:out value="${customer.customer_Age}"/></td>
				<td><c:out value="${customer.customer_MobileNo}"/></td>
				<td><c:out value="${customer.customer_Address}"/></td>
				<td><c:out value="${customer.customer_Credit}"/></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>