package daoImplementado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.IDaoUsuario;
import entidades.TipoUsuario;
import entidades.Usuario;

public class DaoUsuarioImplementado implements IDaoUsuario {

	
	private static final String LeerTodos = "select idUsuario, idTipoUsuario, Clave, nroCliente, estado from usuarios";	
	
	
	
	
	@Override
	public ArrayList<Usuario> leerTodos() {
		PreparedStatement statement;
		ResultSet resultSet;
		
		ArrayList<Usuario> listado = new ArrayList<Usuario>();
		Connection connection = Conexion.getConnection().getSQLConexion();
		
		
		try {
			
			statement = connection.prepareStatement(LeerTodos);
			resultSet = statement.executeQuery();
			
			
				while(resultSet.next()) {
					
					
					Usuario auxiliar = new Usuario();
					
					auxiliar.setIdUsuario(resultSet.getString("idUsuario"));
					auxiliar.setPass(resultSet.getString("Clave"));
					TipoUsuario tipoUsuario = new TipoUsuario();
					tipoUsuario.setIdTipoUsuario(resultSet.getInt("idTipoUsuario"));
					auxiliar.setTipoUsuario(tipoUsuario);
					auxiliar.setNumeroCliente(resultSet.getInt("nroCliente"));
					auxiliar.setEstado(resultSet.getBoolean("estado"));
					
					listado.add(auxiliar);
					
				}
			 
		}
		catch (Exception e) {
			
			e.printStackTrace();		
			
		}
		
		
	
		return listado;
	}
	
	
}
