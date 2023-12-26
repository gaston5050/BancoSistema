package negocioImplementado;

import java.util.ArrayList;

import dao.IDaoLocalidad;
import daoImplementado.DaoLocalidadImplementado;
import entidades.Localidad;
import negocio.INegocioLocalidad;

public class NegocioLocalidadImplementado implements INegocioLocalidad{

	@Override
	public ArrayList<Localidad> leerTodas() {
		
		
		IDaoLocalidad loca = new DaoLocalidadImplementado();
		ArrayList<Localidad> listado = new ArrayList<Localidad>();
		
		listado = loca.leerTodas();
		
	
		return listado;
	}

	@Override
	public Localidad getSingle(int idLocalidad) {
		

		IDaoLocalidad loca = new DaoLocalidadImplementado();
		
		Localidad localidad = new Localidad();
	
		localidad = loca.getSingle(idLocalidad);
		
	
		return localidad;
	}

	@Override
	public ArrayList<Localidad> leerTodasXProvincia(int idProvincia) {
		
		IDaoLocalidad loca = new DaoLocalidadImplementado();
		ArrayList<Localidad> listado = new ArrayList<Localidad>();
		
		listado = loca.leerTodasXProvincia(idProvincia);
		
	
		return listado;
	}
	
	
	

}
