package com.sample;

import java.util.ArrayList;
import java.util.HashMap;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import ontology.objetos.Onda;
import parser.Parser;

public class Principal {
	
	private static String ruta = "C:\\Users\\juanj\\OneDrive\\Escritorio\\DSInt\\ECG-input.recursos\\ECG-input\\bradicardia.ecg";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            // load up the knowledge base
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("reglas-ECG");

            Parser p = new Parser();
            ArrayList<Onda> ondas =  (ArrayList<Onda>) p.parseFile(ruta);
            
            for (Onda o: ondas) {
            	
            	kSession.insert(o);
            }
            
            kSession.fireAllRules();
            
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
	}

}
