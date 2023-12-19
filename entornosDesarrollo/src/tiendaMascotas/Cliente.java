package tiendaMascotas;

import java.util.ArrayList;

public class Cliente {

	// Atributos

	private int idCliente;
	private String nombre;
	private ArrayList<Mascota> listaMascotas;

	// Constructor

	public Cliente(int idCliente, String nombre) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.listaMascotas = new ArrayList<>();
	}

	// Funciones

	public void añadirMascota(Mascota mascota) {
		listaMascotas.add(mascota);
	}

	public void listarMascotas() {
		if (listaMascotas.isEmpty()) {
			System.out.println("| Este cliente no dispone de ninguna mascota registrada");
		} else {
			for (Mascota mascota : listaMascotas) {
				System.out.println(
						"| " + mascota.getIdMascota() + ": " + mascota.getNombre() + "(" + mascota.getEspecie() + ")");
			}
			System.out.println("|");
		}

	}

	// Get & Set

	public ArrayList<Mascota> getListaMascotas() {
		return listaMascotas;
	}

	public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
		this.listaMascotas = listaMascotas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

}
