package codigoBiblioteca;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Libro {

	// ATRIBUTOS
	
	private String ISBN;
	private String titulo;
	private String autor;
	private int añoPublicacion;
	private int cantidadStock;
	
	// CONSTRUCTOR
	
	public Libro (String ISBN, String titulo, String autor, int añoPublicacion, int cantidadStock) {
		this.setISBN(ISBN);
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setAñoPublicacion(añoPublicacion);
		this.cantidadStock = cantidadStock;
	}
	
	
	// MÉTODOS
	
	public void agregarCopia (int cantidad) {
		this.cantidadStock += cantidadStock;
	}
	
	public ArrayList<String> crearInfo (){
		ArrayList<String> tabla = new ArrayList<String>();
		añadirFila(tabla, "ISBN", ISBN);
		añadirFila(tabla, "Titulo", titulo);
		añadirFila(tabla, "Autor", autor);
		añadirFila(tabla, "Año de publicación", añoPublicacion+"");
		añadirFila(tabla, "Cantidad", cantidadStock+"");
		
		return tabla;
	}
	
	private void añadirFila (ArrayList<String> tabla, String atributo, String valor) {
		tabla.add(atributo + " : " + valor);
		
	}
	
	public void mostrarInfo (ArrayList<String> tabla) {
		System.out.println("+-------------------------------+");
		for (String item : tabla) {
			System.out.println("--> " + item);
		}
		System.out.println("+-------------------------------+");
	}
	


	
	// GET & SET 
	
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	
	
	

}
