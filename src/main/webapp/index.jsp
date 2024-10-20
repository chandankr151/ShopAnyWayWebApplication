<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>HomePage</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="path/to/font-awesome/css/font-awesome.min.css">

<link rel="stylesheet" href="css/register.css">

</head>
<body>

	<!-- <div class="mainSection"> -->

		<section id="sec1">
			<%@include file="navbar.jsp"%>
		</section>

		<section id="sec2">
			<h1 style="text-align: center">Welcome to home page</h1>
			<h2 style="text-align: center">Use menu bar</h2>
		</section>

		<section id="sec3">
			<%@include file="footerSection.jsp"%>
		</section>
	<!-- </div> -->
</body>
</html>
