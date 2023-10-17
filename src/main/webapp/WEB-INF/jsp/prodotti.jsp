
<%@ include file="/WEB-INF/jsp/head.jsp" %>
<body>
	<%@ include file="/WEB-INF/jsp/header.jsp" %>


	<h1>Prodotti</h1>
	
	<div class="cardSection">
		<c:forEach items="${prodotti}" var="prodotto" > 
		
		<div class="card">  
		  		<img  src=${prodotto.imageFileName}>
		  		<div class="card-body">
		   			<h5>${prodotto.titolo}</h5>
		   			<p>${prodotto.sottotitolo}</p>
		   			<h6>&euro; ${prodotto.prezzo}</h6>
		   			<a href="/wapp/store/prodotto?id=${prodotto.idProdotto}">Dettagli</a>
		  		</div>
		</div>
	
		</c:forEach>
	</div>
	
	<%@ include file="/WEB-INF/jsp/footer.jsp" %>
</body>
</html>