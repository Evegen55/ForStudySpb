/**
 * 
 */
package _java._se._07_Multithreading._waitnotify;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lartsev
 *
 */
public class SharedResource {
	private List<Integer> list;

	public SharedResource() {
		list = new ArrayList<Integer>();
	}
	/**
	 * @param list
	 */
	public SharedResource(List<Integer> list) {
		this.list = list;
	}
	
	public void setElement(Integer element) {
		list.add(element);
	}
	
	public Integer getElement() {
		if (list.size() > 0) {
			return list.remove(0);
		}
		return null;
	}
}
