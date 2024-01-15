package bibliotecaClase;

public class Biblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro = new Libro("123456789", "El Principito", "Antoine de Saint-Exupéry", 1943, 5);

		Empleado empleado = new Empleado("E01", "Juan Perez", "Bibliotecario");

		Usuario usuario = empleado.registrarUsuario("U100", "Ana Gomez");

		// Realizar un préstamo

		Prestamo prestamo = new Prestamo(libro, usuario, 14);
		Prestamo prestamo2 = new Prestamo(libro, usuario, 14);

		usuario.tomarPrestado(prestamo);
		usuario.tomarPrestado(prestamo2);

		// Imprimir información del préstamo
		System.out.println("\n>> Recibo del prestamo: ");
		System.out.println(prestamo);
		System.out.println("\n>> Recibo del prestamo: ");
		System.out.println(prestamo2);
		
		System.out.println(libro);
		
		
		System.out.println(usuario.listarPrestamos());

		// Procesar una devolución

		empleado.procesarDevolucion(usuario, libro);
		

		// Mostrar la información del libro después de la devolución

		System.out.println(libro);
		

		

	}

}
