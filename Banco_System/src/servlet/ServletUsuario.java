package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IDaoUsuario;
import daoImplementado.DaoUsuarioImplementado;
import entidades.Usuario;
import negocio.INegocioUsuario;
import negocioImplementado.NegocioUsuarioImplementado;

/**
 * Servlet implementation class ServletUsuario
 */
@WebServlet("/ServletUsuario")
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUsuario() {
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
			
			if (request.getParameter("Param").equals("ListarUsuarios")){
			
			ArrayList<Usuario> listado = new ArrayList<Usuario>();
			INegocioUsuario reg = new NegocioUsuarioImplementado();
			
			listado = reg.leerTodos();
			
			request.setAttribute("listadoUsuarios", listado);
			
			
			RequestDispatcher rd = request.getRequestDispatcher("/listarUsuarios.jsp");
			rd.forward(request, response);
		}
		
		
			
			if (request.getParameter("Param").equals("AltaUsuario")) {
			System.out.println("llego a alta");
			RequestDispatcher rd = request.getRequestDispatcher("/altaUsuario.jsp");
			rd.forward(request, response);
		}
		}
			
		}
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		
		
		if(request.getParameter("btnAceptar")!= null) {
			
			Usuario reg = new Usuario();
			
			reg.setIdUsuario(request.getParameter("txtIdUsuario"));
			reg.setPass(request.getParameter("txtPassword"));
			
			
			IDaoUsuario aux = new DaoUsuarioImplementado ();
		
			
			aux.insertarUsuario(reg);
			
			
			System.out.println("Insert OK");
			
			
			RequestDispatcher rd = request.getRequestDispatcher("/altaUsuario.jsp");
			rd.forward(request, response);
			
			
			}
			
		
		
		
		
		
		
		
		
		doGet(request, response);
		
		
		
		
		
		
		
	}

}
