/**
 *
 */
package _java._se._04._task04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;

/**
 * @author Lartsev
 *
 */
public class WorkWithCollectionsOfFilms {
	
	private String fileName;
	private Collection<Actor> actors;
	private Collection<Film> films;
	
	/**
	 * @param fileName
	 */
	public WorkWithCollectionsOfFilms(String fileName) {
		this.fileName = fileName;
		actors = new LinkedList<>();
		films = new LinkedList<>();
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
		return ret;
    }
	
	/**
	 * 
	 * @param numfilms
	 */
	public void createCollectionsOfFilms(int numfilms){
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
	 * @return the actors
	 */
	public Collection<Actor> getActors() {
		return actors;
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
		String fileName = "other/serializedObjects";
		WorkWithCollectionsOfFilms wc = new WorkWithCollectionsOfFilms(fileName);
		System.out.println(wc.checkFile());
		wc.createCollectionsOfFilms(5);
		System.out.println(wc.getFilms());

	}

}
