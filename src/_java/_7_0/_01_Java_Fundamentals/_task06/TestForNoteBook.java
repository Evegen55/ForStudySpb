/**
 *
 */
package _java._7_0._01_Java_Fundamentals._task06;

/**
 * @author Lartsev
 *
 */
public class TestForNoteBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//create a new array of notes
		Note[] newNoteBook = new Note[100];
		for (int i=0; i<newNoteBook.length; i++) {
			Note note = new Note(Integer.toBinaryString(i) + " " + Integer.toOctalString(i));
			newNoteBook[i] = note;
		}

		//create a new notebook
		Notebook ntb = new Notebook(newNoteBook);
		//view all notes
		ntb.viewAllNotes();

	}

}
