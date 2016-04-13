/**
 * 
 */
package _java._se._02_OOP_in_Java._generics;

/**
 * @author Lartsev
 *
 */
public class MarkInspector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Mark<String> ms = new Mark<String>("7"); - compile error
		Mark<Double> md = new Mark<Double>(71.5D);
		System.out.println(md.sameAny(md) + "\n");
		Mark<Integer> mi = new Mark<Integer>(71);
		System.out.println(md.sameAny(mi) + "\n");
		//md.same(mi); - compile error
		System.out.println(md.roundMark() + "\n");
	}

}
