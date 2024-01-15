package bibliotecaClase;

import java.util.Date;

public class Prestamo {

	private static int contadorId = 0;
	private int idPrestamo;
	private Date fechaPrestamo;
	private Date fechaDevolucion;
	private Libro libroPrestado;
	private Usuario usuario;

	// Constructor
	public Prestamo(Libro libroPrestado, Usuario usuario, int diasPrestamo) {
		this.idPrestamo = contadorId++;
		this.fechaPrestamo = new Date();
		this.fechaDevolucion = new Date(fechaPrestamo.getTime() + (long) diasPrestamo * 24 * 60 * 60 * 1000);
		this.libroPrestado = libroPrestado;
		this.usuario = usuario;
	}

	// Métodos
	public boolean esVencido() {
		return new Date().after(fechaDevolucion);

	}

	public String generarRecibo() {
		String estado = esVencido() ? "Vencido" : "En tiempo";
		return String.format("Préstamo ID: %d, Libro: %s, Usuario: %s, Estado: %s",
				idPrestamo, libroPrestado.getTitulo(), usuario.getNombre(), estado);
	}

	public String toString() {
		return generarRecibo();
	}

	// Getters y setters
	public int getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Libro getLibroPrestado() {
		return libroPrestado;
	}

	public void setLibroPrestado(Libro libroPrestado) {
		this.libroPrestado = libroPrestado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
