package ontology.objetos.complejos;

import ontology.objetos.Complejo;
import ontology.objetos.ondas.OndaQ;
import ontology.objetos.ondas.OndaR;
import ontology.objetos.ondas.OndaS;

public class ComplejoQRS extends Complejo{
	
	private OndaQ ondaQ;
	private OndaR ondaR;
	private OndaS ondaS;
	
	
	

	public ComplejoQRS(OndaQ ondaQ, OndaR ondaR, OndaS ondaS) {
		super(ondaQ.getInicio(),ondaS.getFin(), ondaQ.getNumCiclo());
		this.ondaQ = ondaQ;
		this.ondaR = ondaR;
		this.ondaS = ondaS;
	}

	public OndaQ getOndaQ() {
		return ondaQ;
	}

	public void setOndaQ(OndaQ ondaQ) {
		this.ondaQ = ondaQ;
	}

	public OndaR getOndaR() {
		return ondaR;
	}

	public void setOndaR(OndaR ondaR) {
		this.ondaR = ondaR;
	}

	public OndaS getOndaS() {
		return ondaS;
	}

	public void setOndaS(OndaS ondaS) {
		this.ondaS = ondaS;
	}
	public int getNumCiclo() {
		
		return ondaQ.getNumCiclo();
	}
	
}
