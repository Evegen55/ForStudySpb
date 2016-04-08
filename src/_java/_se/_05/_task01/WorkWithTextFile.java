/**
 *
 */
package _java._se._05._task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

/**
 * @author Lartsev
 *
 */
public class WorkWithTextFile {

	private final String fileExtension = ".txt";

	/**
	 *
	 * @param pathName
	 * @param Filename
	 */
	public void createTextFile(String pathName, String Filename){
		//create an abstract absolutely path on the file:
		File f = new File(pathName, Filename+fileExtension);
		//checking if a pathName is exist
		if (f.getParentFile().isDirectory()) {
			isFileCreatedAndEmpty(f);
		} else {
			System.out.println("ERROR, the folder"+
					"\t" + f.getParentFile().getAbsolutePath() +
					"\t" +" does not exist");
		}


	}

	/**
	 * @param f
	 */
	private boolean isFileCreatedAndEmpty(File f) {
		boolean ret = false;
		try {
			if(f.createNewFile()) {
				System.out.println("No errors, file has been created and empty");
				System.out.println("in the path:" + "\t" + f.getAbsolutePath());
				ret = true;
			} else {
				System.out.println("No errors," +"\n" + "file already exist in the filesystem");
				//check file for empty
				ret = isEmpty(f, ret);
			}
		} catch (IOException e) {
			System.out.println("smth went wrong when Java tryed created file...");
			e.printStackTrace();
		}
		return ret;
	}

	/**
	 * @param f
	 * @param ret
	 * @return
	 */
	private boolean isEmpty(File f, boolean ret) {
		try(BufferedReader br = new BufferedReader(new FileReader(f));) {
			String line = br.readLine();
			if (line == null) {
				System.out.println("and is empty");
				ret = true;
			} else {
				System.out.println("and is NOT empty");
			}
		} catch (FileNotFoundException e) {
			System.out.println("file has been deleted...");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("smth went wrong inside else loop...");
			e.printStackTrace();
		}
		return ret;
	}

	/**
	 *
	 * @param pathName
	 * @param Filename
	 */
	public void deleteTextFile(String pathName, String Filename) {
		//create an abstract absolutely path on the file:
		File f = new File(pathName, Filename+fileExtension);
		//checking if a file is exist
		if (f.isFile()) {
			f.delete();
		} else {
			System.out.println("ERROR, the file "+
					"\t" + f.getAbsolutePath() +
					"\t" +" does not exist");
		}
	}

	/**
	 * This method add content to a file
	 * 
	 * @param pathName
	 * @param Filename
	 * @param content
	 */
	public void changeTextfile(String pathName, String Filename, String content){
		File f = new File(pathName, Filename+fileExtension);
		if (f.isFile()) {
			try {
				//USE java.nio API
				byte[] lst = Files.readAllBytes(f.toPath());
				byte[] lst1 = content.getBytes();
				byte[] result = Arrays.copyOf(lst, lst.length + lst1.length);
				System.arraycopy(lst1, 0, result, lst.length, lst1.length);
				Files.write(f.toPath(), result);
			} catch (IOException e) {
				System.out.println("smth went wrong when Java tries to write inside a file ");
				e.printStackTrace();
			}
		} else {
			System.out.println("ERROR, the file "+
					"\t" + f.getAbsolutePath() +
					"\t" +" does not exist");
		}
	}


}
