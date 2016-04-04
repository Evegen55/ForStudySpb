/**
 *
 */
package _java._se._04._task01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

		//working with only byte stream
		try(BufferedInputStream bfi = new BufferedInputStream(
				new FileInputStream(new File(fileName)));
				BufferedOutputStream bfo = new BufferedOutputStream(
						new FileOutputStream(new File(fileNameOut)))) {

			//for adding single character to a word
			StringBuffer sb = new StringBuffer();
			//for count number of key words in the code
			HashMap<String, Integer> mp = new HashMap<>();

			while(bfi.available()>0) {
				int b =  bfi.read();
				char c =(char) b;
				sb.append(c);
				//only letters
				if( b < 65 || (b > 90 & b < 97)) {
					sb.deleteCharAt(sb.length()-1);
					String word = sb.toString();
					for (String str : arr) {
						if (word.compareTo(str) == 0) {
							if(!mp.containsKey(word)) {
								mp.put(word, 1);
							} else {
								mp = addCountToHashMap(mp, word);
							}
						}
					}
					sb = new StringBuffer();
				}
			}

			printMap(mp);

			//working with only byte stream
			for (Map.Entry<String, Integer> entry : mp.entrySet()) {
				String strOut = entry.getKey() + "\t" + entry.getValue() + "\n";
				bfo.write(strOut.getBytes());
			}

		} catch (IOException e) {
		e.printStackTrace();
		}
	}

	//a helper method for add 1 to a value in the map
	private HashMap<String, Integer> addCountToHashMap(HashMap<String, Integer> mp, String word) {
		for (Map.Entry<String, Integer> entry : mp.entrySet()) {
			if (entry.getKey().compareTo(word) == 0) {
				entry.setValue(entry.getValue() + 1);
			}
		}
		return mp;
	}


	//a helper method for print map (for test)
	private void printMap(Map<String, Integer> mp) {
		for (Map.Entry<String, Integer> entry : mp.entrySet()) {
			System.out.print( "key" + "\t" + entry.getKey() + "\t");
			System.out.println( "value" + "\t" + entry.getValue());
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
