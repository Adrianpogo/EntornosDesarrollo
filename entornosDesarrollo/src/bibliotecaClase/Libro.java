package bibliotecaClase;

public class Libro {

	private String isbn;
	private String titulo;
	private String autor;
	private int anioPublicacion;
	private int cantidad;

	// Constructor
	public Libro(String isbn, String titulo, String autor, int anioPublicacion, int cantidad) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.cantidad = cantidad;
	}

	// Métodos
	public void agregarCopias(int cantidad) {
		this.cantidad += cantidad;
	}

	public String mostrarInfo() {
		System.out.println("\n>> Info de libro: ");
		return String.format("ISBN: %s, Título: %s, Autor: %s, Año de Publicación: %d, Cantidad: %d",
				isbn, titulo, autor, anioPublicacion, cantidad);
	}
	
	public String toString () {
		return mostrarInfo();
	}

	// Getters y setters
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
