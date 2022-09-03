package Package;

public class Administrativo extends Trabajador {
	private int opcionHrAdmin;

	public Administrativo(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, int opcionHrAdmin) {
		super(tituloProfesional, nombre, direccion, estadoCivil, rut);
		this.opcionHrAdmin = opcionHrAdmin;
	}



	public void getHorario() {
		if (this.opcionHrAdmin == 1) {
			System.out.println("Horario: 08:30-10:50");
		}
		if (this.opcionHrAdmin == 2) {
			System.out.println("Horario: 12:00-18:00");
		}
		if (this.opcionHrAdmin == 3) {
			System.out.println("Horario 18:10-22:00");
		}
	}
	public String getTipo(){
		return "administrativo";
	}
}