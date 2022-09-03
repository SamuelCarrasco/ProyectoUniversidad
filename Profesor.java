package Package;

public class Profesor extends Trabajador {
	private String tipoContrato;
	private int opcionContrato;



	public Profesor(String tipoContrato, String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, int opcionContrato) {
		super(tituloProfesional, nombre, direccion, estadoCivil, rut);
		this.tipoContrato = tipoContrato;
		this.opcionContrato = opcionContrato;
	}

	public String getTipoContrato() {
		return this.tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public void getHorario() {
		if (this.opcionContrato == 1) {
			System.out.println("Jornada parcial");
		}
		if (this.opcionContrato == 2) {
			System.out.println("Media jornada");
		}
		if (this.opcionContrato == 3) {
			System.out.println("Jornada completa");
		}
		//los profesores deben especificar si son contratados a
		// jornada parcial, media jornada o jornada completa.
	}

	public String getTipo(){
		return "profesor";
	}
}