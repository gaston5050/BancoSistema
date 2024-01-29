package servlet;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Cliente;
import entidades.Provincia;
import negocio.INegocioCliente;
import negocio.INegocioProvincia;
import negocioImplementado.NegocioClienteImplementado;
import negocioImplementado.NegocioProvinciaImplementado;

/**
 * Servlet implementation class ServletCliente
 */
@WebServlet("/ServletCliente")
public class ServletCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
if(request.getParameter("Param")!= null) {
			
			if (request.getParameter("Param").equals("ListarClientes")){
			
			ArrayList<Cliente> listado = new ArrayList<Cliente>();
			INegocioCliente reg = new NegocioClienteImplementado();
			
			listado = reg.leerTodos();
			
			request.setAttribute("listadoClientes", listado);
			
			
			RequestDispatcher rd = request.getRequestDispatcher("/listarClientes.jsp");
			rd.forward(request, response);
		}
		
		
			
			if (request.getParameter("Param").equals("AltaCliente")) {
				System.out.println("llego a alta");
			
			 INegocioProvincia provincias = new NegocioProvinciaImplementado();
			 ArrayList<Provincia> provs = provincias.leerTodas();
			 
			 request.setAttribute("ListaProvs", provs);	 
			
			 System.out.println(provs.size());
			 System.out.println("Me voy del alta a alta");
			
			RequestDispatcher rd = request.getRequestDispatcher("/altaCliente.jsp");
			rd.forward(request, response);
		}
			
			
			
			
			
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getParameter("btnAceptar")!= null) {
			
			Cliente reg = new Cliente();
			
			System.out.println(request.getParameter("canti"));
			reg.setNroCliente(Integer.valueOf(request.getParameter("canti")));
			reg.setDni(request.getParameter("txtDni"));
			reg.setCuil(request.getParameter("txtCuil"));
			reg.setNombre(request.getParameter("txtNombre"));
			reg.setApellido(request.getParameter("txtApellido"));
			
			reg.setSexo(request.getParameter("rdSexo"));
			reg.setNacionalidad(request.getParameter("txtNacionalidad"));
		
			 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			 LocalDate dt = LocalDate.parse(request.getParameter("dtpFechaNacimiento"), dtf);

			
			reg.setFechaNac(dt);
		
			reg.setIdProvincia(Integer.valueOf(request.getParameter("provinciaSelect")));			
			reg.setIdLocalidad(Integer.valueOf(request.getParameter("cboLocalidadSelect")));
			reg.setDireccion(request.getParameter("txtDireccion"));
			reg.setEmail(request.getParameter("txtEmail"));
			reg.setCelular(request.getParameter("txtCelular"));
			reg.setTelefonoFijo(request.getParameter("txtTelefono"));
			reg.setEstado(Boolean.valueOf(request.getParameter("esAdmin")));
			
			
			System.out.println("-----------------------------");
			System.out.println(reg.toString());
			System.out.println("-----------------------------");
			INegocioCliente neg = new NegocioClienteImplementado();
			
			if(neg.insertarCliente(reg)) {
				
				log("sssssssssssssssssiiiiiiiiiiiii");
				 INegocioProvincia provincias = new NegocioProvinciaImplementado();
				 ArrayList<Provincia> provs = provincias.leerTodas();
				 
				request.setAttribute("ListaProvs", provs);	 
				
				request.setAttribute("mensaje", "paso ok");
				
			}
			else {
				
				log("nooooooooooooooooooooooooooo"); 
				
			}
		
			
			
			
			
			RequestDispatcher rd = request.getRequestDispatcher("/altaCliente.jsp");
			rd.forward(request, response);
		
		
		
		
		
		}
		
		
		
		
		
		
		
		doGet(request, response);
	}

}
