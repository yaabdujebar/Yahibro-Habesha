<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />


<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Yahibro-Shopping - ${title}</title>
<script>
	window.menu = '${title}';
	window.contextRoot = '${contextRoot}'
</script>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- Bootstrap core CSS -->

<link href="${vendor}/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- thyme -->


<!-- data tables css -->
<link href="${vendor}/bootstrap/css/dataTables.bootstrap.css"
	rel="stylesheet">
<!-- <link href="${css}/bootatrap-minty-theme.css" rel="stylesheet"> -->
<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">
<link href="${css}/bootstab-spacelab-theme.css" rel="stylesheet">
</head>

<body>
	<div class="wrapper">
		<!-- Navigation -->
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
			
				<a class="navbar-brand" href="${contextRoot}/home">Home</a>

 
        
		</nav>



		<div class="container">
			<div class="container">
				<div class="row">
					<div class="col-xs-12">
						<div class="jumbotron">
							<h1>${errorTitle}</h1>
							<hr />
							<blockquote style="word-wrap:break-word">${errorDescription}</blockquote>
						</div>

					</div>
				</div>

			</div>

		</div>

		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>



	</div>
</body>

</html>
