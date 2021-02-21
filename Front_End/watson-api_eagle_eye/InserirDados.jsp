<%@page import ="br.com.fiap.dao.Dados"%>
<%@page import ="br.com.fiap.bean.Jogada"%>
<%@page import ="br.com.fiap.bean.Pessoa"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserindo Dados </title>
</head>
<body>

<%
// Recuperar os dados digitados 


Jogada j= new Jogada();

j.setNomeFuncionario(request.getParameter("nome")); 
j.setNumeroMatricula(Integer.parseInt(request.getParameter("matricula"))); 


// Gravar no array 

Dados.jogada.add(j); 

request.getRequestDispatcher("index2.jsp").forward(request,response);
%>

</body>
</html>