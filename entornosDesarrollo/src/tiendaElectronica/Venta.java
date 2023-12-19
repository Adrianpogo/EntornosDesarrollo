package tiendaElectronica;

import java.util.Date;

public class Venta {

	private String idVenta;
	private Producto producto;
	private int cantidadVendida;
	private Cliente cliente;
	private Date fechaVenta;

	// CONSTRUCTOR
	public Venta (String idVenta,  Producto producto, int cantidadVendida, Cliente cliente,  Date fechaVenta) {
		this.idVenta=idVenta;
		this.producto=producto;
		this.cantidadVendida=cantidadVendida;
		this.cliente=cliente;
		this.fechaVenta=fechaVenta;
		
	}
	
	// METODOS
	public  double calcularTotal () {
		double total = cantidadVendida*producto.getPrecio();
		return total;
	}
	
	public  void generarRecibo() {
		double total = calcularTotal();
		
		System.out.println();
		System.out.println("  Para la venta ---> " + idVenta);
		System.out.println("   - Cliente : " + cliente.getNombre() + ", con id (" + cliente.getIdCliente() + ")");
		System.out.println("   - Producto : " + producto.getNombre());
		System.out.println("   - Fecha de la venta : " + fechaVenta);
		System.out.println("   - Cantidad vendida : " + cantidadVendida);
		System.out.println("   - Precio de cada unidad : " + producto.getPrecio());
		System.out.println("+---------------------------------------------+");
		System.out.println("   - TOTAL : " + total);
		System.out.println("+---------------------------------------------+");
	}
	

	// GET & SET
	public String getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidadVendida() {
		return cantidadVendida;
	}

	public void setCantidadVendida(int cantidadVendida) {
		this.cantidadVendida = cantidadVendida;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
}
