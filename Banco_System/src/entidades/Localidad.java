package entidades;

public class Localidad {
	
	
	private int id;
	private String descripcion;
	private Provincia provincia;
	
public Localidad() {
		
		this.id = -1;
		this.descripcion = "";
		this.provincia = new Provincia();
	}
	
	public Localidad(int id, String descripcion, Provincia provincia) {
		
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

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	
}
