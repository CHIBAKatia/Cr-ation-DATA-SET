package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ids {
	
	
	
	// 1 je prends les jujements de pertinence de 5 requettes
	// 2 je recupére les ids des tweets auquels ces dernieres repondent
	// 3 je recupere tous les tweets qui correspende à ces ids

	
	//recuperer les ids de mes 5 requettes sur le fichier des jujements de pertinence
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("D:\\archive\\soutenance\\Lucene\\collection_reduite\\Qrels.txt"));
		//Qrels.txt : contient les jujement de pertinences de mes 5 requetes choisit
		
		String line,topic,topic2;
		 
		BufferedWriter w = new BufferedWriter(new FileWriter("D:/archive/soutenance/Lucene/collection_reduite1/ids9.txt"));
		
		
		
		int i=0;
		while((line = reader.readLine())!=null){
			
			
			
			if((line.contains("20 0 "))  ){
					
				w.write(line.replace("20 0 ", " ").replace(" 0", " ").replace(" 1", " ").trim());
				w.newLine();
				continue;
				
			}
		if(line.contains("21 0 ")){
				topic = line.replace("21 0", "").replace(" 0", "").replace(" 1", " ").replace(" 2", " ").trim();
				w.write(topic);				
				w.newLine();
				continue;
			}
			
			if(line.contains("22 0 ")){
				w.write( line.replace("22 0", "").replace(" 0", "").replace(" 1", " ").replace(" 2", " ").trim());
				w.newLine();
				continue;
				
			}
			if(line.contains("23 0 ")){
				w.write (line.replace("23 0 ", "").replace(" 0", "").replace(" 1", " ").trim());
				w.newLine();
				continue;
				
			}
			if(line.contains("24 0 ")){
				w.write (line.replace("24 0 ", "").replace(" 0", "").replace(" 1", " ").trim());
				w.newLine();
				continue;
			}
			
			}
			w.newLine();
			w.close();
}
		
	}

