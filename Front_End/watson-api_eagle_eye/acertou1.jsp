<%@page import ="br.com.fiap.dao.Dados"%>
<%@page import ="br.com.fiap.bean.Jogada"%>
<%@page import ="br.com.fiap.bean.Pessoa"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="pt-br" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta name="view" content="width=device-width,initial-scale=1">
    <title>PARABENS</title>
    
  <!--  link da font awsome  -->

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css" integrity="sha256-46r060N2LrChLLb5zowXQ72/iKKNiw/lAmygmHExk/o=" crossorigin="anonymous" />

    <link rel="stylesheet" href="./css/style.css">
  
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
    integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
  
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
  
    </head>

    <body>
   
<!--conteudo principal --> 
<article class="main">

<article class="principal3 pagina3">

  <div class="container3">
  
    <div class = "box box-3">

          <div class = "box box-foto"><a href=""><img src="./images/foto.png"></a></div>

          <div class="containerTextoAcertou">
        
        <div class="container-fluid my-4">
           
           
           <tbody>
                 <tr>
                <%
          for (Jogada j:Dados.jogada){
          %>
          <tbody>
           <tr>
           <th scope="my-4"><h1><%=j.getNomeFuncionario()%></h1></th>
            </tr>
          </tbody>
          <%
          }
          %>
              </tr>
            </tbody>
         
          <h1>Voce esta indo bem! </h1>
          <h1 class="animate__animated animate__rubberBand">Ganhou 10 estrelas!!!</h1>
        </div>
  
  
  		 <form method="get" action= "CalculaDados.jsp">
		   <input type="hidden" name="nome">
		   <input type="submit" value="Proxima etapa">		   
		</form>
      
    </div>
  </div>
</article> <!-- principal -->
</article> <!-- main -->

</body>
</html>
