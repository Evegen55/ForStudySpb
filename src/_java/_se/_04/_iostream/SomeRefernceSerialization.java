/**
 * 
 */
package _java._se._04._iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Lartsev
 *
 */
public class SomeRefernceSerialization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point p1 = new Point(1.0, 1.0);
		Point p2 = new Point(2.0, 2.0);
		Point p3 = new Point(3.0, 3.0);
		
		Line line1 = new Line(p1,p2,1);
		Line line2 = new Line(p2,p3,2);
		
		System.out.println("line1 = " + line1);
		System.out.println("line2 = " + line2);
		
		String fileName = "other/testFileOutput";
		try(FileOutputStream outFile= new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(outFile);
				FileInputStream inFile = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(inFile)) {
			
			oos.writeObject(line1);
			//if you want to say that process of serialize is over and you want to rewrite object
			//you need to invoke method
			//oos.reset(); 
			//TRY IT!!
			line1.setIndex(3);
			oos.writeObject(line1);
			
			System.out.println("read objects ");
			while(inFile.available()>0) {
				Line line = (Line) ois.readObject();
				line.printInfo();
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
