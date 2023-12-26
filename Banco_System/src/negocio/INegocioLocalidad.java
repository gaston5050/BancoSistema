package negocio;

import java.util.ArrayList;

import entidades.Localidad;

public interface INegocioLocalidad {
	
	
	
	ArrayList<Localidad> leerTodas();
	ArrayList<Localidad> leerTodasXProvincia(int idProvincia);
	
	Localidad getSingle(int idLocalidad);
	
	

}
