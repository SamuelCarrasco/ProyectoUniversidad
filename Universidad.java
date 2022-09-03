package Package;

import java.util.*;

import Package.Trabajador;
import Package.Facultad;

public class Universidad {
	private String nombreU;

	private ArrayList<CarreraUniversitaria> carrerasU = new ArrayList<CarreraUniversitaria>();
	private ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
	public ArrayList<Facultad> facultades = new ArrayList<Facultad>();



	public void añadirTrabajadores(){
		this.trabajadores.add(new Profesor("Indefinido", "Licenciado Ing Matemáticas", "Samuel Carrasco", "Bandurrias 9822", "Casado", "42038409-1", 1));
		this.trabajadores.add(new Profesor("Definido", "Licenciado Ing Fisica", "Constanza Rivera", "Bandurrias 9822", "Soltero", "23290232-2", 2));
		this.trabajadores.add(new Profesor("Indefinido", "Licenciado Psicología", "Bianca Carrasco", "Bandurrias 9822", "Casado", "2323232-6", 3));
		this.trabajadores.add(new Profesor("Indefinido", "Ingeniería Civil Industrial", "Emiliano Rivera", "Bandurrias 9822", "Solterp", "2398232-2", 1));
		this.trabajadores.add(new Administrativo("Director decanato", "Rodrigo Sanchez", "Los Queltehues 9234", "Soltero", "93920922-2", 1));
		this.trabajadores.add(new Administrativo("Director CODI", "Rodrigo Sanchez", "Los Queltehues 9234", "Soltero", "93920922-2", 2));
		this.trabajadores.add(new Administrativo("Director DDE", "Raul Sanchez", "Los Queltehues 9234", "Soltero", "10220922-2", 3));
		this.trabajadores.add(new Administrativo("Director EFI", "Benjamin Carrasco", "Los Queltehues 9234", "Casado", "312920922-2", 1));
		this.trabajadores.add(new Administrativo("Director ICI-I", "Lucas Sepulveda", "Los Queltehues 9234", "Casado", "38923920922-2", 2));
	}


	public void encontrarProfesores(){
		List<Profesor> profesores = new ArrayList<Profesor>();
		for (Trabajador trabajador : this.trabajadores) {
			if (trabajador.getTipo().equals("profesor")) {
				profesores.add( (Profesor) trabajador);
			}
		}
	}

	public void encontrarAdministrativo(){
		List<Administrativo> administrativos = new ArrayList<Administrativo>();
		for (Trabajador trabajador: this.trabajadores) {
			if (trabajador.getTipo().equals("administrativo")){
				administrativos.add((Administrativo) administrativos);
			}
		}
	}

	public void añadirFacultades(){
		this.facultades.add(new Facultad("Salud", 98984, 903409, 1 ));
		this.facultades.add(new Facultad("Macro facultad", 998284, 903402349, 2 ));
		this.facultades.add(new Facultad("FICA", 990321984, 171028893, 2 ));
	}

	public void agregarCarreras(){
		this.carrerasU.add(new CarreraUniversitaria("Derecho", 2));
		this.carrerasU.add(new CarreraUniversitaria("Ingeniería Comercial", 2));
		this.carrerasU.add(new CarreraUniversitaria("ICI-I", 3));
		this.carrerasU.add(new CarreraUniversitaria("ICI", 3));
		this.carrerasU.add(new CarreraUniversitaria("Enfermería", 1));
		this.carrerasU.add(new CarreraUniversitaria("ICI-M",3 ));
		this.carrerasU.add(new CarreraUniversitaria("Medicina", 1));
	}

	public void carrerasFacultad(int codCarrera){
		List<CarreraUniversitaria> carreraUniversitarias = new ArrayList<CarreraUniversitaria>();
		for (CarreraUniversitaria carreraUniversitaria: this.carrerasU) {
			if ( carreraUniversitaria.getCodCarrera().equals(codCarrera)==1) {
				this.facultades.add()
			}
			
		}
	}

	public String getNombreU() {
		return this.nombreU;
	}

	public void setNombreU(String nombreU) {
		this.nombreU = nombreU;
	}
}