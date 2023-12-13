package negocio;

import java.util.ArrayList;

import entidades.Cliente;

public interface INegocioCliente {
	
	
	
	public ArrayList<Cliente> leerTodos();
	public boolean insertarCliente(Cliente cliente);

}
