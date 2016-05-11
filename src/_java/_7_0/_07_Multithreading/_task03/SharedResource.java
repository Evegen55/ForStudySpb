/**
 * 
 */
package _java._7_0._07_Multithreading._task03;

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

	public void setElement(Integer element) {
		list.add(element);
	}

	public Integer getELement() {
		if (list.size() > 0) {
			return list.remove(0);
		} 
		return null;
	}

}
