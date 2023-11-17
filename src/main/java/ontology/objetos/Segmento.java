package ontology.objetos;

public abstract class Segmento {
	
	private int inicio;
	private int fin;
	private Ciclo ciclo;
	
	public Segmento(int inicio, int fin, Ciclo ciclo) {

		this.inicio = inicio;
		this.fin = fin;
		this.ciclo = ciclo;
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

	public Ciclo getCiclo() {
		return ciclo;
	}

	public void setCiclo(Ciclo ciclo) {
		this.ciclo = ciclo;
	}
	
	
}
