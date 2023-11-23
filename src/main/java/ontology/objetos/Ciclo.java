package ontology.objetos;

import ontology.objetos.intervalos.IntervaloPR;
import ontology.objetos.intervalos.IntervaloQT;
import ontology.objetos.segmentos.SegmentoTP;

public class Ciclo {
	
	private int numCiclo;
	private ECG ecg;
	private IntervaloPR intPR;
	private IntervaloQT intQT;
	private SegmentoTP segTP;
	
	public Ciclo(int numCiclo, ECG ecg, IntervaloPR intPR, IntervaloQT intQT, SegmentoTP segTP) {

		this.numCiclo = numCiclo;
		this.ecg = ecg;
		this.intPR = intPR;
		this.intQT = intQT;
		this.segTP = segTP;
	}

	public int getNumCiclo() {
		return numCiclo;
	}

	public void setNumCiclo(int numCiclo) {
		this.numCiclo = numCiclo;
	}

	public ECG getEcg() {
		return ecg;
	}

	public void setEcg(ECG ecg) {
		this.ecg = ecg;
	}

	public IntervaloPR getIntPR() {
		return intPR;
	}

	public void setIntPR(IntervaloPR intPR) {
		this.intPR = intPR;
	}

	public IntervaloQT getIntQT() {
		return intQT;
	}

	public void setIntQT(IntervaloQT intQT) {
		this.intQT = intQT;
	}

	public SegmentoTP getSegTP() {
		return segTP;
	}

	public void setSegTP(SegmentoTP segTP) {
		this.segTP = segTP;
	}
	
	
}
