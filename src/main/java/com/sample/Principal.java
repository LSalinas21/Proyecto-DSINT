package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import parser.Parser;

public class Principal {
	
	private static String ruta = "C:\\Users\\juanj\\OneDrive\\Escritorio\\DSInt\\ECG-input.recursos\\ECG-input\\bradicardia.ecg";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // load up the knowledge base
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("reglas-perseo");

            Parser p = new Parser();
            p.parseFile(ruta);
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
	}

}
