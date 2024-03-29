package negocio;

import java.util.ArrayList;

import entidades.Cliente;
import excepciones.Exception_DNI;

public interface INegocioCliente {
	
	
	
	public ArrayList<Cliente> leerTodos();
	public boolean insertarCliente(Cliente cliente);
	public boolean modificarCliente(Cliente cliente);
	
	public void VerificaDni(String dni) throws Exception_DNI;
	
	public Cliente getSingle(String dni);
	public Cliente getSingleXNroCliente(String NroCliente);
	
	}
