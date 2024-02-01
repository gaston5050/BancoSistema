<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "entidades.Usuario" %>
<%@ page import= "java.util.ArrayList" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Listado de Usuarios</title>
</head>
<body>
<%@include file="menu.jsp" %>
	
	<div class="container ">
	
		<div class="d-flex justify-content-center w-auto small text-center">
				
											
							
					<%System.out.println("llego al listado"); %>
						
						<%
						if(request.getAttribute("listadoUsuarios")!= null){
							int a = 0;
							ArrayList<Usuario> lista = (ArrayList<Usuario>)request.getAttribute("listadoUsuarios");
							
							%>
							<table class= "table table-striped table-hover table-bordered">
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
										<td><input type= "submit" name = "btnBaja" value= "Baja" class="btn btn-danger" /></td>
										<td><input type= "submit" name = "btnModificar" value= "Modificar" class="btn btn-warning" /></td>
										<td><input type= "submit" name = "btnDatos" value= "Datos" class="btn btn-info" /></td>
										<td><input type= "submit" name = "btnMovimientos" value= "Movimientos" class="btn btn-primary" /></td>
										<td><input type= "submit" name = "btnPrestamos" value= "Prestamos" class="btn btn-success" /></td>
									
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