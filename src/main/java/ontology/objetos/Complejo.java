package ontology.objetos;

public abstract class Complejo {

	private int inicio;
	private int fin;
	private int numCiclo;
	
	
	public Complejo(int inicio, int fin, int numCiclo) {

		this.inicio = inicio;
		this.fin = fin;
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

	public int getNumCiclo() {
		return numCiclo;
	}

	public void setNumCiclo(int numCiclo) {
		this.numCiclo = numCiclo;
	}
	
	
}
