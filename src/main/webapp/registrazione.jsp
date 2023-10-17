<%@ include file="/WEB-INF/jsp/head.jsp" %>
<body>
	<%@ include file="/WEB-INF/jsp/header.jsp" %>
	<h1>Registrazione</h1>	
	<form class="formRegistrazione" novalidate name="formRegistrazione" id="formRegistreazione" method="post" action="./register">

		<div class="form-item">
		<label for="surname">Cognome</label>
		<input type="text" name="cognome" class="form-control" id="surname" placeholder="Cognome" required >
		</div>
		<div class="form-item">
		<label for="name">Nome</label>
		<input type="text" name="nome" class="form-control" id="name" placeholder="Nome" required >
		</div>
		<div class="form-item">
		<label for="codFiscale">Codice Fiscale</label>
		<input type="text" name="codiceFiscale" class="form-control" id="codFiscale" aria-describedby="inputGroupPrepend" placeholder="Codice Fiscale" required >
		</div>
		<div class="form-item">
		<label for="pIva">Partita IVA</label>
		<input type="text" name="partitaIva" class="form-control" id="pIva" placeholder="Partita IVA" >
		</div>
		<div class="form-item">
		<label for="mail">Email</label>
		<input type="text" name="mail" class="form-control" id="mail" placeholder="Email" required >
		</div>
		<div class="form-item">	
		<label for="indirizzo">Indirizzo</label>
		<input type="text" name="indirizzo"  class="form-control" id="indirizzo" placeholder="Indirizzo" required >
		</div>
		<div class="form-item">
		<label for="cap">CAP</label>
		<input type="text"  name="cap" class="form-control" id="cap" placeholder="CAP" required >
		</div>
		<div class="form-item">
		<label for="city">Citt&agrave;</label>
		<input type="text" name="citta"  class="form-control " id="citta" placeholder="Citta'" required >
		</div>
		<div class="form-item">
		<label for="provincia">Provincia</label>
		<input type="text" name="provincia"  class="form-control col-xs-2" id="provincia" placeholder="Provincia" required >
		</div>
		<div class="form-item">
		<label for="nazione">Nazione</label>
		<input type="text" name="nazione" value="Italia"  class="form-control col-xs-2" id="nazione" placeholder="Nazione" />
		</div>
		<div class="form-item">
		<label for="telefono">Telefono</label>
		<input type="text" name="telefono"  class="form-control" id="telefono" placeholder="Numero di telefono" >
		</div>
		<div class="form-item">
		<label for="username">Username</label>
		<input type="text"  name="username"  class="form-control" id="username" placeholder="Username" required >
		</div>
		<div class="form-item">
		<label for="password">Password</label>
		<input type="password" name="userpass" class="form-control" id="password" placeholder="Password" required>
		</div>

		<div class="form-button">
			<a href="./index.html" class="btn btn-warning">Annulla</a>
		</div>
		<div class="form-button">
			<input type="submit" class="btn btn-primary" value="Registrazione" />		
		</div>			
	</form>
	<%@ include file="/WEB-INF/jsp/footer.jsp" %>	
</body>
</html>