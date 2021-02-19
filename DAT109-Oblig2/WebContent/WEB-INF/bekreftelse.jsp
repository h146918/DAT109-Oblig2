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
<div style="display: flex;">
<div style="width: 300px">
<h2>Kundeinformasjon</h2>
<p>Navn: ${Person.fornavn} ${Person.etternavn}</p>
<p>Adresse: ${Person.adresse}</p>
<p>Telefon: ${Person.telefon}</p>
<p>Kreditkort: ${Person.kreditkort}</p>
</div>
<div style="width: 300px">
<h2>Utleiekontor</h2>
<p>BestRent avd: ${utleiekontor.utleiekontorNavn}</p>
<p>Adresse: ${utleiekontor.adresse}</p>
<p>Telefon: ${utleiekontor.tlfnr}</p>
</div>
</div>

<div style="display: flex;">
<div style="width: 300px">
<h2>Bil</h2>
<p>Regnr: ${Bil.regnr}</p>
<p>Km: ${Bil.km}</p>
<p>Merke: ${Bil.merke}</p>
<p>Modell: ${Bil.modell}</p>
<p>Farge: ${Bil.farge}</p>
<p>Gruppe: ${Bil.gruppe}</p>
</div>

<div style="width: 300px">
<h2>Leieinformasjon</h2>
<p>Utleieavdeling: ${leieinformasjon.utleieavdeling}</p>
<p>Returavdeling: ${leieinformasjon.returavdeling}</p>
<p>Fra dato: ${leieinformasjon.fraDato.date}-${leieinformasjon.fraDato.month}-${leieinformasjon.fraDato.year}</p>
<p>Til dato: ${leieinformasjon.tilDato.date}-${leieinformasjon.tilDato.month}-${leieinformasjon.tilDato.year}</p>
</div>
</div>

<button type="submit">Hent bilen </button>
</form>
<form action="SokServlet" method="get">
<p></p>
<button type="submit">Lei ny bil</button>

</form>
</fieldset>
</body>
</html>