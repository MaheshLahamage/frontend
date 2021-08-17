<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Registration Page</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<div class="container jumbotron">
		<form action="reg" method="Get">
			User Id : <input type="number" name="id" /><br>
			Username : <input type="text" name="username" /><br>
			Email : <input type="email" name="email" /><br>
			Address : <input type="text" name="address" /><br>
			Reg date : <input type="text" name="reg_date" /><br>
			Upload_photo : <input type="text" name="upload_photo" /><br>
			Password : <input type="password" name="password" /><br>
			Phone# : <input type="number" name="phone" /><br>
			<input type="submit" values="sign Up" /><br>
		</form>
	</div>
</body>
</html>