package _java._7_0._05_Exceptions_Errors._task01;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class DirAndFileFilter implements FilenameFilter {

	private Pattern pattern;
		
	/**
	 * @param pattern
	 */
	public DirAndFileFilter(String regex) {
		pattern = Pattern.compile(regex);
	}


	@Override
	public boolean accept(File dir, String name) {
		return pattern.matcher(name).matches();
	}

}
