package ontology.objetos;

public abstract class Complejo {

	private Ciclo ciclo;
	private int inicio;
	private int fin;
	
	
	public Complejo(Ciclo ciclo, int inicio, int fin) {

		this.ciclo = ciclo;
		this.inicio = inicio;
		this.fin = fin;
	}
	public Ciclo getCiclo() {
		return ciclo;
	}
	public void setCiclo(Ciclo ciclo) {
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
	
	
}
