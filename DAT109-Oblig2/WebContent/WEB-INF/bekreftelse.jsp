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
<form id="bekreft" action="BekreftelseServet" method="post">
<h1>Bekreftelse</h1>
<p>Navn: ${Person.fornavn} ${Person.etternavn}</p>
<p>Adresse: ${Person.adresse}</p>
<p>Telefon: ${Person.telefon}</p>
<p>Kreditkort: ${Person.kreditkort}</p>
<p></p>
<p>Bil</p>
<p>Regnr: ${Bil.regnr}</p>
<p>Km: ${Bil.km}</p>
<p>Merke: ${Bil.merke}</p>
<p>Modell: ${Bil.modell}</p>
<p>Farge: ${Bil.farge}</p>
<p>Gruppe: ${Bil.gruppe}</p>
<p></p>
<p>Leieinformasjon</p>
<p>Utleieavdeling: ${leieinformasjon.utleieavdeling}</p>
<p>Returavdeling: ${leieinformasjon.returavdeling}</p>
<p>Fra dato: ${leieinformasjon.fraDato.date} - ${leieinformasjon.fraDato.month} - ${leieinformasjon.fraDato.year}</p>
<p>Til dato: ${leieinformasjon.tilDato.date} - ${leieinformasjon.tilDato.month} - ${leieinformasjon.tilDato.year}</p>
<button type="submit">Hent bilen </button>
</form>
<form action="SokServlet" method="get">
<p></p>
<button type="submit">Lei ny bil</button>

</form>
</fieldset>
</body>
</html>