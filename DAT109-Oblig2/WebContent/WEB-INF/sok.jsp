<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form id="form" action="SokServlet" method="post" >
	<fieldset>
	<h1>Søk etter biler</h1>
	<div> Utleieavdeling
		<select name="utleieavdeling"> 
			<option value="Bergen" selected="selected">Bergen</option>
			<option value="Oslo">Oslo</option>
			<option value="Stavanger">Stavanger</option>
			<option value="Trondheim">Trondheim</option>
		</select>
		</div>
		
		<div>Returavdeling
		<select name="returavdeling"> 
			<option value="Bergen" selected="selected">Bergen</option>
			<option value="Oslo">Oslo</option>
			<option value="Stavanger">Stavanger</option>
			<option value="Trondheim">Trondheim</option>
		</select>
		</div>
		
	
	<div>Fra: <input id="fraDato" type="date" name="fraDato"></div>
	<div>Til: <input id="tilDato" type="date" name="tilDato"></div>
	
	
			<div>
				<button id="btn" type="submit">Søk</button>
			</div>
	
		</fieldset>
	</form>

</body>
</html>