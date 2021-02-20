<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form id="reserver" action="LeverServlet" method="post">
	<fieldset>
	<h1>Retur</h1>
			<div>
				<label for="regnr">Regnr:</label> 
				<input id="regnr" type="text"
					name="regnr" value="${regnr}"  required/> 
					<font color="red" >${feilregnr}</font>
			</div>
		
			<div>
				<label for="kilometerstand">Kilometerstand:</label> 
				<input id="kilometerstand" type="text"
					name="kilometerstand" value="${kilometerstand}"  required/> 
					<font color="red" >${feilKilometerstand}</font>
			</div>
			
			<div>Dato: <input id="returDato" type="date" name="returDato"></div>
		
			<div>Returavdeling
		<select name="returavdeling"> 
			<option value="Bergen" selected="selected">Bergen</option>
			<option value="Bergen, Flesland">Bergen, Flesland</option>
			<option value="Oslo">Oslo</option>
			<option value="Oslo, Gardermoen">Oslo, Gardemoen</option>
			<option value="Stavanger">Stavanger</option>
			<option value="Trondheim">Trondheim</option>
		</select>
		</div>
		
			<div class="pure-controls">
				<button id="btn" type="submit">Send inn</button>
			</div>
		</fieldset>
	</form>


</body>
</html>