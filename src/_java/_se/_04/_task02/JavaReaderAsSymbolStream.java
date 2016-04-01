/**
 * 
 */
package _java._se._04._task02;

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
public class JavaReaderAsSymbolStream {

	/**
	 * 
	 *@return true if file is not yet exist or 
	 * already exist and empty. 
	 * If file is not yet exist - then creates file.
	 * 
	 */
	public boolean checkFile(String fileName){
		boolean ret = false;
		File f = new File(fileName);
		if (!f.isFile()) {
			try {
				f.createNewFile();
				ret = true;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try(BufferedReader br = new BufferedReader(new FileReader(f));) {
				if (br.readLine() == null) {
					System.out.println("No errors, and file empty");
				    ret = true;
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		System.out.println("No errors, file exist and is not empty");
		return ret;
    }
	
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
		JavaReaderAsSymbolStream jr = new JavaReaderAsSymbolStream();
		jr.readFromFile();

	}

}
