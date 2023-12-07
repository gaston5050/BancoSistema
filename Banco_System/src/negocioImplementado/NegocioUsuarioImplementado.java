package negocioImplementado;

import java.util.ArrayList;

import dao.IDaoUsuario;
import daoImplementado.DaoUsuarioImplementado;
import entidades.Usuario;
import negocio.INegocioUsuario;

public class NegocioUsuarioImplementado implements INegocioUsuario {

	@Override
	public ArrayList<Usuario> leerTodos() {
		
		ArrayList<Usuario> listado = null;
		
		IDaoUsuario aux = new DaoUsuarioImplementado();
		
		listado = aux.leerTodos();
		
		return listado;
	}
	
	
	
	
	

}
