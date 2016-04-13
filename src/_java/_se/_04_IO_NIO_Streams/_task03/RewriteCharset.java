/**
 *
 */
package _java._se._04_IO_NIO_Streams._task03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author Lartsev
 *
 */
public class RewriteCharset {

	public void readWrite() {
		String fileName = "other/textInRussian.txt";
		String fileName2 = "other/textInRussian2.txt";
		try(FileInputStream inFile= new FileInputStream(fileName);
				InputStreamReader isr = new InputStreamReader(inFile, "UTF-8");
				FileOutputStream outFile= new FileOutputStream(fileName2);
				OutputStreamWriter osw = new OutputStreamWriter(outFile, "UTF-16");
				){
			while(isr.ready()) {
				osw.write(isr.read());
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
		RewriteCharset rc = new RewriteCharset();
		rc.readWrite();

	}

}
