<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "entidades.Usuario" %>
<%@ page import= "java.util.ArrayList" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

<title>Listado de Usuarios</title>
</head>
<body>
<%@include file="menu.jsp" %>
	
	<div>
		<div class="d-flex justify-content-center">
				
											
							
					<%System.out.println("llego al listado"); %>
						
						<%
						if(request.getAttribute("listadoUsuarios")!= null){
							int a = 0;
							ArrayList<Usuario> lista = (ArrayList<Usuario>)request.getAttribute("listadoUsuarios");
							
							%>
							<table class= "table table-dark table-striped w-25 p-3   table-bordered">
								<thead>
									<tr>
										<td scope="col"> Usuario</td>
										<td scope="col"> Pass </td>	
										<td scope = "col">IdTipoUsuario </td>
										<td scope = "col">Estado </td>
										<td scope = "col">NroCliente </td>
									</tr>
								</thead>		
							<%
							for(Usuario item : lista) {
								a++;
								%>
								
								<tbody>
									<tr>
										<td> <%=item.getIdUsuario() %></td>
										<td> <%=item.getPass() %> </td>	
										<td> <%if(item.getTipoUsuario().getIdTipoUsuario() == 1) {%> ADMINISTRADOR <% } else { %>  CLIENTE <%}%></td>
										 <%if(item.isEstado()) {%><td class="text-success"> ACTIVO </td><%} else {%> <td class="text-danger">INACTIVO</td> <%} %> 
										<td><%=item.getNumeroCliente()%></td>
									
									</tr>
									
								</tbody>		
								
								
							
								
								<%
								
							}
							%>
								</table>
								<%
							}
							
							%>
					
	
		</div>
	
	</div>
		
	
	
	
</body>
</html>