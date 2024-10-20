<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register_page</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="css/register.css">

</head>
<body>

	<section id="sec1">
		<%@include file="navbar.jsp"%>
	</section>

	<section id="sec2">
		<div class="containerrr">
		<form action="<%=request.getContextPath()%>/register" method="post">

			<h1>Registration Form</h1>
			<hr class="linehr">
			<table>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName"
						placeholder="firstName" required /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName" placeholder="lastName"
						required /></td>
				</tr>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="userName" placeholder="userName"
						required /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"
						placeholder="password" required /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address"
						placeholder="Enter your address" required /></td>
				</tr>
				<tr>
					<td>Contact No</td>
					<td><input type="text" name="contact"
						placeholder="Enter mobile" required /></td>
				</tr>
			</table>
			<!-- <input type="submit" value="Submit" /> -->
			<button class="btn" id="btn1">Register</button>
		</form>
	</div>
	</section id="sec3">
	
	<section>
		<%@include file="footerSection.jsp"%>
	</section>

</body>
</html>