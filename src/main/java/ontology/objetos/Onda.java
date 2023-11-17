package ontology.objetos;

public abstract class Onda {
	
	private int inicio;
	private int fin;
	private double pico;
	
	public Onda(int inicio, int fin, double pico) {
		this.inicio = inicio;
		this.fin = fin;
		this.pico = pico;
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


	
	
	
}
