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
	<p>
	Utleieavdeling
		<select name="utleieavdeling"> 
			<option value="Bergen" selected="selected">Bergen</option>
			<option value="Oslo">Oslo</option>
			<option value="Stavanger">Stavanger</option>
			<option value="Trondheim">Trondheim</option>
		</select>
		</p>
		
		<p>
		Returavdeling
		<select name="returavdeling"> 
			<option value="Bergen" selected="selected">Bergen</option>
			<option value="Oslo">Oslo</option>
			<option value="Stavanger">Stavanger</option>
			<option value="Trondheim">Trondheim</option>
		</select>
		</p>
		
	
	<p>Fra: <input id="fraDato" type="date" name="fraDato"></p>
	<p>Til: <input id="tilDato" type="date" name="tilDato"></p>
	
	
			<div>
				<button id="btn" type="submit">Send inn</button>
			</div>
	
		</fieldset>
	</form>

</body>
</html>