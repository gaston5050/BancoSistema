package dao;

import java.util.ArrayList;

import entidades.Usuario;

public interface IDaoUsuario {

	
	public ArrayList<Usuario> leerTodos();
	public boolean insertarUsuario(Usuario usuario);
	
	
}
