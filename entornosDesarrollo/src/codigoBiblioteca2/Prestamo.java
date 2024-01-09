package codigoBiblioteca2;

import java.util.ArrayList;
import java.util.Date;


public class Prestamo {

	//ATRIBUTOS
	private static int contadorId = 0;
	private int idPrestamo;
	private Date fechaPrestamo;
	private Date fechaDevolucion;
	private Libro libroPrestado;
	private Usuario usuario;
	
	//CONSTRUCTOR
	public Prestamo(Libro libroPrestado, Usuario usuario, int diasPrestamo) {
		this.idPrestamo = contadorId++;
		this.libroPrestado=libroPrestado;
		this.usuario=usuario;
		this.fechaPrestamo = new Date();
		this.fechaDevolucion = new Date(fechaPrestamo.getTime() + (long) diasPrestamo * 24 * 60 * 60 * 1000);
	}

	//METODOS
	public boolean esVencido() {
		return new Date().after(fechaDevolucion);

	}
	
	public ArrayList<String> generarRecibo() {
		ArrayList<String> tabla = new ArrayList<String>();
		String estado = esVencido() ? "Vencido" : "En tiempo";
		
		tabla.add("Prestamo ID : " + idPrestamo);
		tabla.add("Libro : " + libroPrestado.getTitulo());
		tabla.add("Usuario : " + usuario.getNombre());
		tabla.add("Estado : " + estado);
		
		return tabla;
	}
	
	public void mostrarInfo (ArrayList<String> tabla) {
		System.out.println("+-------------------------------+");
		for (String item : tabla) {
			System.out.println("--> " + item);
		}
		System.out.println("+-------------------------------+");
	}

	
	//GET&SET
	public static int getContadorId() {
		return contadorId;
	}
	public static void setContadorId(int contadorId) {
		Prestamo.contadorId = contadorId;
	}
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
