package tiendaMascotas;

import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();

		Cliente cliente1 = new Cliente(001, "Rubén" );
		Cliente cliente2 = new Cliente(002, "Lucía");
		Cliente cliente3 = new Cliente(003, "Mario");

		listaClientes.add(cliente1);
		listaClientes.add(cliente2);
		listaClientes.add(cliente3);

		Mascota mascota1 = new Mascota(001, "Kira", "Gato");
		Mascota mascota2 = new Mascota(002, "Luna", "Gato");
		Mascota mascota3 = new Mascota(003, "Mizzy", "Pez");
		Mascota mascota4 = new Mascota(004, "Acua", "Perro");

		// Añadim
		cliente1.añadirMascota(mascota1);
		cliente1.añadirMascota(mascota2);
		cliente2.añadirMascota(mascota3);
		cliente1.añadirMascota(mascota4);

		// Añadir una cita a una mascota
		CitaVeterinario cita1 = new CitaVeterinario(001, new Date(), mascota1, "Ingerir comida inadecuada", true);
		CitaVeterinario cita2 = new CitaVeterinario(002, new Date(), mascota1, "Infección en una pata", true);
		CitaVeterinario cita3 = new CitaVeterinario(003, new Date(), mascota2, "Ingerir comida inadecuada", true);
		CitaVeterinario cita4 = new CitaVeterinario(004, new Date(), mascota4, "Fractura en una pata", true);

		mascota1.programarCita(cita1);
		mascota1.programarCita(cita2);
		mascota2.programarCita(cita3);
		mascota3.programarCita(cita4);
		
		// Cancelamos una cita para comprobar que se borra y no se imprime
		cita2.cancelarCita();

		// Imprimir la información de los clientes y sus mascotas
		for (Cliente cliente : listaClientes) {
			System.out.println();
			System.out.println("+-------------------------------------------------+");
			System.out.println("| Ficha de " + cliente.getNombre() + "(" + cliente.getIdCliente() + ")                               |");
			System.out.println("| id: " + cliente.getIdCliente() + ", Nombre: " + cliente.getNombre() + "                            |");
			System.out.println("+-------------------------------------------------+");
			System.out.println("| Mascotas:");
			cliente.listarMascotas();

			for (Mascota mascota : cliente.getListaMascotas()) {
				System.out.println("|");
				System.out.println("+-------------------------------------------------+");
				System.out.println("| Citas de " + mascota.getNombre());
				mascota.listarCitas();
			}
		}

		// Creamos un nuevo producto
		Producto producto1 = new Producto(001, "Comida para gatos", 20, 100);
		Producto producto2 = new Producto(002, "Comida para perros", 20, 70);
		Producto producto3 = new Producto(003, "Collarines", 5, 60);
		
		listaProductos.add(producto1);
		listaProductos.add(producto2);
		listaProductos.add(producto3);

		System.out.println("|");
		System.out.println("|");
		System.out.println("+-------------------------------------------------+");
		System.out.println("| LISTA DE PRODUCTOS:                             |");
		System.out.println("+-------------------------------------------------+");
		System.out.println("|");
		for (Producto producto : listaProductos) {
			System.out.println("| " + producto.getIdProducto() + ": " + producto.getNombre() + "(" + producto.getStock()
					+ ") --> " + producto.getPrecio() + "€");
		}

		System.out.println("| ");
		System.out.println("| ACCIONES: ");
		System.out.println("+-------------------------------------------------+");
		// Vendemos 5 unidades del producto
		System.out.println("| Se venden 5 unidades de " + producto1.getNombre());
		producto1.venderProducto(150);
		System.out.println("| Nuevo stock de " + producto1.getNombre() + " --> " + producto1.getStock());
		
		
		System.out.println("+-------------------------------------------------+");

	}

}
