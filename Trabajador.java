package Package;

public abstract class Trabajador {
	private String tituloProfesional;
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private String rut;

	public Trabajador(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut) {
		this.tituloProfesional = tituloProfesional;
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.rut = rut;
	}

	public String getTituloProfesional() {
		return this.tituloProfesional;
	}

	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public abstract void getHorario();

	public  abstract String getTipo();
}
