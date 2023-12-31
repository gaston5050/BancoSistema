<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "entidades.Cliente" %>
<%@ page import= "java.util.ArrayList" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

<title>Listado de Clientes</title>
</head>
<body>
<%@include file="menu.jsp" %>
	
	<div>
	  	<div class="container ">
		<div class="d-flex justify-content-center w-auto small text-center">
				
											
							
					<%System.out.println("llego al listado"); %>
						
						<%
						if(request.getAttribute("listadoClientes")!= null){
							int a = 0;
							ArrayList<Cliente> lista = (ArrayList<Cliente>)request.getAttribute("listadoClientes");
							
							%>
							<table class= "table table-striped table-hover table-bordered">
								<thead>
									<tr>
										<td scope="col"> Nro de Cliente</td>
										<td scope="col"> DNI </td>	
										<td scope = "col">CUIL </td>
										<td scope = "col">Nombre </td>
										<td scope = "col">Apellido</td>
										<td scope = "col">Estado</td>
									</tr>
								</thead>		
							<%
							for(Cliente item : lista) {
								a++;
								%>
								
								<tbody>
									<tr>
										<td> <%=item.getNroCliente() %></td>
										<td> <%=item.getDni() %></td>
										<td> <%=item.getCuil() %></td>
										<td> <%= item.getNombre()%></td>
										<td> <%=item.getApellido() %></td>
										<%if(item.isEstado()) {%><td class="text-success"> ACTIVO </td><%} else {%> <td class="text-danger">INACTIVO</td> <%} %> 
										<form action ="ServletCliente.jsp" method = "post">
										<td><input type= "submit" name = "btnBaja" value= "Baja" class="btn btn-danger" /></td>
										<td><input type= "submit" name = "btnModificar" value= "Modificar" class="btn btn-warning" /></td>
										<td><input type= "submit" name = "btnDatos" value= "Datos" class="btn btn-info" /></td>
										<td><input type= "submit" name = "btnMovimientos" value= "Movimientos" class="btn btn-primary" /></td>
										<td><input type= "submit" name = "btnPrestamos" value= "Prestamos" class="btn btn-success" /></td>
										</form>
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
	</div>
		
	
	
	
</body>
</html>