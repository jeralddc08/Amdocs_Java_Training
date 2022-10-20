<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action = "searchDatabase" method = "post">
		Product ID: <input type = "text" name = "pid"><br><br>
		<input type = "submit" value = "Search the product">
	</form>
	${product.productName} ${product.cost}
</body>
</html>