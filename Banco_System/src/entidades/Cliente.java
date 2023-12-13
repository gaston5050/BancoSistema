package entidades;
import java.util.Date;
public class Cliente {
	
	private int nroCliente;
	private String dni;
	private String cuil;
	private String nombre;
	private String apellido;
	private String sexo;
	private String nacionalidad;
	private Date fechaNac;
	private int idLocalidad;
	private int idProvincia;
	private String direccion;
	private String email;
	private boolean estado;
	
	public Cliente() {
	
		
		this.dni ="";
		this.cuil = "";
		this.nombre = "";
		this.apellido = "";
		this.sexo = "";
		this.nacionalidad = "";
		this.fechaNac = new Date() ;
		this.idLocalidad = 1;
		this.idProvincia = 1;
		this.direccion = "";
		this.email = "";
		this.estado = false;
	}
	
	
	public Cliente(int nroCliente, String dni, String cuil, String nombre, String apellido, String sexo,
			String nacionalidad, Date fechaNac, int idLocalidad, int idProvincia, String direccion, String email) {
		super();
		this.nroCliente = nroCliente;
		this.dni = dni;
		this.cuil = cuil;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
		this.fechaNac = fechaNac;
		this.idLocalidad = idLocalidad;
		this.idProvincia = idProvincia;
		this.direccion = direccion;
		this.email = email;
		this.estado = false;
	}
	
	
	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public int getNroCliente() {
		return nroCliente;
	}
	public void setNroCliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCuil() {
		return cuil;
	}
	public void setCuil(String cuil) {
		this.cuil = cuil;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public int getIdLocalidad() {
		return idLocalidad;
	}
	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}
	public int getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
