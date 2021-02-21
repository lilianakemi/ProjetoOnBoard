<%@page import ="br.com.fiap.dao.Dados"%>
<%@page import ="br.com.fiap.bean.Jogada"%>
<%@page import ="br.com.fiap.bean.Pessoa"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="pt-br" dir="ltr">
  <head>
    <meta charset="ISO-8859-1">
    <meta name="view" content="width=device-width,initial-scale=1">
    <title>B2W</title>
    

  <!--  link da font awsome  -->

  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css" 
  integrity="sha256-46r060N2LrChLLb5zowXQ72/iKKNiw/lAmygmHExk/o=" crossorigin="anonymous" />

  <link rel="stylesheet" href="./css/style.css">

  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
  integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

  </head>
  
  <body>

<!--conteudo principal -->

<article class="main">

  <!-- tabela das pontuacoes  -->
 
  
<section class="chamada chamada-direita">

		<div class="container-fluid my-4">
			<div class="row">
				<div class="col-12 col-sm-12 col-md-12 col-lg-6">
          <h2 class="display-7">Bem Vindo(a)</h2>
          
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
          
             <%
          for (Jogada j:Dados.jogada){
          %>
          <tbody>
           <tr>
          <th scope="my-4">Matricula:</th><%=j.getNumeroMatricula()%>
            </tr>
          </tbody>
          <%
          }
          %>
  
          
          <table class="table">
            <div class="container-fluid my-4">
            
    		<tbody>
                 <tr>
                <th scope="my-4">Pontuacao</th>
                <td class="matricula"><%=request.getAttribute("somaPontuacao")%></td>
              </tr>
            </tbody>

    		<tbody>
                 <tr>
                <th scope="my-4">Tarefas</th>
                <td class="matricula"><%=request.getAttribute("somaTarefas")%></td>
              </tr>
            </tbody>
 </div>

</table>
</section>

<!-- Botoes das fases  -->


<article class="principal pagina1">


<div class="container">

  <div class = "box box-1"><a href="quiz.html"><img src="./images/botaoIndice_1.png"></a></div>
  <div class = "box box-1"><a href="task.html"><img src="./images/botaoIndice_1.png"></a></div>
  <div class = "box box-1"><a href="task2.html"><img src="./images/botaoIndice_1.png"></a></div>
  <div class = "box box-1"><a href=""><img src=""></a></div>
  <div class = "box box-1"><a href=""><img src=""></a></div>
  
</div>

<div class="container">

  <div class = "box box-1"><a href="quiz2.html"><img src="./images/botaoIndice_1.png"></a></div>
  <div class = "box box-1"><a href="task3.html"><img src="./images/botaoIndice_1.png"></a></div>
  <div class = "box box-1"><img src="./images/botaoIndice_2.png"></div>
  <div class = "box box-1"><a href=""><img src=""></a></div>   
 <div class = "box box-1"><a href="index.jsp" target='blank'><img src="./images/bot.png"></a></div>

</body>
</div>
  
</article> <!-- principal -->
</article> <!-- main -->

</body>
</html>