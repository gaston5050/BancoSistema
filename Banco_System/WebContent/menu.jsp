<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>



</head>
<body>


<div class="container ">


	<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
  
  
  
  
    <a class="navbar-brand" href="#">Banco Sistema</a>
    
    
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
      <li class="nav-item">
      
      				
      				<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDarkDropdown" aria-controls="navbarNavDarkDropdown" aria-expanded="false" aria-label="Toggle navigation">
					      <span class="navbar-toggler-icon"></span>
					    </button>
					    <div class="collapse navbar-collapse" id="navbarNavDarkDropdown">
					      <ul class="navbar-nav">
					        <li class="nav-item dropdown">
					          <a class="nav-link dropdown-toggle" href="#" id="navbarDarkDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
					            Usuarios
					          </a>
					          <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="navbarDarkDropdownMenuLink">
							          	
			      			 <li>
			      	
						  		<a  class="dropdown-item" href = "ServletUsuario?Param=ListarUsuarios"> Listar Usuarios</a>
						    </li>
						    <li>
						    		<a  class="dropdown-item" href = "ServletUsuario?Param=AltaUsuario"> Alta Usuario</a>
							
								
							</li>
					    
					          </ul>
					        </li>
					      </ul>
					    </div>

				
      
	   </li>
        <li class="nav-item">
         
         			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDarkDropdown" aria-controls="navbarNavDarkDropdown" aria-expanded="false" aria-label="Toggle navigation">
					      <span class="navbar-toggler-icon"></span>
					    </button>
					    <div class="collapse navbar-collapse" id="navbarNavDarkDropdown">
					      <ul class="navbar-nav">
					        <li class="nav-item dropdown">
					          <a class="nav-link dropdown-toggle" href="#" id="navbarDarkDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
					            Clientes
					          </a>
					          <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="navbarDarkDropdownMenuLink">
							          	
			      			 <li>
			      	
						  		<a  class="dropdown-item" href = "ServletCliente?Param=ListarClientes"> Listar Clientes</a>
						    </li>
						    <li>
						    		<a  class="dropdown-item" href = "ServletCliente?Param=AltaCliente"> Alta Cliente</a>
							
								
							</li>
					      
					          </ul>
					        </li>
					      </ul>
					    </div>
         
         
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Features</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Pricing</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" aria-disabled="true">Disabled</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
		

	



</div>


</body>
</html>