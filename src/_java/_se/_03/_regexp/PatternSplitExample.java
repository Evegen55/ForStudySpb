/**
 * 
 */
package _java._se._03._regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Lartsev
 *
 */
public class PatternSplitExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pattern p = Pattern.compile("J(\\w*)", Pattern.CASE_INSENSITIVE);
		String text = "Java is fun; JavaScript is funny.; JFunny ; just";
		Matcher m = p.matcher(text);
		while(m.find()) {
			System.out.println("Found '" + m.group(0) + "' at position " + m.start(0) + "-" + m.end(0));
			if (m.start(0) < m.end(0)) {
				System.out.println("Suffix is: " + m.group(1));
			}
		}

	}

}
