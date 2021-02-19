<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form id="reserver" action="ReserverServlet" method="post">
	<fieldset>
			<h1>Reserver bil</h1>
			<div>Ledige biler<select name="leidbil"> 
			<c:forEach var="bil" items="${biler}">
			<option value="${bil.regnr}" selected="selected">${bil.merke} ${bil.modell} - ${bil.farge} - ${bil.gruppe} - ${bil.pris} kr</option>
			</c:forEach>
		</select>
		</div>
	
	
			<div>
				<label for="fornavn">Fornavn:</label> 
				<input id="fornavn" type="text"
					name="fornavn" value="${fornavn}"  required/> 
					<font color="red" >${feilFornavn}</font>
			</div>
			<div class="pure-control-group">
				<label for="etternavn">Etternavn:</label> <input id="etternavn" type="text"
					name="etternavn" value="${etternavn}" required/> 
					<font color="red">${feilEtternavn}</font>
			</div>
			<div class="pure-control-group">
				<label for="adresse">Adresse:</label> <input id="adresse" type="text"
					name="adresse" value="${adresse}" required /> 
					<font color="red">${feilAdresse}</font>
			</div>
			<div>
				<label for="telefon">Telefon:</label> <input id="telfon" type="text"
					name="telefon" value="${telefon}" required /> 
					<font color="red">${feilTelefon}</font>
			</div>
		
			<div>
				<label for="kreditkort">Kreditkort:</label> <input id="kreditkort" type="text"
					name="kreditkort" value="${kreditkort}" required /> 
					<font color="red">${feilkreditkort}</font>
			</div>
		
			<div class="pure-controls">
				<button id="btn" type="submit">Reserver</button>
			</div>
		</fieldset>
	</form>

</body>
</html>