<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Alterar Passagem</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
	crossorigin="anonymous"></script>

</head>
<body>

	<div class="container">
		<h5>Alterar Passagem ${passagem.id}</h5>
		<form action="passagem-editar" method="post" class="form-control">
		
				<p>
					<input type="hidden" value="${passagem.id}"
						name="id" size="40" class="form-control" required>
				</p>

			<p>
					<label for="id_cidade">Id da Cidade:</label> <input type="text" id="id_cidade"
						value="${passagem.id_cidade}" name="id_cidade" size="40" class="form-control" required>
				</p>

				<p>
					<label for="valor">Valor:</label> <input type="number" value="${passagem.valor}"
						id="valor" name="valor" size="15" class="form-control" required>
				</p>
				<p>
					<label for="desconto">Desconto:</label> <input type="number" value="${passagem.desconto}"
						id="desconto" name="desconto" size="15" class="form-control" required>
				</p>
				
				<p>
					<label for="valorPromocional">Valor Promocional:</label> <input type="number" value="${passagem.valor_promocional}"
						id="valorPromocional" name="valorPromocional" size="15" class="form-control" required>
				</p>
				
				<p>
					<label for="dataida">Data Ida:</label> <input type="date" value="${passagem.data_ida}"
						id="dataida" name="dataida" size="15" class="form-control" required>
				</p>
				
				<p>
					<label for="datavolta">Data Volta:</label> <input type="date" value="${passagem.data_volta}"
						id="datavolta" name="datavolta" size="15" class="form-control" required>
				</p>
			<button type="submit" class="btn btn-success">Atualizar</button>
		</form>
	</div>
</body>
</html>