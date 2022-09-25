<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
    
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
		<h3>Cadastro de Passagem</h3>
		<form action="passagem-inserir" method="post" class="form-control">
			<fieldset>
				<legend>Dados da Passagem</legend>
					<!-- <jstl:if test="${error.toString() == '-1'}">
					<p>Essa cidade não consta no banco de dados!</p>
					</jstl:if> -->

				<p>
					<label for="id_cidade">Id da Cidade:</label> <input type="text" id="id_cidade"
						name="id_cidade" size="40" class="form-control" required>
				</p>

				<p>
					<label for="valor">Valor:</label> <input type="number"
						id="valor" name="valor" size="15" class="form-control" required>
				</p>
				<p>
					<label for="desconto">Desconto:</label> <input type="number"
						id="desconto" name="desconto" size="15" class="form-control" required>
				</p>
				
				<p>
					<label for="valorPromocional">Valor Promocional:</label> <input type="number"
						id="valorPromocional" name="valorPromocional" size="15" class="form-control" required>
				</p>
				
				<p>
					<label for="dataida">Data Ida:</label> <input type="date"
						id="dataida" name="dataida" size="15" class="form-control" required>
				</p>
				
				<p>
					<label for="datavolta">Data Volta:</label> <input type="date"
						id="datavolta" name="datavolta" size="15" class="form-control" required>
				</p>

				<p>
					<input type="submit" value="Cadastrar passagem"
						class="btn btn-primary">
				</p>
			</fieldset>
		</form>
		
		<table class="table">
        <thead>
            <tr>
                <th>Id</th>
                <th>Id da Cidade</th>
                <th>Valor</th>
                <th>Desconto</th>
                <th>Valor Promocional</th>
                <th>Data Ida</th>
                <th>Data Volta</th>
                <th>Ações</th>
            </tr>
        </thead>
        <tbody>
            <jstl:forEach items="${passagens}" var="passagem">
                <tr>
                    <td>${passagem.id}</td>
                    <td>${passagem.id_cidade}</td>
                    <td>${passagem.valor}</td>
                    <td>${passagem.desconto}</td>
                    <td>${passagem.valor_promocional}</td>
                    <td>${passagem.data_ida}</td>
                    <td>${passagem.data_volta}</td>
                    <td>
                        <a href="passagem-editar?id=${passagem.id}" class="btn btn-success">Editar</a>  
                        <a href="passagem-excluir?id=${passagem.id}" onclick="return confirm('Deseja Excluir?')" class="btn btn-danger">Excluir</a>
                    </td>
                </tr>
            </jstl:forEach>
            
        </tbody>
    </table>
		
	</div>
</body>
</html>