package tiendaMascotas;

public class Producto {

	// Atributos

	private int idProducto;
	private String nombre;
	private double precio;
	private int stock;

	// Constructor
	
	public Producto (int idProducto, String nombre, double precio, int stock) {
		this.idProducto=idProducto;
		this.nombre=nombre;
		this.precio=precio;
		this.stock=stock;
	}

	// Funciones
	
	public void reponerStock (int cantidad) {
		this.stock=cantidad;
	}
	
	public void venderProducto (int cantidad) {
		stock -= cantidad;
		if (stock < 0) {
			System.out.println("No disponemos de tantas unidades");
			stock+=cantidad;
		}else if (stock == 0){
			reponerStock(50);
		}
	}
	

	// Get & Set

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
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
