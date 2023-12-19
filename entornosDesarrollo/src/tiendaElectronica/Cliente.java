package tiendaElectronica;

public class Cliente {
	// ATRIBUTOS
	private String idCliente;
	private String nombre;
	private String correo;

	// CONSTRUCTOR
	public Cliente (String idCliente, String nombre, String correo ) {
		this.idCliente=idCliente;
		this.nombre=nombre;
		this.correo=correo;
		
	}
	
	// METODOS
	public  void actualizarCorrero (String newCorreo) {
		correo = newCorreo;
	}
	
	
	// GET & SET
	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
