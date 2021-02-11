<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form id="form" action="" method="post" >
	<fieldset>
	
		<select name="avdeling">
			<option value="Bergen" selected="selected">Bergen</option>
			<option value="Oslo">Oslo</option>
			<option value="Stavanger">Stavanger</option>
			<option value="Trondheim">Trondheim</option>
		</select>
		
		
	
	<p><input type="date" name="someDate">A date</p>
	
	
			<div class="pure-control-group">
				<label for="fornavn">:</label> 
				<input id="fornavn" type="text"
					name="fornavn" value="${fornavn}"  required/> 
					<font color="red" >${feilFornavn}</font>
			</div>
	
		</fieldset>
	</form>

</body>
</html>