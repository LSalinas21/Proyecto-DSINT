package ontology.objetos;

public abstract class Intervalo {
	
	private int inicio;
	private int fin;
	
	public Intervalo(int inicio, int fin) {

		this.inicio = inicio;
		this.fin = fin;
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

	
	
}
