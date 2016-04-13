/**
 *
 */
package _java._se._02_OOP_in_Java._pattern._creator._nocreator;

import _java._se._02_OOP_in_Java._pattern._creator.Table_creator;

/**
 * @author Lartsev
 *
 */
public class TableInspector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//with NO CREATOR
		Desc desc = new Desc(900,900,200);
		Leg[] legs = {new Leg(40,40,880), new Leg(40,40,880), new Leg(40,40,880), new Leg(40,40,880)};
		Table table = new Table (desc, legs);

		//with CREATOR DESIGN PATTERN
		Table_creator tc = new Table_creator(900,900,50,200,40,4);


	}

}
