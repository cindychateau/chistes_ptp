<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Directorio de Chistes</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			
			<h1>¡Directorio de Chistes!</h1>
			
			<c:forEach items="${chistes}" var="chiste">
				<div class="col-3">
				<div class="card">
					<div class="card-body">
						${chiste.contenido}
					</div>
				</div>
			</div>
			</c:forEach>
			
		</div>
	</div>
</body>
</html>