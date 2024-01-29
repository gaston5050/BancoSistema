<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ page import= "dao.IDaoProvincia" %>
<%@ page import = "dao.IDaoLocalidad" %>
<%@ page import= "daoImplementado.DaoLocalidadImplementado" %>
<%@ page import = "entidades.Localidad" %>

<%@ page import= "negocioImplementado.NegocioClienteImplementado" %>

<%@ page import= "java.util.ArrayList" %>

<%@ page import= "daoImplementado.DaoProvinciaImplementado" %>
<%@ page import = "entidades.Provincia" %>

<%@ page import = "entidades.Usuario" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

<title>Inicio</title>
</head>
<body>

  <%@include file="menu.jsp" %>
<%
NegocioClienteImplementado x = new NegocioClienteImplementado ();
nt [] vector = new int[5];
try
{
	vector[0]=10;
	vector[1]=35;
	vector[2]=40;
	vector[3]=50;
	vector[4]=30;
	vector[5]=30;
}
	catch (Exception_DNI e){
		
		
	}
%>

</body>
</html>