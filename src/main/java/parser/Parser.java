package parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ontology.objetos.Electrocardiograma;
import ontology.objetos.intervalos.IntervaloPR;
import ontology.objetos.intervalos.IntervaloQT;
import ontology.objetos.ondas.OndaP;
import ontology.objetos.ondas.OndaQ;
import ontology.objetos.ondas.OndaR;
import ontology.objetos.ondas.OndaS;
import ontology.objetos.ondas.OndaT;
import ontology.objetos.segmentos.SegmentoTP;
import ontology.objetos.Ciclo;

public class Parser {

	private static String patronOndaP = "P\\((\\d+),(\\d+),(\\d+(\\.\\d+)?\\))";
	private static String patronOndaQ = "Q\\(\\d+,\\d+,-{0,1}\\d+(\\.\\d+)?\\)";
	private static String patronOndaR = "R\\(\\d+,\\d+,\\d+(\\.\\d+)?\\)";
	private static String patronOndaS = "S\\(\\d+,\\d+,-{0,1}\\d+(\\.\\d+)?\\)";
	private static String patronOndaT = "T\\(\\d+,\\d+,\\d+(\\.\\d+)?\\)";
	
	public void parseFile(String fileName) throws IOException {

        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        ArrayList<Ciclo> ciclos = new ArrayList<Ciclo>();
        
        int contOndas = 0;
        
        //Electrocardiograma ecg = new Electrocardiograma();
        
        Pattern patterP = Pattern.compile(patronOndaP,
                Pattern.CASE_INSENSITIVE);
        Pattern patterQ = Pattern.compile(patronOndaQ,
                Pattern.CASE_INSENSITIVE);
        Pattern patterR = Pattern.compile(patronOndaR,
                Pattern.CASE_INSENSITIVE);
        Pattern patterS = Pattern.compile(patronOndaS,
                Pattern.CASE_INSENSITIVE);
        Pattern patterT = Pattern.compile(patronOndaT,
                Pattern.CASE_INSENSITIVE);
        
        while(linea != null) {
        	
        	Matcher matcherP = patterP.matcher(linea);
        	Matcher matcherQ = patterQ.matcher(linea);
        	Matcher matcherR = patterR.matcher(linea);
        	Matcher matcherS = patterS.matcher(linea);
        	Matcher matcherT = patterT.matcher(linea);
        	
        	OndaP ondP;
        	OndaQ ondQ;
        	OndaR ondR;
        	OndaS ondS;
        	OndaT ondT;
        	
        	
            if (matcherP.find()) {
            	
            	System.out.println("Onda P -> " + linea);
            	
            	ondP = new OndaP(Integer.parseInt(matcherP.group(1)),Integer.parseInt(matcherP.group(2)),
            							Double.parseDouble(matcherP.group(3)));
            	
            	contOndas++;
            	
            }else if (matcherQ.find()) {
            	
            	System.out.println("Onda Q -> " + linea);
            	
            	ondQ = new OndaQ(Integer.parseInt(matcherQ.group(1)),Integer.parseInt(matcherQ.group(2)),
						Double.parseDouble(matcherQ.group(3)));
            	
            	contOndas++;
            	
            }else if (matcherR.find()) {
            	
            	System.out.println("Onda R -> " + linea);
            	
            	ondR = new OndaR(Integer.parseInt(matcherR.group(1)),Integer.parseInt(matcherR.group(2)),
						Double.parseDouble(matcherR.group(3)));
            	
            	contOndas++;
            	
            }else if (matcherS.find()) {
            	
            	System.out.println("Onda S -> " + linea);
            	
            	ondS = new OndaS(Integer.parseInt(matcherS.group(1)),Integer.parseInt(matcherS.group(2)),
						Double.parseDouble(matcherS.group(3)));
            	
            	contOndas++;
            	
            }else if (matcherT.find()) {
            	
            	System.out.println("Onda T -> " + linea);
            	
            	ondT = new OndaT(Integer.parseInt(matcherT.group(1)),Integer.parseInt(matcherT.group(2)),
						Double.parseDouble(matcherT.group(3)));
            	
            	contOndas++;
            }
            	
            	
            if(contOndas == 5) {
            	
            	//IntervaloPR iPR = new IntervaloPR();
            	//IntervaloQT iQT = new IntervaloQT();
            	//SegmentoTP sTP = new SegmentoTP();
            	
            }else {
            	
            	contOndas = 0;
            }
            	
        	linea = br.readLine();
        }
        	

    }
}
