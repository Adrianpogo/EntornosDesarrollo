package tiendaElectronica;

import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		
		
		// Creación de objetos 
		Producto producto1 = new Producto("P001", "Televisor", 500.00, 10);
		Producto producto2 = new Producto("P002", "Tablet", 175.00, 30);
		Producto producto3 = new Producto("P003", "Cascos inalambricos", 30.00, 5);
		
		Cliente cliente1 = new Cliente("C001", "Juan Pérez", "juan@example.com");
		Cliente cliente2 = new Cliente("C002", "María López", "marialo@example.com");
		Cliente cliente3 = new Cliente("C003", "Cristian Román", "croman@example.com");
		
		Venta venta1 = new Venta("V001", producto1, 2, cliente1, new Date());
		Venta venta2 = new Venta("V002", producto2, 50, cliente2, new Date());
		Venta venta3 = new Venta("V002", producto3, 5, cliente3, new Date());

		Tienda tienda = new Tienda("ElectroTienda", "Calle Principal 123");
		
		System.out.println("+---------------------------------------------+");
		System.out.println("|                 T I E N D A                 |");
		System.out.println("+---------------------------------------------+");
		System.out.println("| Nombre --> " + tienda.getNombre() + "                    |");
		System.out.println("| Direccion --> " + tienda.getDireccion() + "           |");
		System.out.println("+---------------------------------------------+");
		 
		//Añadimos los objetos a la tienda
		tienda.añadirProducto(producto1);
		tienda.añadirProducto(producto2);
		tienda.añadirProducto(producto3);
		
		tienda.registrarCliente(cliente1);
		tienda.registrarCliente(cliente2);
		tienda.registrarCliente(cliente3);
		
		tienda.imprimirDatos();
		
		System.out.println();
		System.out.println();
		System.out.println("              >>> V E N T A S <<<              ");
		System.out.println("_______________________________________________");
		tienda.realizarVenta(venta1);
		tienda.realizarVenta(venta2);
		tienda.realizarVenta(venta3);
		
		

	}

}
