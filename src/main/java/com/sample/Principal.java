package com.sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.Agenda;

import ontology.objetos.Onda;
import parser.Parser;

public class Principal {
	
	private static String dirEntrada = "C:\\Users\\juanj\\OneDrive\\Escritorio\\DSInt\\ECG-input.recursos\\ECG-input\\hipocalcemia+iam.ecg";
	private static String dirSalida = "\\Salida";
	private static String dirEntrada1 = "C:\\Users\\juanj\\OneDrive\\Escritorio\\DSInt\\ECG-input.recursos\\ECG-input\\";
	
	private static String patronECG = "\\w*\\.ecg";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern patterP = Pattern.compile(patronECG,Pattern.CASE_INSENSITIVE);
		ArrayList<String> rutas = new ArrayList<String>();
		try {
			Files.walk(Paths.get(dirEntrada1)).forEach(ruta-> {
			    if (Files.isRegularFile(ruta)) {
			    	Matcher matcherECG = patterP.matcher(ruta.toString());
			    	if (matcherECG.find()) {
			    		rutas.add(ruta.toString());
			    	}
			    }
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			for(String ruta:rutas) {
            // load up the knowledge base
			System.out.println("\n\n\n" + ruta);
			
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("reglas-ECG");

            Parser p = new Parser();
            ArrayList<Onda> ondas =  (ArrayList<Onda>) p.parseFile(ruta);
            
            for (Onda o: ondas) {
            	
            	kSession.insert(o);
            }
            Agenda agenda = kSession.getAgenda();
            agenda.getAgendaGroup("Ciclos").setFocus();
            kSession.fireAllRules();
            agenda.getAgendaGroup("Enfermedades").setFocus();
            kSession.fireAllRules();
            agenda.getAgendaGroup("Diagnostico").setFocus();
            kSession.fireAllRules();
            
			}
        } catch (Throwable t) {
            t.printStackTrace();
        }
	}


}
