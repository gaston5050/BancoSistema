package entidades;

public class Usuario {
	
	private String idUsuario;
	private String pass;
	private int numeroCliente;
	private TipoUsuario tipoUsuario = new TipoUsuario();
	private boolean estado;
	
	
	
	
	public Usuario() {
		
		this.idUsuario = "";
		this.pass = "";
		this.numeroCliente = 0;

		this.estado = false;
	}
	
	

	
	public Usuario(String idUsuario, String pass, int numeroCliente, TipoUsuario tipoUsuario, boolean estado) {
		super();
		this.idUsuario = idUsuario;
		this.pass = pass;
		this.numeroCliente = numeroCliente;
		this.tipoUsuario = tipoUsuario;
		this.estado = estado;
	}
	
	
	
	
	public int getNumeroCliente() {
		return numeroCliente;
	}
	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
	
	
	
	
	
	
	
}
