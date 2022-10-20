<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>PRODUCT INDEX</h1>
	<form action = "/productIndex" method = "post">
	</form>
	<form action = "addItem" method = "post">
		<input type = "submit" name = "register" value = "Add a product">
	</form>
	<form action = "allProducts" method = "post">
		<input type = "submit" name = "displayAllProducts" value = "Display all products">
	</form>
		<form action = "searchProduct" method = "post">
		<input type = "submit" name = "delete a product" value = "Search a product">
	</form>
	</form>
		<form action = "deleteProduct" method = "post">
		<input type = "submit" name = "delete a product" value = "Delete a product">
	</form>
</body>
</html>