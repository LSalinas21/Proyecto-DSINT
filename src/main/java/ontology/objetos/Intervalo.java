package ontology.objetos;

public abstract class Intervalo {
	
	private int inicio;
	private int fin;
	private int duracion;
	private int numCiclo;
	
	public Intervalo(int inicio, int fin, int numCiclo) {

		this.inicio = inicio;
		this.fin = fin;
		this.duracion = this.fin - this.inicio;
		this.numCiclo = numCiclo;
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
	public int getDuracion() {
		
		return duracion;
	}

	public int getNumCiclo() {
		return numCiclo;
	}

	public void setNumCiclo(int numCiclo) {
		this.numCiclo = numCiclo;
	}
	
}
