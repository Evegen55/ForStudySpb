/**
 * 
 */
package _java._se._03_Information_handling._task03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Lartsev
 *
 */
public class RegExpApplyToAttach {
	
	/** Returns the tokens that match the regex pattern from the document 
	 * text string.
	 * @param pattern A regular expression string specifying the 
	 *   token pattern desired
	 * @return A List of tokens from the document text that match the regex 
	 *   pattern
	 */
	public List<String> getTokens(String pattern, String text)
	{
		ArrayList<String> tokens = new ArrayList<String>();
		Pattern tokSplitter = Pattern.compile(pattern);
		Matcher m = tokSplitter.matcher(text);
		while (m.find()) {
			tokens.add(m.group());
		}
		return tokens;
	}
	
	/**
	 * 
	 * @return
	 * @throws IOException 
	 */
	public String getStringFromText(String fileName) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(fileName));) {
		    String line = br.readLine();
            while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return sb.toString();
	}
	
	/**
	 * 
	 */
	public void printTokens() {
		String pat = "<img.+.jpg" + ".+>";
		String fileName = "other\\Java.SE.03.Information handling_task_attachment.html";
		
		String text = getStringFromText(fileName);
		List<String> lst = getTokens(pat, text);
		
		for(String str : lst) {
			System.out.println(str);
			System.out.println();
		}
		
		System.out.println("Numbers of tokens is:" + "\t" + lst.size());
	}
	
	

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		RegExpApplyToAttach rg = new RegExpApplyToAttach();
		rg.printTokens();

	}

}
