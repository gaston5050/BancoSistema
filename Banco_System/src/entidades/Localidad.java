package entidades;

public class Localidad {
	
	
	private int id;
	private String descripcion;
	
	
public Localidad() {
		
		this.id = -1;
		this.descripcion = "";
		
	}
	
	public Localidad(int id, String descripcion) {
		
		this.id = id;
		this.descripcion = descripcion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	
}
