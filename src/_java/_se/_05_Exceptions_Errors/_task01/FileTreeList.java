/**
 *
 */
package _java._se._05_Exceptions_Errors._task01;

import java.io.File;

/**
 * @author Lartsev
 *
 */
public class FileTreeList {

	/**
	 *
	 * @return
	 */
	public String[] getListUnderRootDisk() {
		File path  = new File("/");
	    return path.list();
	}

	/**
	 *
	 * @return
	 */
	public String[] getListUnderRootProject() {
		File path  = new File(".");
	    return path.list();
	}

	/**
	 *
	 * @param pathname
	 * @param patternOfExtension
	 * @return
	 */
	public String[] getListUnderPathWithFilter(String pathname, String patternOfExtension) {
		File path  = new File(pathname);
		String[] arr = path.list(new DirAndFileFilter(patternOfExtension));
		if (arr == null) {
			System.out.println("\t" + "there are no results");
		} else if (arr.length == 0) {
			System.out.println("\t" + "there are no files");
		}
		return arr;
	}

	/**
	 *
	 * @param pathname
	 * @return
	 */
	public String[] getListAllFilesUnderPath(String pathname) {
		File path  = new File(pathname);
		String[] arr = path.list();
		if (arr == null) {
			System.out.println("\t" + "there are no results");
		}
		return arr;

	}
	/**
	 *
	 * @param pathname
	 * @return
	 */
	public String[] getListTextFileUnderPath(String pathname) {
		File path  = new File(pathname);
		String[] arr = path.list(new  TxtFileFilter());
		if (arr == null) {
			System.out.println("\t" + "there are no results");
		}
		return arr;
	}

	/**
	 *
	 * @param str
	 */
	public void printList(String[] str) {
		if (str != null) {
			System.out.println("\t" + "\t" + "list of files");
			System.out.println("\t" + "\t" + "under catalog");
			for (String s : str) {
				System.out.println(s);
			}
		} else {
			System.out.println("\t" + "list does not exist");
		}
		System.out.println("=======================");
	}

}
