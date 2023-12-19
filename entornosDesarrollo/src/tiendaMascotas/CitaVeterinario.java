package tiendaMascotas;

import java.util.Date;

public class CitaVeterinario {

	// Atributos

	private int idCita;
	private Date fecha;
	private Mascota mascota;
	private String motivo;
	private boolean activa = true; 

	// Constructor

	public CitaVeterinario (int idCita, Date fecha, Mascota mascota, String motivo, boolean activa) {
		this.idCita=idCita;
		this.fecha=fecha;
		this.mascota=mascota;
		this.motivo=motivo;
		this.activa=activa;
	
	}
	
	// Funciones
	
	public void reprogramarCita (Date newFecha) {
		this.fecha = newFecha;
	}
	
	public void cancelarCita () {
		this.activa = false;
	}

	// Get & Set

	public int getIdCita() {
		return idCita;
	}

	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}
}
