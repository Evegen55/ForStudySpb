/**
 *
 */
package _java._se._04_IO_NIO_Streams._task04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.LinkedList;

/**
 * @author Lartsev
 *
 */
public class WorkWithCollectionsOfFilms {

	private String fileName;
	private Collection<Film> films;
	private Collection<Film> filmsFromFile;


	/**
	 *
	 */
	public WorkWithCollectionsOfFilms() {
		fileName = "other/serializedObjects";
		if(checkFile()) {
			films = new LinkedList<>();
		    filmsFromFile = new LinkedList<>();
		} else {
			films = readCollectionFromAFile();
			filmsFromFile = new LinkedList<>();
		}


	}

	/**
	 * @param fileName
	 */
	public WorkWithCollectionsOfFilms(String fileName) {
		this.fileName = fileName;
		films = new LinkedList<>();
	    filmsFromFile = new LinkedList<>();
	}

	/**
	 *
	 *@return true if file is not yet exist or
	 * already exist and empty.
	 * If file is not yet exist - then creates file.
	 *
	 */
	public boolean checkFile(){
		boolean ret = false;
		File f = new File(fileName);
		if (!f.isFile()) {
			try {
				f.createNewFile();
				ret = true;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try(BufferedReader br = new BufferedReader(new FileReader(f));) {
				if (br.readLine() == null) {
					System.out.println("No errors, and file empty");
				    ret = true;
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("No errors, file exist and is not empty");
		return ret;
    }

	/**
	 *
	 * @param numfilms
	 */
	public void createCollectionsOfFilms(int numfilms){
		Collection<Actor> actors = new LinkedList<>();
		//set that number of actors is more than number of films
		int numactors = numfilms + 2;
		//create collections of films
		for (int i = 0; i < numfilms; i++) {
			//create collections of actors
			for (int a = 0; a < numactors; a++) {
				Actor actor = new Actor("act " + a);
				if (!actors.contains(actor)) {
					actors.add(actor);
				}

			}
			Film film = new Film(actors, "film" + i);
			films.add(film);
		}
	}

	/**
	 * This method checks that file is already exist and empty.
	 * Then serialized collection of films
	 */
	public void saveCollectionToAFile(){
		if(checkFile()) {
			try(FileOutputStream outFile= new FileOutputStream(fileName);
					ObjectOutputStream oos = new ObjectOutputStream(outFile);
					){
				oos.writeObject(films);

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * This method checks that file is already exist and empty.
	 * Then serialized collection of films
	 */
	public void saveCollectionToAFile(Collection<Film> cf){

			try(FileOutputStream outFile= new FileOutputStream(fileName);
					ObjectOutputStream oos = new ObjectOutputStream(outFile);
					){
				oos.writeObject(cf);

			} catch (IOException e) {
				e.printStackTrace();
			}

	}

	/**
	 * read collections from a file. Use it as getter method instead getFilmsFromFile()
	 */
	public Collection<Film> readCollectionFromAFile(){
		try(FileInputStream inFile = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(inFile)) {
			filmsFromFile = (Collection<Film>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return filmsFromFile;
	}

	/**
	 * @return the films
	 */
	public Collection<Film> getFilms() {
		return films;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//general test
		String fileName = "other/serializedObjects";
		WorkWithCollectionsOfFilms wc = new WorkWithCollectionsOfFilms(fileName);
		System.out.println(wc.checkFile());
		wc.createCollectionsOfFilms(5);
		System.out.println(wc.getFilms());
		wc.saveCollectionToAFile();
		System.out.println("==========================");
		System.out.println(wc.readCollectionFromAFile());

		//test:
		//when app start -> then read a file
		//modify collections of films
		//save it to a file
		WorkWithCollectionsOfFilms wcNew = new WorkWithCollectionsOfFilms();
		System.out.println("==========================");
		Collection<Film> cf= wcNew.getFilms();
		System.out.println(cf);
		cf.add(new Film(new LinkedList<Actor>(), "LAST ADDED FILM"));
		wcNew.saveCollectionToAFile(cf);
		System.out.println(wcNew.readCollectionFromAFile());


	}

}
