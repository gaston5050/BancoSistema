package entidades;
import java.util.ArrayList;
import java.util.Date;

import dao.IDaoCliente;
import daoImplementado.DaoClienteImplementado;
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
	private String telefonoFijo;
	private String celular;
	private boolean estado;
	static public int cantidadClientes = Cliente.cantClientes();
	
	
	
	
	public static int getCantidadClientes() {
		return cantidadClientes;
	}


	public static void setCantidadClientes(int cantidadClientes) {
		Cliente.cantidadClientes = cantidadClientes;
	}


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
		this.telefonoFijo="";
		this.celular = "";
		this.estado = false;
		
	}
	
	
	public Cliente( String dni, String cuil, String nombre, String apellido, String sexo,
			String nacionalidad, Date fechaNac, int idLocalidad, int idProvincia, String direccion, String email, String telefonoFijo, String celular) {
		super();
		
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
		this.telefonoFijo = telefonoFijo;
		this.celular = celular;
		this.estado = false;
	}
	
	public static int cantClientes() {
		System.out.println("Llego a la funcion que cuenta clientes");
		int cantidad = 0;
		IDaoCliente idc = new DaoClienteImplementado();
		ArrayList <Cliente> listado = new ArrayList<Cliente>();
		listado = idc.leerTodos();
		
		cantidad = listado.size();
		
		
		
		return cantidad;
	}
	
	public String getTelefonoFijo() {
		return telefonoFijo;
	}


	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
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
