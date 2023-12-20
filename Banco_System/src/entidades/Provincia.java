package entidades;

public class Provincia {
	
	private int id;
	private String descripcion;
	
public Provincia() {
		
		this.id = -1;
		this.descripcion = "";
	}
	
	public Provincia(int id, String descripcion) {
		
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
