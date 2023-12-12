package negocio;

import java.util.ArrayList;

import entidades.Cliente;

public interface INegocioCliente {
	
	
	
	public ArrayList<Cliente> leerTodos();
	public boolean insertarUsuario(Cliente cliente);

}
