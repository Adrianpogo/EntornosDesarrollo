package codigoBiblioteca2;

import java.util.ArrayList;

public class Usuario {

	// ATRIBUTOS
	private String idUsuario;
	private String nombre;
	private ArrayList<Prestamo> prestamosActuales;

	// CONSTRUCTOR
	public Usuario(String idUsuario, String nombre) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.prestamosActuales = new ArrayList<Prestamo>();
	}

	// METODOS
	public void tomarPrestado(Prestamo prestamo) {
		prestamosActuales.add(prestamo);

	}

	public void devolver(Libro libro) {
		for (Prestamo prestamo : prestamosActuales) {
			if (prestamo.getLibroPrestado().getISBN().equals(libro.getISBN())) {
				prestamosActuales.remove(prestamo);
				break; 
			}
		}
	}

	public void listarPrestamos() {
		String result = "";
		for (Prestamo prestamo : prestamosActuales) {
			result += prestamo.getLibroPrestado().getTitulo() + "\n";
		}
		System.out.println(result); 
	}

	// GET&SET
	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Prestamo> getPrestamosActuales() {
		return prestamosActuales;
	}

	public void setPrestamosActuales(ArrayList<Prestamo> prestamosActuales) {
		this.prestamosActuales = prestamosActuales;
	}

}
