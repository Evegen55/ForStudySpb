/**
 * 
 */
package _java._se._05._task02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Lartsev
 *
 */
public class PropertiesReader {
	
	private String fileName;

	/**
	 * @param fileName
	 */
	public PropertiesReader(String fileName) {
		this.fileName = fileName;
	}
	
	/**
	 * 
	 * @param fileName
	 * @return true if file already exist (created) and empty.
	 * If file is not yet exist - then creates file.
	 */
	public boolean checkFile(String fileName){
		boolean ret = false;
		File f = new File(fileName);
		
		try {
			if(f.createNewFile()) {
				System.out.println("No errors, file has been created and empty");
				ret = true;
			} else {
				System.out.println("No errors, file already exist in the filesystem");
				//check file for empty
				try(BufferedReader br = new BufferedReader(new FileReader(f));) {
					if (br.readLine() == null) {
						System.out.println("and is empty");
					    ret = true;
					} else {
						System.out.println("and file is NOT empty");
					}
				} catch (FileNotFoundException e) {
					System.out.println("file has been deleted...");
					e.printStackTrace();
				} catch (IOException e) {
					System.out.println("smth went wrong inside else loop...");
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			System.out.println("smth went wrong when Java tryed created file...");
			e.printStackTrace();
		}
		
		return ret;
   }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName = "other/for_exceptions/serializedObjects";
		PropertiesReader pr = new PropertiesReader(fileName);
		System.out.println(pr.checkFile(fileName));
	}
}
