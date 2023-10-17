<%@ include file="/WEB-INF/jsp/head.jsp" %>
<body>
	<%@ include file="/WEB-INF/jsp/header.jsp" %>
	<div class="errorSection">
		<c:if test="${error!=null}">
			<h4>${error.message}</h4>
		</c:if>
		<a href="/wapp/">Back to Home</a>
	</div>
	<%@ include file="/WEB-INF/jsp/footer.jsp" %>	
</body>
</html>