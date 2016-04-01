/**
 * 
 */
package _java._se._04._task01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Lartsev
 *
 */
public class JavaReaderAsByteStream {

	private String[] arr = {"abstract","continue","for","new","switch",
			"assert","default","goto","package","synchronized",
			"boolean","do","if","private","this",
			"break","double","implements","protected","throw",
			"byte","else","import","public","throws",
			"case","enum","instanceof","return","transient",
			"catch","extends","int","short","try",
			"char","final","interface","static","void",
			"class","finally","long","strictfp","volatile",
			"const","float","native","super","while"};
	
	/**
	 * 
	 */
	public void readFromFile() {
		String fileName = "other/ForJavaReader.txt";
		String fileNameOut = "other/ForJavaReaderOut.txt";
		try(BufferedInputStream bfi = new BufferedInputStream(
				new FileInputStream(new File(fileName)));
				BufferedOutputStream bfo = new BufferedOutputStream(
						new FileOutputStream(new File(fileNameOut)))) {
			StringBuffer sb = new StringBuffer();
			while(bfi.available()>0) {
				int b =  bfi.read();
				char c =(char) b;
				//System.out.print(c);
				//bfo.write(b);
				
				sb.append(c);
				if(b == 32) {
					String word = sb.toString();
					//System.out.print(word);
					for (String str : arr) {
						if (word.equalsIgnoreCase(str)) {
							System.out.print(word);
						}
					}
					break;
				}
				
				
				
			}
				
				
				
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JavaReaderAsByteStream jr = new JavaReaderAsByteStream();
		jr.readFromFile();

	}

}
