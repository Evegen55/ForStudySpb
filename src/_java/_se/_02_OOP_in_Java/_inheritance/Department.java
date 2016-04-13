/**
 * 
 */
package _java._se._02_OOP_in_Java._inheritance;

import java.util.Date;

/**
 * @author Lartsev
 *
 */
public class Department implements Cloneable {
	
	private Integer name;
	private Date date = new Date();
	
	/**
	 * @return
	 * @throws CloneNotSupportedException 
	 * @see java.util.Date#clone()
	 */
	public Object clone() throws CloneNotSupportedException {
		Department obj = null;
		obj = (Department) super.clone();
		
		if (null != this.date) {
			obj.date = (Date) this.date.clone();
		}
		
		return obj;
	}
	
	

}
