/**
 *
 */
package _java._se._06._task02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Lartsev
 *
 */
public class PropertiesReaderWithMap {

	private String fileName;
	private final String fileExtension = ".properties";

	/**
	 * @param fileName
	 */
	public PropertiesReaderWithMap(String fileName) {
		this.fileName = fileName + fileExtension;
	}

	/**
	 * @return true if file already exist (created) and empty.
	 * If file is not yet exist - then creates file.
	 */
	private boolean isFileAlreadyExistAndEmpty(){
		boolean ret = false;
		File f = new File(this.fileName);

		try {
			if(f.createNewFile()) {
				System.out.println("No errors, file has been created and empty");
				ret = true;
			} else {
				System.out.println("No errors," +"\n" + "file already exist in the filesystem");
				//check file for empty
				try(BufferedReader br = new BufferedReader(new FileReader(f));) {
					String line = br.readLine();
					if (line == null) {
						System.out.println("and is empty");
					    ret = true;
					} else {
						System.out.println("and is NOT empty");
						if (isKeyInFile(line)) {
							System.out.println("and key exist in the first line");
						} else {
							System.out.println("and key is NOT exist in the first line");
						}
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
	 * 
	 * @param line 
	 * @return true if key exist in the *.properties file
	 */
	private boolean isKeyInFile(String line) {
		boolean ret = false;
		String eq = "=";
		if (line.contains(eq) && line.indexOf(eq)>0) {
			char c = line.charAt(0);
			//only letters
			if( (c > 64 && c < 91) || (c > 996 & c < 123)) {
				ret = true;
			}
		}
		return ret;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName = "other/for_exceptions/serializedObjects";
		PropertiesReaderWithMap pr = new PropertiesReaderWithMap(fileName);
		System.out.println(pr.isFileAlreadyExistAndEmpty());
	}
}
