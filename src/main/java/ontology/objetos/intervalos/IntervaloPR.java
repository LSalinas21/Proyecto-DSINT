package ontology.objetos.intervalos;

import ontology.objetos.Ciclo;
import ontology.objetos.Intervalo;
import ontology.objetos.ondas.OndaP;
import ontology.objetos.segmentos.SegmentoPR;

public class IntervaloPR extends Intervalo{
	
	private OndaP ondP;
	private SegmentoPR segPR;
	
	public IntervaloPR(OndaP ondP, SegmentoPR segPR) {
		super(ondP.getInicio(), segPR.getFin());
		this.ondP = ondP;
		this.segPR = segPR;
	}

	public OndaP getOndP() {
		return ondP;
	}

	public void setOndP(OndaP ondP) {
		this.ondP = ondP;
	}

	public SegmentoPR getSegPR() {
		return segPR;
	}

	public void setSegPR(SegmentoPR segPR) {
		this.segPR = segPR;
	}
	
	public int getNumCiclo() {
		
		return this.ondP.getNumCiclo();
	}
	
	
	
}
