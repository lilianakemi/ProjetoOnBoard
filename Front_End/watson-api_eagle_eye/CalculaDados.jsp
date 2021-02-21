<%@page import="br.com.fiap.bean.Pessoa" %>

<%@page import="br.com.fiap.dao.Dados" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% 
	Pessoa p = new Pessoa();
	int pontuacao = 10;
	int tarefas = 1; 
	int somaPontuacao = 0;
	int somaTarefas=0; 
	
	p.setPontuacao(pontuacao);
	p.setTarefas(tarefas); 
	
	Dados.pessoa.add(p);
	
	for(Pessoa n: Dados.pessoa){
		somaPontuacao += n.getPontuacao();
	}
	
	for(Pessoa n: Dados.pessoa){
		somaTarefas += n.getTarefas();
	}
	
	request.setAttribute("somaPontuacao", somaPontuacao);
	request.setAttribute("somaTarefas", somaTarefas); 
	request.getRequestDispatcher("index2.jsp").forward(request,response);
	
	
	%>
	
</body>
</html>