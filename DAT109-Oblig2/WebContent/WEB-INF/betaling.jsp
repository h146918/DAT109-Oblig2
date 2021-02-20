<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
	<h1>Regning</h1>
	<form action="SokServlet" method="get">
	<p>Du har leid bilen i ${totalDager} dager</p>
	<p>Beløp å betale er ${totalPris}kr</p>
	<p>${gebyrMelding}</p>
	<button type="submit">Lei ny bil</button>
	</form>
	</fieldset>
</body>
</html>