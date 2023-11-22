package ontology.objetos;

public abstract class Segmento {
	
	private int inicio;
	private int fin;
	private int numCiclo;
	private int duracion;
	
	public Segmento(int inicio, int fin, int numCiclo) {

		this.inicio = inicio;
		this.fin = fin;
		this.numCiclo = numCiclo;
		this.duracion = fin - inicio;
	}

	public int getInicio() {
		return inicio;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public int getFin() {
		return fin;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	public int getNumCiclo() {
		return numCiclo;
	}

	public void setNumCiclo(int ciclo) {
		this.numCiclo = ciclo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
}
