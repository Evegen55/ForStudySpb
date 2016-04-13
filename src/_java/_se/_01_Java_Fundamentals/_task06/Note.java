package _java._se._01_Java_Fundamentals._task06;

public class Note {

	private String noteBody;

	/**
	 *
	 * @return body of note
	 */
	public String getNoteBody() {
		return noteBody;
	}

	/**
	 *
	 * @param noteBody
	 */
	public void setNoteBody(String noteBody) {
		this.noteBody = noteBody;
	}

	/**
	 *
	 * @param noteBody
	 */
	public Note(String noteBody) {
		super();
		this.noteBody = noteBody;
	}

}
