/**
 *
 */
package _java._se._05._task01;

/**
 * @author Lartsev
 *
 */
public class WorkWithTextFile {

	public void createTextFile(){}

	public void deleteTextFile() {}

	public void changeTextfile(){}

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

	}

}
