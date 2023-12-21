package daoImplementado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.IDaoProvincia;
import entidades.Provincia;

public class DaoProvinciaImplementado implements IDaoProvincia{
	
	public static String LeerProvincias = "select idProvincia, descripcion from provincias";
	public static String ObtenerProvincia = "select idProvincia, descripcion from provincias where idProvincia = ?";
	
	
	@Override
	public ArrayList<Provincia> leerTodas() {
		
		PreparedStatement statement;
		ResultSet resultSet;
		Connection conexion = Conexion.getConnection().getSQLConexion();
		
		ArrayList<Provincia> listaP = new ArrayList<Provincia>();
		
		try {
			
			statement = conexion.prepareStatement(LeerProvincias);
			resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				Provincia prov = new Provincia();
				
				prov.setId(resultSet.getInt("idProvincia"));
				prov.setDescripcion(resultSet.getString("descripcion"));
				System.out.println("cargo provincia en dao");
				listaP.add(prov);
								
			}
			
			
			
		}
		catch (Exception e) {
			
			e.printStackTrace();
			
		}
			
		
		
		return listaP;
	}

	@Override
	public Provincia getSingle (int idProvincia) {
		
		Provincia provincia = new Provincia();
			
		PreparedStatement statement;
		ResultSet resultSet;
		Connection conexion = Conexion.getConnection().getSQLConexion();
		Provincia prov = new Provincia();
		
		
       try {
			
			statement = conexion.prepareStatement(ObtenerProvincia);
			statement.setString(1, String.valueOf(idProvincia));
			resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				
				prov.setId(resultSet.getInt("idProvincia"));
				prov.setDescripcion(resultSet.getString("descripcion"));
				System.out.println("cargo provincia en dao");
				
								
			}
			
			
			
		}
		catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return prov;
	}
	
	
	

}
