<%@ include file="/WEB-INF/jsp/head.jsp" %>
<body>
	<%@ include file="/WEB-INF/jsp/header.jsp" %>
	<h1>Prodotto</h1>	
	<div class="cardSection">
		<c:if test="${prodotto!=null}">
		
			<div class="card">  
			  		<img  src=${prodotto.imageFileName}>
			  		<div class="card-body">
			   			<h5>${prodotto.titolo}</h5>
			   			<p>${prodotto.sottotitolo}</p>
			   			<h6>&euro; ${prodotto.prezzo}</h6>
			  		</div>
			</div>
		</c:if>
		<c:if test="${error!=null}">
			<p>${error.message}</p>
		</c:if>
	</div>	
	<%@ include file="/WEB-INF/jsp/footer.jsp" %>	
</body>
</html>