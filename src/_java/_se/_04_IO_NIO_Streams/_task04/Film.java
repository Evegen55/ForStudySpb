/**
 * 
 */
package _java._se._04_IO_NIO_Streams._task04;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Lartsev
 *
 */
public class Film  implements Serializable {
	private Collection<Actor> actors;
	private String name;

	/**
	 * @param actors
	 */
	public Film(Collection<Actor> actors, String name) {
		this.actors = actors;
		this.name = name;
	}
	
	

	/**
	 * @return the actors
	 */
	public Collection<Actor> getActors() {
		return actors;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Film [actors=" + actors + ", name=" + name + "]" + "\n";
	}

	
	

}
