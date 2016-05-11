/**
 *
 */
package _java._7_0._02_OOP_in_Java._task05;

/**
 * @author Lartsev
 *
 */
public enum Subjects {
	COMPUTER_SCIENCE,
	ASTRONOMY,
	MATHEMATICS,
	PHYSICS,
	ENGLISH,
	BIOLOGIC;

	public boolean isNaturalGrade() {
		switch(this) {
		case COMPUTER_SCIENCE:
		case MATHEMATICS:
		case PHYSICS:
					return true;
		case ASTRONOMY:
		case ENGLISH:
		case BIOLOGIC:
					return false;
		default:
			return false;
		}
	}
}
