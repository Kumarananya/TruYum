<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.text.*"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Menu Item List Admin</title>
<link rel="stylesheet" type="text/css" href="style/style.css">
</head>
<body>
	<header>
		<span class="logo-name">truYum</span> <img
			src="images/truyum-logo-light.png" class="logo-image"> <a
			href="menu-item-list-admin.html" class="edit-menu-link">Menu</a>

	</header>
	<article>


		<h1 class="table-head">Menu Items</h1>
		<table>
			<thead>
				<tr>
					<th class="name-table">Name</th>
					<th class="price-table">Price</th>
					<th>Active</th>
					<th>Date of Launch</th>
					<th>Category</th>
					<th>Free Delivery</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${menuItem}" var="element">
					<tr>
						<td class="name-table">${element.name}</td>
						<td class="price-table">Rs. <fmt:formatNumber type="number"
								maxFractionDigits="2" value="${element.price}" /></td>
						<td>${element.active eq true  ? 'Yes' : 'No'}</td>
						<td><fmt:formatDate value="${element.dateOfLaunch}"
								pattern="dd/MM/yyyy" /></td>
						<td>${element.category}</td>
						<td>${element.freeDelivery eq true  ? 'Yes' : 'No'}</td>
						<td><a href="edit-menu-item.html">Edit</a></td>
					</tr>
				</c:forEach>


			</tbody>
		</table>

	</article>
	<footer>
		<p class="footer-text">Copyright &copy; 2019</p>
	</footer>
</body>
</html>