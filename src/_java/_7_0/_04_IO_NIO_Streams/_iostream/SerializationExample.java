/**
 *
 */
package _java._7_0._04_IO_NIO_Streams._iostream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Lartsev
 *
 */
public class SerializationExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName = "other/testFileOutputSerialize";
		try(ByteArrayOutputStream os = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				FileOutputStream outFile= new FileOutputStream(fileName)
						){
			//serialize objects
			Object objSave = new Integer(1);
			oos.writeObject(objSave);

			//see what was saved
			byte[] arr = os.toByteArray();
			for (byte b : arr) {
				System.out.println((char) b);
			}

			//save to file
			outFile.write(arr);

			//deserialize
			try (ByteArrayInputStream is = new ByteArrayInputStream(arr);
					ObjectInputStream ois = new ObjectInputStream(is)
							) {
				Object objRead = ois.readObject();
				//check objects for equality
			System.out.println("check objects for equality" + "\t" + objSave.equals(objRead));

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
