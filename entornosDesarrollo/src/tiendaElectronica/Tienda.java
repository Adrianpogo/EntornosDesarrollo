package tiendaElectronica;

import java.util.ArrayList;

public class Tienda {

	private String nombre;
	private String direccion;
	private ArrayList<Producto> listaProductos;
	private ArrayList<Cliente> listaClientes;

	// CONSTRUCTOR
	public Tienda(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaProductos = new ArrayList<Producto>();
		this.listaClientes = new ArrayList<Cliente>();
	}

	// METODOS
	public void añadirProducto(Producto producto) {
		listaProductos.add(producto);
	}

	public void registrarCliente(Cliente cliente) {
		listaClientes.add(cliente);
	}

	public void realizarVenta(Venta venta) {

		for (Producto producto : listaProductos) {
			if (producto.getIdProducto().equals(venta.getProducto().getIdProducto())) {
				if (producto.getStock() < venta.getCantidadVendida()) {
					System.out.println("");
					System.out.println(">> Para la venta con id: " + venta.getIdVenta());
					System.out.println(">> No queda suficiente stock, no se ha completado la venta...");
				} else {
					producto.reducirStock(venta.getCantidadVendida());
					if (producto.getStock() <= 0) {
						producto.reponerStock(20);
					}
					venta.generarRecibo();
				}

			}

		}
	}

	public void imprimirDatos() {
		System.out.println(" ---> PRODUCTOS");
		for (Producto producto : listaProductos) {
			System.out.println("- idProducto: " + producto.getIdProducto() + ", nombre: " + producto.getNombre()
					+ ", precio: " + producto.getPrecio() + ", stock: " + producto.getStock());
		}
		System.out.println();
		System.out.println();
		System.out.println(" ---> CLIENTES ");
		for (Cliente cliente : listaClientes) {
			System.out.println("- idCliente: " + cliente.getIdCliente() + ", nombre: " + cliente.getNombre()
					+ ", correo: " + cliente.getCorreo());
		}
	}

	// GET & SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
}
