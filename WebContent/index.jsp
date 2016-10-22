<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "objeto.Aluno"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Faculdade do Robertinho</title>
</head>
<body>
<img src="img/faculdade.jpg" height=100px>
<hr>
	<h1>Faculdade do Robertinho</h1>
	<h3>Cálculo de Média</h3>
	
	<form id="cadaluno" action="GerarPdfServlet" method="post">
		<fieldset>
				<a title="Formulario para cálculo"></a>
				<label for="nome">Nome:</label>
				<input type="text" name="nome" id="nome" placeholder="Nome" required>
				<br>
				<br>
				<label for="nota1">Nota 1:</label>
				<input type="number" name="nota1" id="nota1" placeholder="Nota 1" required>
				<br>
				<br>
				<label for="nota2">Nota 2:</label>
				<input type="number" name="nota2" id="nota2" placeholder="Nota 2" required>
				<br>
				<br>
				<input type="submit" title="Calcular" value="Calcular">
		</fieldset>
	</form>	
</body>
</html>