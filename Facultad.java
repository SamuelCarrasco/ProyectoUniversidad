package Package;

import java.util.ArrayList;
import Package.Departamento;

public class Facultad {
	private String nombre;
	private double ubicacionLatitud;
	private double ubicacionLongitud;
	private int codFacultad;

	private ArrayList<CarreraUniversitaria> carrerasU = new ArrayList<CarreraUniversitaria>();
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

	public Facultad(String nombre, double ubicacionLatitud, double ubicacionLongitud, int codFacultad) {
		this.nombre = nombre;
		this.ubicacionLatitud = ubicacionLatitud;
		this.ubicacionLongitud = ubicacionLongitud;
		this.codFacultad = codFacultad;
	}

	public void agregarDepartamentos(){
		departamentos.add(new Departamento("Matematica"));
		departamentos.add(new Departamento("Ingeneria Industrial"));
		departamentos.add(new Departamento("Fisica"));
		departamentos.add(new Departamento("Medicina"));
	}




	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getUbicacionLatitud() {
		return this.ubicacionLatitud;
	}

	public void setUbicacionLatitud(double ubicacionLatitud) {
		this.ubicacionLatitud = ubicacionLatitud;
	}

	public double getUbicacionLongitud() {
		return this.ubicacionLongitud;
	}

	public void setUbicacionLongitud(double ubicacionLongitud) {
		this.ubicacionLongitud = ubicacionLongitud;
	}
}