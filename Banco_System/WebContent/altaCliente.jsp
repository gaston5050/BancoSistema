<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
<%@ page import = "entidades.Provincia" %>
<%@ page import = "entidades.Cliente" %>

<%@ page import = "entidades.Localidad" %>

<%@ page import= "java.util.ArrayList" %>
<%@ page import= "java.util.Iterator" %>







<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	
<title>Alta cliente</title>
</head>
<body>
  <%@include file="menu.jsp" %>
  
  	<div class="container p-4">
				
		
		<form method= "post" action="ServletCliente" class="col-md-6 offset-md-3  ">
  			
  				<%
  				Cliente cli = null;
  				if(request.getAttribute("A_modificar")!= null){
  					
  					cli = (Cliente)request.getAttribute("A_modificar");
  					
  				}
  				
  				%>
  			<div class="col-auto">
  			
  				 <div class="form-group row">
  				 
   					 <label  class="col-sm-2 col-form-label">Cliente</label>
   					 
   						 <div class="col-sm-10">
   						 <% int cant =0;
   						    cant = Cliente.getCantidadClientes() + 1;  %>
   						 <%

   						System.out.println("*********************");
   						 System.out.println(cant);
   						System.out.println("*********************");
   						
   						 
   						 
   						 %>
   							 <label  class="col-sm-2 col-form-label"><%= cant %></label>
   							 <input type="hidden" name= "canti" value = <%= cant %> >	
   							 
   						</div>	
 				 </div>
  				
   				 <div class="form-group row ">
   					 <label  class="col-sm-2 col-form-label">DNI</label>
  					  <div class="col-sm-10">
    				  <input type="text" class="form-control" name="txtDni" placeholder="Ingrese DNI." minlength = "8" maxlength = "8" required <%if(cli != null){%> value = <%=cli.getDni() %> <% } %>>
   					  </div>
 				 </div>
 				 
 				 <div class="form-group row ">
   					 <label  class="col-sm-2 col-form-label">CUIL</label>
  					  <div class="col-sm-10">
    				  <input type="text" class="form-control" name="txtCuil" minlength = "10" maxlength = "10" required placeholder="Ingrese Cuil(Sin guiones - ) " <%if(cli != null){%> value = <%=cli.getCuil() %> <% } %>>
   					  </div>
 				 </div>
 				 <div class="form-group row ">
   					 <label  class="col-sm-2 col-form-label">Nombre</label>
  					  <div class="col-sm-10">
    				  <input type="text" class="form-control" name="txtNombre" placeholder="Ingrese nombre." <%if(cli != null){%> value = <%=cli.getNombre() %> <% } %>>
   					  </div>
 				 </div>
 				 <div class="form-group row ">
   					 <label  class="col-sm-2 col-form-label">Apellido</label>
  					  <div class="col-sm-10">
    				  <input type="text" class="form-control" name="txtApellido" placeholder="Ingrese Apellido." <%if(cli != null){%> value = <%=cli.getApellido() %> <% } %>>
   					  </div>
 				 </div>
 				 <div class="form-group row ">
   					 <label  class="col-sm-2 col-form-label">Sexo</label>
   					 
   					 
   					 
   					 
   					 
   					 
  					  <div class="col-sm-10">
  					  
  					  	<fieldset>
  					  		
  					  		<input type = "radio" name= "rdSexo" value= "1"> Masculino 
							<input type = "radio" name= "rdSexo" value= "0"> Femenino
  					  		
  					  	</fieldset>
    				
   					  </div>
 				 </div>
 				 <div class="form-group row ">
   					 <label  class="col-sm-2 col-form-label">Nacionalidad</label>
  					  <div class="col-sm-10">
    				  <input type="text" class="form-control" name="txtNacionalidad" placeholder="Ingrese nacionalidad.">
   					  </div>
 				 </div>
 				 <div class="form-group row ">
   					 <label  class="col-sm-2 col-form-label">Fecha de Nacimiento</label>
  					  <div class="col-sm-10">
    				 <input type="date" name="dtpFechaNacimiento" id= "dtpFechaNacimiento"></input>
    				
   					  </div>
 				 </div>
 				 
 				 
 				 
 				 
 				 
 				 
 				 <div class="form-group row ">
 				 
 				 
 				 
   					 <label  class="col-sm-2 col-form-label">Provincia </label>
  					  <div class="col-sm-10">
  					  
					<select id="provinciaSelect" name ="provinciaSelect"  onchange='cargarLocalidades(this.value)'>
					    <option value="0">Elija una provincia: </option>
					    <% if (request.getAttribute("ListaProvs") != null) {
					        ArrayList<Provincia> lista = new ArrayList<Provincia>();
					        Object ob = request.getAttribute("ListaProvs");
					        lista = (ArrayList<Provincia>) ob;
					
					        for (Provincia item : lista) {
					    %>
					        <option value="<%= item.getId() %>"><%= item.getDescripcion() %></option>
					    <%  
					        }
					    }
					    %>
					</select>
					
					   			
					   						
   					   <label  class="col-sm-2 col-form-label" id= "lblSelectLocalidad">    Localidad</label>
   					  <% //if (request.getAttribute("localidadXProvincia") != null) { %>
  					  <select id="cboLocalidadSelect" name="cboLocalidadSelect" >
  					  
  					  
  					
  					  
  					  </select>
						<%// } %>
   			
   					  </div>
   					  
   					  
		  
   					  
   					  
 				 </div>
 				 
 				 
 				 
 				 
 				 
 				 <div class="form-group row ">
   					 <label  class="col-sm-2 col-form-label">Direccion</label>
  					  <div class="col-sm-10">
    				  <input type="text" class="form-control" name="txtDireccion" placeholder="Ingrese direccion.">
   					  </div>
 				 </div>
 				 <div class="form-group row ">
   					 <label  class="col-sm-2 col-form-label">Email</label>
  					  <div class="col-sm-10">
    				  <input type="text" class="form-control" name="txtEmail" placeholder="Ingrese email.">
   					  </div>
 				 </div>
 				 
 				  <div class="form-group row">
   					 <label  class="col-sm-2 col-form-label">Celular</label>
  					  <div class="col-sm-10">
    				  <input type="text" class="form-control" name="txtCelular" placeholder="Ingrese Celular">
   					  </div>
 				 </div>
 				   <div class="form-group row">
   					 <label  class="col-sm-2 col-form-label">Telefono</label>
  					  <div class="col-sm-10">
    				  <input type="text" class="form-control" name="txtTelefono" placeholder="Ingrese telefono.">
   					  </div>
 				 </div>
 				 
 			
 				 
   				<div class="d-grid gap-2 d-md-flex justify-content-md-end">
  					
  					<input type="submit" class="btn btn-primary" value = "Aceptar" name ="btnAceptar">
				</div>
  			
   					
   			 </div>
		</form>
 		
	


	</div>
<script>



	<%if(request.getAttribute("mensaje")!= null){%>
		
		
			console.log("jjjjjjjjjjjjjjjjjjjjjjjjjj");
		alert('<%= request.getAttribute("mensaje")%>');
	<%}%>

</script>

 <script>
function cargarLocalidades(value) {
    var seleccionProvincia = value;
    alert("Funcion cargarLocalidades ejecutada con valor: " + value);
    $.ajax({
        type: "POST",
        url: "ServletUbicacion",
        data: {
            Provincia: seleccionProvincia
        },
        success: function (data) {
            $("#cboLocalidadSelect").html(data);
        },
        error: function () {
            console.log("Error en la solicitud AJAX");
        }
    });
}
</script>




</body>
</html>