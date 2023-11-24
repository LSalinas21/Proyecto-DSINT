package parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ontology.objetos.Onda;
import ontology.objetos.ondas.*;


public class Parser {

	private static String patronOndaP = "P\\((\\d+),(\\d+),(-{0,1}\\d+(\\.\\d+))?\\)";
	private static String patronOndaQ = "Q\\((\\d+),(\\d+),(-{0,1}\\d+(\\.\\d+))?\\)";
	private static String patronOndaR = "R\\((\\d+),(\\d+),(\\d+(\\.\\d+))?\\)";
	private static String patronOndaS = "S\\((\\d+),(\\d+),(-{0,1}\\d+(\\.\\d+))?\\)";
	private static String patronOndaT = "T\\((\\d+),(\\d+),(-{0,1}\\d+(\\.\\d+))?\\)";
	
	public ArrayList<Onda> parseFile(String fileName) throws IOException {

        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        
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
        
        OndaP ondP;
    	OndaQ ondQ;
    	OndaR ondR;
    	OndaS ondS;
    	OndaT ondT;

    	ArrayList<Onda> listOndas = new ArrayList<Onda>();
        
    	int ciclo = 0;
    	
        while(linea != null) {
        	
        	Matcher matcherP = patterP.matcher(linea);
        	Matcher matcherQ = patterQ.matcher(linea);
        	Matcher matcherR = patterR.matcher(linea);
        	Matcher matcherS = patterS.matcher(linea);
        	Matcher matcherT = patterT.matcher(linea);
        	

            if (matcherP.find()) {

            	ciclo++;
            	ondP = new OndaP(Integer.parseInt(matcherP.group(1)),Integer.parseInt(matcherP.group(2)),
            							Double.parseDouble(matcherP.group(3)),ciclo);
            	
            	listOndas.add(ondP);
            	
            	
            }else if (matcherQ.find()) {
            	

            	
            	ondQ = new OndaQ(Integer.parseInt(matcherQ.group(1)),Integer.parseInt(matcherQ.group(2)),
						Double.parseDouble(matcherQ.group(3)),ciclo);
            	
            	listOndas.add(ondQ);
            	
            }else if (matcherR.find()) {
            	
            	
            	ondR = new OndaR(Integer.parseInt(matcherR.group(1)),Integer.parseInt(matcherR.group(2)),
						Double.parseDouble(matcherR.group(3)),ciclo);
            	
            	listOndas.add(ondR);
            	
            }else if (matcherS.find()) {
            	
            	
            	ondS = new OndaS(Integer.parseInt(matcherS.group(1)),Integer.parseInt(matcherS.group(2)),
						Double.parseDouble(matcherS.group(3)),ciclo);
            	
            	listOndas.add(ondS);
            	
            }else if (matcherT.find()) {
            	

            	
            	ondT = new OndaT(Integer.parseInt(matcherT.group(1)),Integer.parseInt(matcherT.group(2)),
						Double.parseDouble(matcherT.group(3)),ciclo);
            	
            	listOndas.add(ondT);
            }
            
            
            
        	linea = br.readLine();
        }
        fr.close();
        	
        return listOndas;
    }
}
