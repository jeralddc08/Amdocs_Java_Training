<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.ArrayList" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Product ID - Product Name</h2>
	<c:forEach items = "${productList}" var="prod">
			<p>${prod.productId} ${prod.productName}</p>
	</c:forEach>
	<form action = "removeFromDatabase" method = "post">
		Product ID: <input type = "text" name = "pid"><br><br>
		<input type = "submit" value = "Delete the product">
	</form>
</body>
</html>