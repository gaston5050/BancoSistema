package negocioImplementado;

import java.util.ArrayList;

import dao.IDaoCliente;
import dao.IDaoUsuario;
import daoImplementado.DaoClienteImplementado;
import daoImplementado.DaoUsuarioImplementado;
import entidades.Cliente;
import negocio.INegocioCliente;

public class NegocioClienteImplementado implements INegocioCliente {

	
	

	@Override
	public ArrayList<Cliente> leerTodos() {
		
		ArrayList<Cliente> listado = null;
		
		IDaoUsuario aux = new DaoUsuarioImplementado();
		
		listado = aux.leerTodos();
		
		return listado;
	}

	

	@Override
	public boolean insertarUsuario(Cliente cliente) {
		boolean estado = false;
		IDaoCliente aux = new DaoClienteImplementado();
		
		estado = aux.insertarCliente(cliente);
		
		
		
		return estado;
	}
	
	
}
