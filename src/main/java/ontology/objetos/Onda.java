package ontology.objetos;

public abstract class Onda {
	
	private int numCiclo;
	private int inicio;
	private int fin;
	private double pico;
	
	public Onda(int inicio, int fin, double pico, int ciclo ) {
		this.inicio = inicio;
		this.fin = fin;
		this.pico = pico;
		this.numCiclo = ciclo;
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

	public double getPico() {
		return pico;
	}

	public void setPico(int pico) {
		this.pico = pico;
	}

	public int getNumCiclo() {
		return numCiclo;
	}

	public void setNumCiclo(int numCiclo) {
		this.numCiclo = numCiclo;
	}
	
	

	
	
	
}
