package daoImplementado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import dao.IDaoCliente;
import entidades.Cliente;
import entidades.TipoUsuario;
import entidades.Usuario;

public class DaoClienteImplementado implements IDaoCliente {

	private static final String LeerTodos = "select nroCliente, dni, cuil, nombre, apellido, sexo, nacionalidad, fechanacimiento, idlocalidad, idprovincia, direccion, email, celular, telefonofijo, estado from clientes";	
	private static final String InsertarCliente = "insert into clientes (dni, cuil, nombre, apellido, sexo, nacionalidad, fechanacimiento, idlocalidad, idprovincia, direccion, email, celular, telefonofijo, estado) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String ObtenerRegistro = "select nroCliente, dni, cuil, nombre, apellido, sexo, nacionalidad, fechanacimiento, idlocalidad, idprovincia, direccion, email, celular, telefonofijo, estado from clientes where dni like  ?";
	@Override
	public boolean insertarCliente(Cliente cliente) {
		
		PreparedStatement statement;
		Connection conexion = Conexion.getConnection().getSQLConexion();
		boolean estado = false;		
		
		System.out.println("prvio insert");
				
		try {
			// idlocalidad, idprovincia, direccion, email, celular, telefonofijo, estado
			statement = conexion.prepareStatement(InsertarCliente);
			statement.setString(1, cliente.getDni());
			statement.setString(2, cliente.getCuil());
			statement.setString(3, cliente.getNombre());
			statement.setString(4, cliente.getApellido());
			statement.setString(5, cliente.getSexo());
			statement.setString(6,cliente.getNacionalidad());
			
			
	        java.sql.Date fechaSql = java.sql.Date.valueOf(cliente.getFechaNac());

			statement.setDate(7, fechaSql);
			statement.setInt(8, cliente.getIdLocalidad());
			statement.setInt(9, cliente.getIdProvincia());
			statement.setString(10, cliente.getDireccion());
			statement.setString(11, cliente.getEmail());
			statement.setString(12, cliente.getCelular());
			statement.setString(13, cliente.getTelefonoFijo());
			statement.setBoolean(14, cliente.isEstado());
			
			
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
	public ArrayList<Cliente> leerTodos() {
		PreparedStatement statement;
		ResultSet resultSet;
		
		ArrayList<Cliente> listado = new ArrayList<Cliente>();
		Connection connection = Conexion.getConnection().getSQLConexion();
		
		
		try {
			
			statement = connection.prepareStatement(LeerTodos);
			resultSet = statement.executeQuery();
			
			
				while(resultSet.next()) {
					
					
					Cliente auxiliar = new Cliente();
					//dni, cuil, nombre, apellido, sexo, nacionalidad, fechanacimiento, idlocalidad, idprovincia, direccion, email, celular, telefonofijo, estado
					auxiliar.setNroCliente(resultSet.getInt("nroCliente"));
					auxiliar.setDni(resultSet.getString("dni"));
					auxiliar.setCuil(resultSet.getString("cuil"));
					auxiliar.setApellido(resultSet.getString("apellido"));
					auxiliar.setNombre(resultSet.getString("nombre"));
					auxiliar.setSexo(resultSet.getString("sexo"));
					auxiliar.setNacionalidad(resultSet.getString("nacionalidad"));
					auxiliar.setFechaNac(resultSet.getDate("fechanacimiento").toLocalDate());
					auxiliar.setIdLocalidad(resultSet.getInt("idlocalidad"));
					auxiliar.setIdProvincia(resultSet.getInt("idProvincia"));
					auxiliar.setDireccion(resultSet.getString("direccion"));
					auxiliar.setEmail(resultSet.getString("email"));
					auxiliar.setCelular(resultSet.getString("celular"));
					auxiliar.setTelefonoFijo(resultSet.getString("telefonoFijo"));
					auxiliar.setEstado(resultSet.getBoolean("estado"));
					listado.add(auxiliar);
					
				}
			 
		}
		catch (Exception e) {
			
			e.printStackTrace();		
			
		}
		
		
	
		return listado;
	}





	@Override
	public Cliente getSingle(String DNI) {
		
		
		PreparedStatement statement;
		ResultSet resultSet;
		
		
		Cliente auxiliar = new Cliente();
	
		Connection connection = Conexion.getConnection().getSQLConexion();
		
		
		try {
			
			statement = connection.prepareStatement(ObtenerRegistro);
			statement.setString(1, DNI);
			resultSet = statement.executeQuery();
			
			
				while(resultSet.next()) {
					
					//dni, cuil, nombre, apellido, sexo, nacionalidad, fechanacimiento, idlocalidad, idprovincia, direccion, email, celular, telefonofijo, estado
					auxiliar.setNroCliente(resultSet.getInt("nroCliente"));
					auxiliar.setDni(resultSet.getString("dni"));
					auxiliar.setCuil(resultSet.getString("cuil"));
					auxiliar.setApellido(resultSet.getString("apellido"));
					auxiliar.setNombre(resultSet.getString("nombre"));
					auxiliar.setSexo(resultSet.getString("sexo"));
					auxiliar.setNacionalidad(resultSet.getString("nacionalidad"));
					auxiliar.setFechaNac(resultSet.getDate("fechanacimiento").toLocalDate());
					auxiliar.setIdLocalidad(resultSet.getInt("idlocalidad"));
					auxiliar.setIdProvincia(resultSet.getInt("idProvincia"));
					auxiliar.setDireccion(resultSet.getString("direccion"));
					auxiliar.setEmail(resultSet.getString("email"));
					auxiliar.setCelular(resultSet.getString("celular"));
					auxiliar.setTelefonoFijo(resultSet.getString("telefonoFijo"));
					auxiliar.setEstado(resultSet.getBoolean("estado"));
					
				
					
					auxiliar.setNroCliente(resultSet.getInt("nroCliente"));
				}
				
		}
		catch (Exception e)	{
			
			e.printStackTrace();
		
		}
		
		
		
		
		
		System.out.print("-------nombre---------");
		System.out.print(auxiliar.getApellido());
		System.out.print("-------nombre---------");
		
		return auxiliar;
	}
	

}
