package Package;

import java.util.ArrayList;
import Package.Administrativo;
import Package.Profesor;
import Package.CarreraUniversitaria;

public class Departamento {
	private String nombreDepa;
	private ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();
	public ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	private ArrayList<CarreraUniversitaria> carreras = new ArrayList<CarreraUniversitaria>();

	public Departamento(String nombreDepa) {
		this.nombreDepa = nombreDepa;
	}

	public String getNombreDepa() {
		return this.nombreDepa;
	}

	public void setNombreDepa(String nombreDepa) {

		this.nombreDepa = nombreDepa;
	}
}