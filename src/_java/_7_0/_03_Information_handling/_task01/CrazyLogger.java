/**
 *
 */
package _java._7_0._03_Information_handling._task01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import _java._7_0._03_Information_handling._task03.RegExpApplyToAttach;

/**
 * @author Lartsev
 *
 */
public class CrazyLogger {
	private StringBuilder sb;
	private RegExpApplyToAttach rg;

	/**
	 * @param sb
	 */
	public CrazyLogger() {
		sb = new StringBuilder();
		rg = new RegExpApplyToAttach();
	}

	/**
	 * This method creates a single logger's string
	 * @param text that will be logged in the single string
	 * @return
	 */
	protected String createLogString(String text) {

		Date today = new Date();
		SimpleDateFormat formatter1 = new SimpleDateFormat("dd.MM.yyyy");
		String result1 = formatter1.format(today);

		SimpleDateFormat formatter2 = new SimpleDateFormat("hh.mm");
		String result2 = formatter2.format(today);
		String logstr = result1 + ":" + result2 + "-" + text;

		return logstr;
	}

	/**
	 * This method creates a single logged string and attach it to a buffer
	 * @param event
	 */
	public void logging(String event){
		String logStr = createLogString(event);
		sb.append(logStr);
		sb.append(System.lineSeparator());
	}



	/**
	 * @return the text from buffer formatted as log
	 */
	public String getLoggedString() {
		return sb.toString();
	}

	/**
	 *
	 * @param pattern
	 * @return
	 */
	public List<String> findByPattern(String pattern) {
		return rg.getTokens(pattern, getLoggedString());
	}

	/**
	 * test case
	 */
	public void testCase(){
		//create a new logger
		String fileName = "other\\Java.SE.03.Information handling_task_attachment.html";
		String text = rg.getStringFromText(fileName);
		String patFoImg = "<img.+.jpg" + ".+>";
		List<String> lst = rg.getTokens(patFoImg, text);
		for (String event : lst) {
			logging(event);
		}
		System.out.println(getLoggedString());
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CrazyLogger cl = new CrazyLogger();
		cl.testCase();
		Locale loc = Locale.getDefault();
		System.out.println(loc.getDisplayName());
	}

}
