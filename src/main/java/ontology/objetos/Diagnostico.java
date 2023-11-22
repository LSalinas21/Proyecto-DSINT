package ontology.objetos;

public class Diagnostico {

	private String enfermedades;
	private String patrones;
	private String nombre;


	public Diagnostico(String nombre) {
		
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEnfermedades() {
		return enfermedades;
	}

	public void setEnfermedades(String texto) {
		
		if (this.enfermedades != null) {

			this.enfermedades = this.enfermedades + " + " + texto;

		}else {
			
			this.enfermedades = texto;
		}
	}

	public String getPatrones() {
		return patrones;
	}

	public void setPatrones(String patrones) {
		
		if (this.patrones != null) {
			
			this.patrones = this.patrones + "\n" + patrones;

		}else {
			
			this.patrones = patrones;
		}
	}
	
	
}
