package daoImplementado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.Statement;

import dao.IDaoLocalidad;
import entidades.Localidad;
import entidades.Provincia;

public class DaoLocalidadImplementado implements IDaoLocalidad{

	
	public static String LeerLocalidades = "Select idLocalidad, idProvincia, descripcion from localidades";
	public static String getSingle = "Select idLocalidad, idProvincia, descripcion from localidades where idLocalidad = ?";
	
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
	
		Localidad loca = new Localidad();
		
		
		PreparedStatement query;
		ResultSet resultado;
		Connection conexion = Conexion.getConnection().getSQLConexion();
		
		
		System.out.println("sigle localidad llega OK");

		try {
			
			
			query = conexion.prepareStatement(getSingle);
			
			query.setString(1, String.valueOf(idLocalidad));
			resultado = query.executeQuery();
			resultado.next();
			loca.setDescripcion(resultado.getString("descripcion"));
			loca.setId(resultado.getInt("idLocalidad"));
			Provincia provincia = new Provincia();
			provincia.setId(resultado.getInt("idProvincia"));
			loca.setProvincia(provincia);
			
			System.out.println("cargo localidad en dao implementado OK");
			System.out.println(loca.toString());
			System.out.println("cargo localidad en dao implementado OK");

			
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
			
		
		
		System.out.println("sigle localidad se va OK");
		return loca;
	}

	
	
}
