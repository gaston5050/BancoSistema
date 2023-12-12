package negocio;

import java.util.ArrayList;

import entidades.Usuario;

public interface INegocioUsuario {
	
	
	
	public ArrayList<Usuario> leerTodos();
	public boolean insertarUsuario(Usuario usuario);
	

}
