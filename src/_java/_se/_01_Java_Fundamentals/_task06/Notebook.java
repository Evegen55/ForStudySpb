package _java._se._01_Java_Fundamentals._task06;

public class Notebook {

	private Note[] notebookPage;

	/**
	 *
	 * @param notebookPage
	 */
	public Notebook(Note[] notebookPage) {
		super();
		this.notebookPage = notebookPage;
	}

	/**
	 *
	 * This method checking notebook for empty
	 * @return
	 */
	private boolean isNotebookBodyisNotEmpty() {
		boolean check = true;
		if (notebookPage == null) {
			System.out.println("You should take your notebook in your hand before making a note!");
			check = false;
		} else if (notebookPage.length == 0) {
			System.out.println("Your notebook with no pages");
			check = false;
		}
		return check;
	}

	/**
	 * This method add note in the first not-empty cell of array
	 * @param note
	 */
	public void addNote(Note note){
		if (isNotebookBodyisNotEmpty()) {
			for (int i=0; i<notebookPage.length; i++) {
				if (notebookPage[i] != null) {
					notebookPage[i] = note;
					break;
				}
			}
		}
	}

	/**
	 * this method simply set null at the specified index (erase note)
	 * @param index
	 */
	public void removeNote(int index) {
		if ((index>0 && index<notebookPage.length) && isNotebookBodyisNotEmpty()) {
			notebookPage[index] = null;
		}
	}

	/**
	 * this method change note at the specified index
	 * @param index
	 * @param newNote
	 */
	public void changeNote(int index, Note newNote) {
		if ((index>0 && index<notebookPage.length) && isNotebookBodyisNotEmpty()) {
			notebookPage[index] = newNote;
		}
	}

	/**
	 * print all of notes in the notebook
	 */
	public void viewAllNotes() {
		if (isNotebookBodyisNotEmpty()) {
			for (Note note : notebookPage) {
				System.out.println("note " + note.getNoteBody());
			}
		}
	}









}
