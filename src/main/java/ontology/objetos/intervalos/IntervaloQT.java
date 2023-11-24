package ontology.objetos.intervalos;


import ontology.objetos.Intervalo;
import ontology.objetos.complejos.ComplejoQRS;
import ontology.objetos.ondas.OndaT;
import ontology.objetos.segmentos.SegmentoST;

public class IntervaloQT extends Intervalo{
	
	private OndaT ondT;
	private SegmentoST segST;
	private ComplejoQRS comQRS;
	
	public IntervaloQT(ComplejoQRS comQRS, OndaT ondT, SegmentoST segST) {
		super(comQRS.getInicio(), ondT.getFin(), ondT.getNumCiclo()); // Esto no se si este bien, al parecer comienza desde la onda Q
		this.ondT = ondT;
		this.segST = segST;
		this.comQRS = comQRS;
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

	public ComplejoQRS getComQRS() {
		return comQRS;
	}

	public void setComQRS(ComplejoQRS comQRS) {
		this.comQRS = comQRS;
	}
	
}
