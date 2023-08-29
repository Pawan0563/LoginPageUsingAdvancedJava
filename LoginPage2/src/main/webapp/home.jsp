<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>





<%@ page import="com.entites.User"%>

<%
User us = (User) session.getAttribute("user-obj");
if (us == null) {
	session.setAttribute("login-msg", "Please first...");
	response.sendRedirect("login.jsp");

}
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link href="css/style.css" rel="stylesheet" type="text/css">



</head>
<body
	style="background-image: linear-gradient(to right top, #37051a, #722221, #9f5212, #b08f00, #9ad21e); background-repeat: no-repeat; background-attachment: fixed; background-size: cover;">



	<nav class="navbar navbar-expand-lg navbar-light bg-light bg-custom">
		<a class="navbar-brand" href="#">Navbar</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link"
					href="index.jsp">Home <span class="sr-only">(current)</span></a></li>
				<li class="nav-item"><a class="nav-link" href="login.jsp">Login</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="register.jsp">Register</a>
				</li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>


	<div class="container">
		<div class="row d-flex justify-content-center align-item-center mt-4">
			<div class="col-md-6">
				<div class="card">


					<%
					User us1 = (User) session.getAttribute("user-obj");
					%>


					<%
					if (us1 != null) {
					%>

					<div class="card-body">



						<h1>
							Name:-
							<%=us1.getName()%></h1>
						<h1>
							Email:-<%=us.getEmail()%></h1>
						<div class="container text-center">
							<a class="btn btn-primary btn-lg text-white "
								href="LogoutServlet">Logout</a>
						</div>

					</div>

					<%
					}
					%>

				</div>

			</div>

		</div>
	</div>



</body>
</html>