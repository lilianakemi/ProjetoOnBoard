<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Login</title>

<link rel="stylesheet"
href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
crossorigin="anonymous">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css" integrity="sha256-46r060N2LrChLLb5zowXQ72/iKKNiw/lAmygmHExk/o=" crossorigin="anonymous" />

<link rel="stylesheet" href="./css/style.css">

</head>
<body>



<article class="main">

<article class="principal pagina1_2">

 <div class="container-fluid my-4">
<form method="get" name="dadosGame" id="dadosGame" action="InserirDados.jsp">


<div class="my-4">
<input type="text" name="nome" id="nome" class="form-control" placeholder="Primeiro Nome">
</div>

<div class="my-4">
<input type="text" name="matricula" id="matricula" class="form-control"
placeholder="Matricula de 4 digitos">
</div>


<div>
<button type="submit" id="logar" class="btn btn-info">Logar</button>
</div>


</form>
</div>

</article> <!-- principal -->
</article> <!-- main -->


</body>
</html>