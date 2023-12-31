package dao;

import java.util.ArrayList;

import entidades.Localidad;

public interface IDaoLocalidad {

	
	ArrayList<Localidad> leerTodas();
	
	Localidad getSingle(int idLocalidad);
	
	ArrayList<Localidad> leerTodasXProvincia(int idProvincia);
}
