package ontology.objetos;

import java.util.ArrayList;

public class ECG {
	
	private ArrayList<Enfermedad> diagnostico;
	private ArrayList<Ciclo> ciclos;
	private ArrayList<Patron> patrones;
	private RitmoCardiaco ritmoCardiaco;
	private String nombre;
	
	public ECG(ArrayList<Ciclo> ciclos,
			RitmoCardiaco ritmoCardiaco, String nombre) {
		
		this.ciclos = ciclos;
		this.ritmoCardiaco = ritmoCardiaco;
		this.nombre = nombre;
	}

	public ArrayList<Enfermedad> getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(ArrayList<Enfermedad> diagnostico) {
		this.diagnostico = diagnostico;
	}

	public ArrayList<Ciclo> getCiclos() {
		return ciclos;
	}

	public void setCiclos(ArrayList<Ciclo> ciclos) {
		this.ciclos = ciclos;
	}

	public ArrayList<Patron> getPatrones() {
		return patrones;
	}

	public void setPatrones(ArrayList<Patron> patrones) {
		this.patrones = patrones;
	}

	public RitmoCardiaco getRitmoCardiaco() {
		return ritmoCardiaco;
	}

	public void setRitmoCardiaco(RitmoCardiaco ritmoCardiaco) {
		this.ritmoCardiaco = ritmoCardiaco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
