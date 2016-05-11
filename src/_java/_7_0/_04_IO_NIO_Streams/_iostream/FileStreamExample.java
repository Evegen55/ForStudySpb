/**
 *
 */
package _java._7_0._04_IO_NIO_Streams._iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Lartsev
 *
 */
public class FileStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte[] bytesToWrite = {1, 2, 3};
		byte[] bytesToReaded = new byte[10];
		String fileName = "other/testFileOutput";
		try(FileOutputStream outFile= new FileOutputStream(fileName);
				FileInputStream inFile = new FileInputStream(fileName)
						) {
			System.out.println("File opened to write");
			outFile.write(bytesToWrite);
			System.out.println("bytes have been writed");
			System.out.println("output stream closed as autoclosable");
			System.out.println("=========================");
			System.out.println("File opened to read");
			int bytesAvailable = inFile.available();
			System.out.println("Bytes that ready to read: " + bytesAvailable);
			int count = inFile.read(bytesToReaded, 0, bytesAvailable);
			System.out.println("Bytes that readed: " + count);
			System.out.println("input stream closed as autoclosable");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
