<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ page import = "entidades.Usuario" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

  
<title>Alta Usuarios</title>
</head>
<body>
  <%@include file="menu.jsp" %>
  
  	<div class="container p-4">
				
		
		<form method= "post" action="ServletUsuario" class="col-md-6 offset-md-3  ">
  			
  				
  			<div class="col-auto">
  			
  				 <div class="form-group row">
   					 <label  class="col-sm-2 col-form-label">Cliente</label>
   					 
   					 <div class="col-sm-10">
						  <div class="dropdown">
							  <a class="btn btn-secondary dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-bs-toggle="dropdown" aria-expanded="false">
							    Dropdown link
							  </a>
							
							 <ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">
							    <li><a class="dropdown-item" href="#">Action</a></li>
							    <li><a class="dropdown-item" href="#">Another action</a></li>
							    <li><a class="dropdown-item" href="#">Something else here</a></li>
						 	 </ul>
						 	</div>
						</div>
 				 </div>
  				
   				 <div class="form-group row ">
   					 <label  class="col-sm-2 col-form-label">Usuario</label>
  					  <div class="col-sm-10">
    				  <input type="text" class="form-control" name="txtIdUsuario" placeholder="Ingrese usuario.">
   					  </div>
 				 </div>
 				 
 				  <div class="form-group row">
   					 <label  class="col-sm-2 col-form-label">Contraseña</label>
  					  <div class="col-sm-10">
    				  <input type="password" class="form-control" name="txtPassword" placeholder="Contraseña">
   					  </div>
 				 </div>
 				   <div class="form-group row">
   					 <label  class="col-sm-2 col-form-label">Contraseña</label>
  					  <div class="col-sm-10">
    				  <input type="password" class="form-control" name="txtPassword2" placeholder="Reingrese contraseña">
   					  </div>
 				 </div>
 				 
 				 <div class="form-check form-switch">
					  <input class="form-check-input" type="checkbox" id="flexSwitchCheckDefault">
					  <label class="form-check-label" for="flexSwitchCheckDefault">Administrador</label>
					 
				 </div>
 				 
   				<div class="d-grid gap-2 d-md-flex justify-content-md-end">
  					
  					<input type="submit" class="btn btn-primary" value = "Aceptar" name ="btnAceptar">
				</div>
  			
   					
   			 </div>
		</form>
 		
	


	</div>









</body>
</html>