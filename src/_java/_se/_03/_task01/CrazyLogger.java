/**
 * 
 */
package _java._se._03._task01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import _java._se._03._task03.RegExpApplyToAttach;

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
	 * 
	 * @param text
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
	 * 
	 * @param event
	 */
	public void logging(String event){
		String logStr = createLogString(event);
		sb.append(logStr);
		sb.append(System.lineSeparator());
	}
	
	

	/**
	 * @return the text formatted as log
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
	 * 
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
