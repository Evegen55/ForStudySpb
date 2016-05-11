/**
 * 
 */
package _java._7_0._05_Exceptions_Errors._task01;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

/**
 * @author Lartsev
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileTreeList ftl = new FileTreeList();

		String[] str = ftl.getListUnderRootDisk();
		ftl.printList(str);

		String[] str1 = ftl.getListUnderRootProject();
		ftl.printList(str1);

		String[] str2 = ftl.getListUnderPathWithFilter("dghdf", ".*\\.java$");
		ftl.printList(str2);

		String[] str3 = ftl.getListTextFileUnderPath("other");
		ftl.printList(str3);

		String[] str4 = ftl.getListUnderPathWithFilter("src/_java/_se/_04/_iostream/", "fgfdh");
		ftl.printList(str4);

		String[] str5 = ftl.getListUnderPathWithFilter("src/_java/_se/_04/_iostream/", ".*\\.java$");
		ftl.printList(str5);

		String[] str6 = ftl.getListTextFileUnderPath("othenbvnbr");
		ftl.printList(str6);

		WorkWithTextFile wtf = new WorkWithTextFile();
		wtf.createTextFile("blablabla"+ FileSystems.getDefault().getSeparator(), "adsfas");
		wtf.createTextFile("other"+ FileSystems.getDefault().getSeparator(), "adsfas");
		//wtf.deleteTextFile("other\\", "adsfas");
		wtf.deleteTextFile("blablabla"+ FileSystems.getDefault().getSeparator(), "adsfas");
		wtf.changeTextfile("other"+ FileSystems.getDefault().getSeparator(), "adsfas", "content2");
		wtf.changeTextfile("other"+ FileSystems.getDefault().getSeparator(), "adsfas", "content3");
		wtf.changeTextfile("blablabla"+ FileSystems.getDefault().getSeparator(), "adsfas", "content3");

	}

}
