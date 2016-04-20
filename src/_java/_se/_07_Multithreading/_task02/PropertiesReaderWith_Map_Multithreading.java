/**
 *
 */
package _java._se._07_Multithreading._task02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Lartsev
 *
 */
public class PropertiesReaderWith_Map_Multithreading implements Runnable {

	private String fileName;
	private final String fileExtension = ".properties";

	/**
	 * @param fileName
	 */
	private PropertiesReaderWith_Map_Multithreading(String fileName) {
		this.fileName = fileName + fileExtension;
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
	 * 
	 * @return
	 */
	public HashMap<String , String> createPropetiesMap(){
		
		File f = new File(this.fileName);
		
		HashMap<String , String> map = new  HashMap<> ();
		
		try(BufferedReader br = new BufferedReader(new FileReader(f));) {
			
			while(br.ready()) {
				String line = br.readLine();
				if (isKeyInFile(line)) {
					String[] lines = line.split("=");
					System.out.println("*****" + "\t" + this.toString());
					map.put(lines[0].trim(), lines[1].trim());
				}
			}
			
			} catch (FileNotFoundException e) {
				System.out.println("File not found. check out file");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("smth went wrong when Java tryed read from buffer...");
				e.printStackTrace();
			}
		return map;
	}
	
	/**
	 *
	 * @param parentMap
	 */
	public void printMap(HashMap<String,String> parentMap){
		for (Map.Entry<String,String> entry : parentMap.entrySet()) {
			System.out.println( "key" + "\t" + entry.getKey() + 
					"\t" + "value" + "\t" + entry.getValue() 
					//+ 
					//"\n" + "thread" + "\t" + this.toString()
					);
		}
	}


	@Override
	public void run() {
		printMap(createPropetiesMap());
		
	}
	
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		//String fileName = "other/for_properties/QuestionBundle_en_US";
		//PropertiesReaderWith_Map_Multithreading pr1 = new PropertiesReaderWith_Map_Multithreading(fileName);
		//PropertiesReaderWith_Map_Multithreading pr2 = new PropertiesReaderWith_Map_Multithreading(fileName);
		//printMap(pr1.createPropetiesMap());
		//printMap(pr2.createPropetiesMap());
		
		String fileName = "other/for_properties/QuestionBundle_en_US";
		PropertiesReaderWith_Map_Multithreading pr1 = new PropertiesReaderWith_Map_Multithreading(fileName);
		PropertiesReaderWith_Map_Multithreading pr2 = new PropertiesReaderWith_Map_Multithreading(fileName);
		
		Thread th1 = new Thread(pr1);
		Thread th2 = new Thread(pr2);
		
		th1.start();
		th2.start();
		
		th1.join();
		th2.join();
	}

}
