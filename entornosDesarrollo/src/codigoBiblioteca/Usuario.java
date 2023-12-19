package codigoBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String idUsuario;
	private String nombre;
	private List<Prestamo> prestamosActuales;

	// Constructor

	public Usuario(String idUsuario, String nombre) {

		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.prestamosActuales = new ArrayList<>();

	}

	// Métodos

	public void tomarPrestado(Prestamo prestamo) {
		prestamosActuales.add(prestamo);

	}

	public void devolver(Libro libro) {

		prestamosActuales.removeIf(prestamo -> prestamo.getLibroPrestado().getISBN().equals(libro.getISBN()));

	}

	public String listarPrestamos() {
		StringBuilder sb = new StringBuilder();
		for (Prestamo prestamo : prestamosActuales) {
			sb.append(prestamo.toString()).append("\n");
		}
		return sb.toString();

	}

	// Getters y setters

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

	public List<Prestamo> getPrestamosActuales() {
		return prestamosActuales;
	}

	public void setPrestamosActuales(List<Prestamo> prestamosActuales) {
		this.prestamosActuales = prestamosActuales;
	}

}
