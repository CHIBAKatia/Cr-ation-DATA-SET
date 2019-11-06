package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import essai.extraction.tweet.Object;

public class Recup {

	public static void main(String[] args) throws IOException {
		
		 
		 //analyser json avec jackson a partir d'un fichier et crer un objet java  
		 
		  File f = new File("D:\\archive\\soutenance\\Lucene\\Collection_reduite\\");//Ids9.txt
		  File f2 = new File("D:\\archive\\soutenance\\Lucene\\Data\\");//gr.txt
	      
		  String line;
		  //int linei;
		  String line1;
		  
		  //creation d'objet java 
		  ObjectMapper objectMapper = new ObjectMapper();
		  objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			
		  
		  
		  
		  // on demande a bufferwriter d'ecrir dans le fichier Col.txt
		  // file writer : ecrire les data dans col.txt
		  //bufferwriter prend en paramettre un filewritter 
		  // il utilise un tompon interne pour stocker les données en lecture et ecriture
		  
		  // fileWriter=new FileWriter(file);
		  //bufferedWriter =new BufferedWriter(fileWriter);
		  
		  //1 creation du bufferwriter et du file ou ecrire les data 
		  FileWriter filewriter = new FileWriter("D:/archive/soutenance/Lucene/collection_reduite2/Col.txt");
		
		
		  BufferedWriter w1 = new BufferedWriter(filewriter);
			
			
			for(File file : f.listFiles())
			     {
				
				   System.out.println(file.getName()); //retourne le nom de l'objet fichier donné
				   BufferedReader reader = new BufferedReader( new FileReader(file));
				   
					while((line = reader.readLine())!=null){ //readline : lit une ligne et renvoie une chaine 
						
						for(File file2 : f2.listFiles())
						{
							
							BufferedReader r = new BufferedReader( new FileReader(file2));
							int i =0;
							
							while((line1 = r.readLine())!=null){
							Object object = objectMapper.readValue(line1, Object.class);
							
							i++;
							 
							String id_str= object.getId_str();
							 
							 if(id_str.equals(line)==true){
								// System.out.println("**************************************************************************");
								// System.out.println(line1);
									
								
								w1.write(line1);
								w1.newLine();
								 
							 }
							

							}
							 
						}
						
					}
								
					}
			 
			w1.close();	
	}
	

}
