package daoImplementado;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
	
	public static Conexion instancia;
	private Connection connection;
	
	private Conexion() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/utn_banco", "root","root");
				
			
			
		}
		catch (Exception e) {
			
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public static Conexion getConnection() {
		
		if(instancia == null) {
			
			instancia = new Conexion();
		}
		
		return instancia;
	
	}
	
	public Connection getSQLConexion() {
		
		
		
	
		return connection;
		
		
	}
	
	
	
	
	
	

}
