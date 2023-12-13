package dao;

import java.util.ArrayList;

import entidades.Cliente;

public interface IDaoCliente  {

	
	public ArrayList<Cliente> leerTodos();
	public boolean insertarCliente(Cliente usuario);
	
}
