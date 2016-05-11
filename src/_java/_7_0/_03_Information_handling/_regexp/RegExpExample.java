/**
 * 
 */
package _java._7_0._03_Information_handling._regexp;

import java.util.regex.Pattern;

/**
 * @author Lartsev
 *
 */
public class RegExpExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String pattern01 = "<+";
		String pattern02 = "<?";
		String pattern03 = "<*";
		String str = "<body><h1> a<<<b </h1></body>";
		String[] result;
		Pattern p = Pattern.compile(pattern01);
		result = p.split(str);
		printTokens(result);
		
		p = Pattern.compile(pattern02);
		result = p.split(str);
		printTokens(result);
		
		p = Pattern.compile(pattern03);
		result = p.split(str);
		printTokens(result);
	}

	/**
	 * 
	 * @param result
	 */
	private static void printTokens(String[] result) {
		for (String res : result) {
			if("".equals(res)) {
				System.out.println("\"\"" + "|"); 
			} else {
				System.out.println(res + "|"); 
			}
		}
		System.out.println(); 
	}

}
