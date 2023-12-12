package daoImplementado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.IDaoCliente;
import entidades.Cliente;
import entidades.TipoUsuario;
import entidades.Usuario;

public class DaoClienteImplementado implements IDaoCliente {

	private static final String LeerTodos = "select nroCliente, dni, cuil, nombre, apellido, sexo, nacionalidad, fechanacimiento, idlocalidad, idprovincia, direccion, email, celular, telefonofijo, estado from clientes";	
	private static final String InsertarUsuario = "insert into usuarios (idusuario, clave, idtipoUsuario, estado, nroCliente) values (?,?, ?, ?,?)";
	
	@Override
	public boolean insertarUsuario(Cliente cliente) {
		
		PreparedStatement statement;
		Connection conexion = Conexion.getConnection().getSQLConexion();
		boolean estado = false;		
		
		System.out.println("prvio insert");
				
		try {
			
			statement = conexion.prepareStatement(InsertarUsuario);
			statement.setString(1, usuario.getIdUsuario());
			statement.setString(2, usuario.getPass());
			statement.setInt(3, usuario.getTipoUsuario().getIdTipoUsuario());
			statement.setBoolean(4, true);
			statement.setString(5, null);
			
			if(statement.executeUpdate() > 0) {
				System.out.println("insert Dao Usuario Impl - ok");
			//	conexion.commit();
				estado = true;
			
			}
			
		}
		catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		return estado;
	}



	
	
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
