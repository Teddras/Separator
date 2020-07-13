package modele;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;


public class Separateur {
	ArrayList<String> source;
	ArrayList<String> garde;
	ArrayList<String> reste;
	
	public Separateur() {
		this.source = new ArrayList<String>();
		this.garde = new ArrayList<String>();
		this.reste = new ArrayList<String>();
	}
	
	public void charger(String path) {
		try{
		InputStream flux=new FileInputStream(path); 
		InputStreamReader lecture=new InputStreamReader(flux);
		BufferedReader buff=new BufferedReader(lecture);
		String ligne;
		while ((ligne=buff.readLine())!=null){
			source.add(ligne);
		}
		buff.close(); 
		}		
		catch (Exception e){
		System.out.println(e.toString());
		}
	}
	
	public void nbrLigne() {
		String mes = "nombre de lignes : " + source.size();
		System.out.println(mes);
	}
	
	public void trier(String critere, int debut,int fin,boolean garder) {
		int i = Math.max(0,debut);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
		while (i<Math.min(this.source.size(),fin)){
			if (garder) {
				if (source.get(i).contains(critere)){
					this.garde.add(source.get(i));
				}
				else {
					this.reste.add(source.get(i));
				}
			}
			if (!garder) {
				if (source.get(i).contains(critere)){
					this.garde.add(source.get(i));
				}
				else {
					this.reste.add(source.get(i));
				}
			i++;
			}
		}
	}
//	public void exportGood(String garder) {
//		try{
//			String test = "ABCD";
//			File outPath = new File(garder);
//			outPath.write(test);
//		}
//		catch (Exception e) {
//			System.out.println(e.toString());
//		}
//	}
}
	

