package tiendaElectronica;

public class Producto {

	// ATRIBUTOS
	private String idProducto;
	private String nombre;
	private double precio;
	private int stock;

	// CONSTRUCTOR
	public Producto (String idProducto, String nombre, double precio, int stock) {
		this.idProducto=idProducto;
		this.nombre=nombre;
		this.precio=precio;
		this.stock=stock;
		
	}
	// METODOS
	public  void reponerStock(int cantidad) {
		stock+=cantidad;
	}
	
	public  void reducirStock (int cantidad) {
		stock -= cantidad;
	}
	
	// GET & SET
	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
