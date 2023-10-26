<%@ include file="/WEB-INF/jsp/head.jsp" %>
<body>
	<%@ include file="/WEB-INF/jsp/header.jsp" %>
	<div class="main">
		<h1>Login</h1>	
		<div class = "container">
			<div class="formSection">
				<form name="formLogin" id="formLogin" action="./login" method="post" >
			  		<div class="form-group">
			   			<label for="InputU">Utente</label>
			      		<input type="text" name="username" class="form-control" id="InputU" aria-describedby="emailHelp" placeholder="Inserisci qui il tuo nome Utente" required>
			 	    </div>
			  		<div class="form-group">
			   	    	<label for="InputP">Password</label>
			      		<input type="password" name="userpass" class="form-control" id="InputP" placeholder="Inserisci qui la tua Password" required>
			        </div>
			        <div class = "form-group">
			      		<button type="submit" class="btn btn-primary btn-sm">Login</button>
			        </div>
		        </form>
			</div>
			<div class="toRegistrazione"></div>
				Sei un nuovo utente ? <a href="/wapp/register" class="badge badge-primary">Registrati</a>
			</div>
		</div>
	</div>
	<%@ include file="/WEB-INF/jsp/footer.jsp" %>	
</body>
</html>