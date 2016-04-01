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
			while(bfi.available()>0) {
				int b = bfi.read();
				System.out.print( (char) b);
				bfo.write(b);
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