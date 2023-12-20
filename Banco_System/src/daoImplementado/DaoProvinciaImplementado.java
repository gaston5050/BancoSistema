package daoImplementado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.IDaoProvincia;
import entidades.Provincia;

public class DaoProvinciaImplementado implements IDaoProvincia{
	
	public static String LeerProvincias = "select idProvincia, descripcion from provincias";

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
	
	
	

}
