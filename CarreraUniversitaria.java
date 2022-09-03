package Package;

public class CarreraUniversitaria {
	private String nombreCarrera;
	private int codCarrera;

	public String getNombreCarrera() {
		return this.nombreCarrera;
	}

	public CarreraUniversitaria(String nombreCarrera, int codCarrera) {
		this.nombreCarrera = nombreCarrera;
		this.codCarrera = codCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public int getCodCarrera() {
		return this.codCarrera;
	}

	public void setCodCarrera(int codCarrera) {
		this.codCarrera = codCarrera;
	}
}