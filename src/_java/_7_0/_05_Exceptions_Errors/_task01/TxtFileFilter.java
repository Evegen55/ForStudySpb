package _java._7_0._05_Exceptions_Errors._task01;

import java.io.File;
import java.io.FilenameFilter;

public class TxtFileFilter implements FilenameFilter {

	
	@Override
	public boolean accept(File dir, String name) {
		String extension = "txt";
		return name.endsWith(extension);
	}

}
