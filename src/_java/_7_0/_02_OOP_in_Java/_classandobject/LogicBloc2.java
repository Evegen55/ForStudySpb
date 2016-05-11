/**
 * 
 */
package _java._7_0._02_OOP_in_Java._classandobject;

import java.util.Date;

/**
 * @author Lartsev
 *
 */
public class LogicBloc2 {
	
	{
		System.out.println("logic initialisations bloc #1 with id=" + this.id + "\n");
	}
	
	private int id = 7;
	
	{
		System.out.println("logic initialisations bloc #2 with id=" + id + "\n");
		Date d = new Date();
		calc(d);
	}
	
	
	/**
	 * @param id
	 */
	public LogicBloc2(int id) {
		this.id = id;
		System.out.println("constructor has been invoked LAST with id=" + id + "\n");
	}
	
	{
		id = 10;
		System.out.println("logic initialisations bloc #3 with id=" + id + "\n");
		
	}


	private void calc(Date d) {
		System.out.println(d.getTime() + "\n");
		
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LogicBloc2 lgb = new LogicBloc2(3);

	}




	
}
