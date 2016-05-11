package _java._7_0._02_OOP_in_Java._pattern._creator;

import _java._7_0._02_OOP_in_Java._pattern._creator._nocreator.Desc;
import _java._7_0._02_OOP_in_Java._pattern._creator._nocreator.Leg;

public class Table_creator {


	private Desc desc;
	private Leg[] legs;


	/**
	 *
	 * @param width
	 * @param length
	 * @param descHeight
	 * @param height
	 * @param legSection
	 * @param legNumbers
	 */
	public Table_creator(int width, int length, int descHeight, int height, int legSection, int legNumbers) {
		desc = new Desc(width, length, descHeight);
		for (int i=0; i<legNumbers; i++ ) {
			legs[i] = new Leg(legSection, legSection, height-descHeight);
		}
	}



}
