<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "entidades.Usuario" %>
<%@ page import= "java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%System.out.println("llego al listado"); %>
	
	<%
	if(request.getAttribute("listadoUsuarios")!= null){
		int a = 0;
		ArrayList<Usuario> lista = (ArrayList<Usuario>)request.getAttribute("listadoUsuarios");
		
		%>
		<table>		
		<tr>
			<td> Usuario</td>
			<td> Pass </td>	
		</tr>
		<%
		for(Usuario item : lista) {
			a++;
			%>
			
			
		<tr>
			<td> <%=item.getIdUsuario() %></td>
			<td> <%=item.getPass() %> </td>	
		</tr>
			
			
			
			<%
			System.out.println(a);
			
		}
		%>
		</table>
		<%
	}
	
	%>
	
	
	
	
	
</body>
</html>