package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.*;
import entidades.Localidad;
import negocio.INegocioLocalidad;
import negocioImplementado.NegocioLocalidadImplementado;

/**
 * Servlet implementation class ServletUbicacion
 */
@WebServlet("/ServletUbicacion")
public class ServletUbicacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUbicacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		log("hola");
		System.out.println("Provincia seleccionada: " + request.getParameter("Provincia"));
		
		if(request.getParameter("Provincia") != null) {
			
			
		
			
			// En tu servlet ServletUbicacion
			ArrayList<Localidad> listadoLoca = new ArrayList<Localidad>();
			INegocioLocalidad loca = new NegocioLocalidadImplementado();
			listadoLoca = loca.leerTodasXProvincia(Integer.valueOf(request.getParameter("Provincia")));
			
			StringBuilder opcionesLocalidades = new StringBuilder();
			for (Localidad localidad : listadoLoca) {
			    opcionesLocalidades.append("<option value=\"").append(localidad.getId()).append("\">")
			                      .append(localidad.getDescripcion()).append("</option>");
			}

			response.getWriter().write(opcionesLocalidades.toString());
			
			request.setAttribute("localidadXProvincia", listadoLoca);
			System.out.println("LLegue al servlet de ubicacion");
		
			
		}
		
		
		
		
		doGet(request, response);
	}

}
