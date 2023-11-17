package ontology.objetos.intervalos;

import ontology.objetos.Ciclo;
import ontology.objetos.Intervalo;
import ontology.objetos.ondas.OndaT;
import ontology.objetos.segmentos.SegmentoST;

public class IntervaloQT extends Intervalo{
	
	private OndaT ondT;
	private SegmentoST segST;
	
	public IntervaloQT(OndaT ondT, SegmentoST segST) {
		super(segST.getInicio(), ondT.getFin()); // Esto no se si este bien, al parecer comienza desde la onda Q
		this.ondT = ondT;
		this.segST = segST;
	}

	public OndaT getOndT() {
		return ondT;
	}

	public void setOndT(OndaT ondT) {
		this.ondT = ondT;
	}

	public SegmentoST getSegST() {
		return segST;
	}

	public void setSegST(SegmentoST segST) {
		this.segST = segST;
	}
	
	
}
