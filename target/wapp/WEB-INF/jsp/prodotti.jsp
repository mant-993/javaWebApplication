<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.wapp.servlet.*" %>
<%@ page import="com.wapp.bean.*" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Prodotti</h1>
	
	<c:forEach items="${prodotti}" var="prodotto" > 
	
	<div class="row">  
		<div class="col-4 card">
		<div class="mt-auto mb-auto">
	  		<img class="card-img-top img-fluid" src=${prodotto.imageFileName}>
	  		<div class="card-body">
	   			<h5 class="card-title">${prodotto.titolo}</h5>
	   			<p class="">${prodotto.sottotitolo}</p>
	   			<h6 class="card-subtitle mb-2 text-muted">&euro; ${prodotto.prezzo}</h6>
	   			<a href="/bookstore/store/prodotto?id=${prodotto.idProdotto}" class="btn btn-primary">Dettagli</a>
	  		</div>
	  	</div>	
		</div>        
	</div>

	</c:forEach>
	
	
</body>
</html>