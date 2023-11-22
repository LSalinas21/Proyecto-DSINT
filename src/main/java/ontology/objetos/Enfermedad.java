package ontology.objetos;

public class Enfermedad {
	
	private String nombre;
	private String texto;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Enfermedad(String nombre) {
		super();
		this.nombre = nombre;
	}
}
