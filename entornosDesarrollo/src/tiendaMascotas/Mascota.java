package tiendaMascotas;

import java.util.ArrayList;

public class Mascota {

	// Atributos
	
	private int idMascota;
	private String nombre;
	private String especie;
	private ArrayList<CitaVeterinario> listaCitas;
	
	// Constructor
	
	public Mascota (int idMascota, String nombre, String especie) {
		this.idMascota=idMascota;
		this.nombre =nombre;
		this.especie= especie;
		this.listaCitas=new ArrayList<>();
	}

	// Funciones
	
	public void programarCita (CitaVeterinario cita) {
		listaCitas.add(cita);
	}
	
	public void listarCitas() {
		if(listaCitas.isEmpty()) {
			System.out.println("| Esta mascota no tiene ninguna cita");
		}else {
			for (CitaVeterinario cita : listaCitas) {
				if(cita.isActiva()) {
					System.out.println("| " + cita.getIdCita() + ": " + cita.getMotivo() + " --> "+ cita.getFecha());

				}
			}
		}
		
		
		
	}

	// Get & Set
	
	public int getIdMascota() {
		return idMascota;
	}
	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public ArrayList<CitaVeterinario> getListaCitas() {
		return listaCitas;
	}
	public void setListaCitas(ArrayList<CitaVeterinario> listaCitas) {
		this.listaCitas = listaCitas;
	}

}
