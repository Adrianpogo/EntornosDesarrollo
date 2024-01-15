package bibliotecaClase;

import java.util.ArrayList;

public class Usuario {

	private String idUsuario;
	private String nombre;
	private ArrayList<Prestamo> prestamosActuales;

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
		for (Prestamo prestamo: prestamosActuales) {
			if(prestamo.getLibroPrestado().getIsbn().equals(libro.getIsbn())) {
				prestamosActuales.remove(prestamo);
			}
		}
	}

	public String listarPrestamos() {
		System.out.println("\n>> Prestamos de: " + getNombre());
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

	public ArrayList<Prestamo> getPrestamosActuales() {
		return prestamosActuales;
	}

	public void setPrestamosActuales(ArrayList<Prestamo> prestamosActuales) {
		this.prestamosActuales = prestamosActuales;
	}

}
