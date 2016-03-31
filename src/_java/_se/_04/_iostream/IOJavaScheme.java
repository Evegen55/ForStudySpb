/**
 *
 */
package _java._se._04._iostream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Lartsev
 *
 */
public class IOJavaScheme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//try with resources because FileWriter implements Closable
		try (FileWriter out = new FileWriter("other/text.txt")) {
			BufferedWriter br = new BufferedWriter(out);
			PrintWriter pw = new PrintWriter(br);
			pw.println("I'm a sentence in a text-file.");
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
