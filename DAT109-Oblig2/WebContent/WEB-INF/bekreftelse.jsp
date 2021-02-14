<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Bekreftelse</h1>
<p>Navn: ${Person.fornavn} ${Person.etternavn}</p>
<p>Adresse: ${Person.adresse}</p>
<p>Telefon: ${Person.telefon}</p>
<p></p>
<p>Bil</p>
<p>Regnr: ${Bil.regnr}</p>
<p>Merke: ${Bil.merke}</p>
<p>Modell: ${Bil.modell}</p>
<p>Farge: ${Bil.farge}</p>
<p>Gruppe: ${Bil.gruppe}</p>
<p></p>
<p>Leieinformasjon</p>
<p>Utleieavdeling: ${leieinformasjon.utleieavdeling}</p>
<p>Returavdeling: ${leieinformasjon.returavdeling}</p>
<p>Fra dato: ${leieinformasjon.fraDato}</p>
<p>Til dato: ${leieinformasjon.tilDato}</p>


</body>
</html>