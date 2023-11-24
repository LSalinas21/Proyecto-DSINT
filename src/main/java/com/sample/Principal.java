package com.sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.Agenda;

import ontology.objetos.Onda;
import parser.Parser;

public class Principal {
	
	private static String dirEntrada = "ECG-input\\";
	private static String dirSalida = "Salida\\";
	
	private static String patronECG = "^(.*\\\\)([^\\\\]+)\\.(\\w+)$";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// comprobacion de las rutas
		compruebaArgumentos(args);
		
		Pattern patterP = Pattern.compile(patronECG,Pattern.CASE_INSENSITIVE);
		
		try {
			Files.walk(Paths.get(dirEntrada)).forEach(ruta-> {
			    
				if (Files.isRegularFile(ruta)) {
			    	
			    	Matcher matcherECG = patterP.matcher(ruta.toString());
			    	if (matcherECG.find()) {

			    		//System.out.println(matcherECG.group(0));
			    		
			    		try {
			                // load up the knowledge base
			    			//System.out.println("\n\n\n" + ruta);
			    			
			                KieServices ks = KieServices.Factory.get();
			                KieContainer kContainer = ks.getKieClasspathContainer();
			                KieSession kSession = kContainer.newKieSession("reglas-ECG");

			                Parser p = new Parser();
			                ArrayList<Onda> ondas =  (ArrayList<Onda>) p.parseFile(ruta.toString());
			                
			                //archivo de salida individual
			                FileWriter fileIndi = new FileWriter(dirSalida + matcherECG.group(2) + ".salida.txt");
			            	
			            	
			            	// buffer de escritura individual
			            	BufferedWriter bufferedIndi = new BufferedWriter(fileIndi);
			            	bufferedIndi.write("Pattern: ");
			            	
			            	//se inserta el buffer
			            	kSession.insert(bufferedIndi);
			                
			                for (Onda o: ondas) {
			                	
			                	kSession.insert(o);
			                }
			                
			                
			                Agenda agenda = kSession.getAgenda();
			                agenda.getAgendaGroup("Ciclos").setFocus();
			                kSession.fireAllRules();
			                agenda.getAgendaGroup("Enfermedades").setFocus();
			                kSession.fireAllRules();
			                agenda.getAgendaGroup("Imprimir").setFocus();
			                kSession.fireAllRules();
			                
			                bufferedIndi.close();
			                
			                //lee el archivo individual y lo escribe en el todo
			                escribeEnTodo(matcherECG);
			    			
			            } catch (Throwable t) {
			                t.printStackTrace();
			            }
			    	}
			    }
				
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//lee el archivo todo y lo imprime en consola
		imprimeFicheroTodo();
		
	}
	
	public static void compruebaArgumentos(String[] args) {
		
		if(args.length == 1) {
			
			dirEntrada = args[0];
			
		}else if(args.length == 2) {
			
			dirEntrada = args[0];
			dirSalida = args[1];
		}
	}
	public static void escribeEnTodo(Matcher matcherECG) {
		
		
		try {
			
			FileWriter fileTodo = new FileWriter(dirSalida + "todo.salida.txt", true);
			BufferedWriter bufferedTodo = new BufferedWriter(fileTodo);
	        
	        FileReader fr = new FileReader(dirSalida + matcherECG.group(2) + ".salida.txt");
	        BufferedReader br = new BufferedReader(fr);
	        String linea = br.readLine();
	        
	        bufferedTodo.write("Archivo: " + matcherECG.group(2) + ".ecg");
	        bufferedTodo.newLine();
	        
	        while(linea != null) {
	        	
	        	
	        	bufferedTodo.write(linea);
	        	bufferedTodo.newLine();
	        	linea = br.readLine();
	        }
	        
	        bufferedTodo.newLine();
	        bufferedTodo.newLine();
	        
	        fr.close();
			bufferedTodo.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	public static void imprimeFicheroTodo() {
		
		
		try {
			FileReader fr = new FileReader(dirSalida + "todo.salida.txt");
			BufferedReader br = new BufferedReader(fr);
	        String linea = br.readLine();
	        
	        while(linea != null) {
	        	
	        	
	        	System.out.println(linea);
	        	linea = br.readLine();
	        }
	        br.close();
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}


}
