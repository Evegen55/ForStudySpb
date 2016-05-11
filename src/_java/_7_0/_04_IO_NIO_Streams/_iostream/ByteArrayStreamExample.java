/**
 * 
 */
package _java._7_0._04_IO_NIO_Streams._iostream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @author Lartsev
 *
 */
public class ByteArrayStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		{
			byte[] bytes = {1, -1, 0};
		    ByteArrayInputStream in = new ByteArrayInputStream(bytes);
		    int readedInt = in.read();
		    System.out.println("first element read is:" + readedInt);
		    readedInt = (byte) in.read();//readedInt = in.read(); //if don't cast to a byte then it will be 255
		    System.out.println("second element read is:" + readedInt);
		    readedInt = in.read();
		    System.out.println("third element read is:" + readedInt);
		}
		System.out.println();
		{
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			out.write(10);
			out.write(11);
			byte[] bytes = out.toByteArray();
			ByteArrayInputStream in = new ByteArrayInputStream(bytes);
		    int readedInt = in.read();
		    System.out.println("first element read is:" + readedInt);
		    readedInt = in.read();
		    System.out.println("second element read is:" + readedInt);
		}
		

	}

}
