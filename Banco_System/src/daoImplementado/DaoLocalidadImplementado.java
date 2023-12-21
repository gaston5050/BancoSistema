package daoImplementado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



import dao.IDaoLocalidad;
import entidades.Localidad;
import entidades.Provincia;

public class DaoLocalidadImplementado implements IDaoLocalidad{

	
	public static String LeerLocalidades = "Select idLocalidad, idProvincia, descripcion from localidades";
	
	@Override
	public ArrayList<Localidad> leerTodas() {
		ArrayList<Localidad> listaLocalidades = new ArrayList<Localidad>();
		
			PreparedStatement query;
			ResultSet resultado;
			Connection conexion = Conexion.getConnection().getSQLConexion();
			
			try {
				
				query = conexion.prepareStatement(LeerLocalidades);
				resultado = query.executeQuery();
				
				while(resultado.next()) {
					
					Localidad localidad = new Localidad();
					
					localidad.setId(resultado.getInt("idLocalidad"));
					Provincia aux = new Provincia ();
					aux.setId(resultado.getInt("idProvincia"));
					localidad.setProvincia(aux);
					localidad.setDescripcion(resultado.getString("descripcion"));
					
					
					listaLocalidades.add(localidad);
					
					
					
					
				}
				
				
				
				
				
				
			}
			catch(Exception e) {
				
				
				e.printStackTrace();
				
			}
			
		
		
		
		
		
		
		return listaLocalidades;
	
	}

	@Override
	public Localidad getSingle(int idLocalidad) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
