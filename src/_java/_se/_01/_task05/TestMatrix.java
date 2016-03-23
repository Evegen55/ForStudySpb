/**
 * 
 */
package _java._se._01._task05;

/**
 * @author Lartsev
 *
 */
public class TestMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Matrix mtx = new Matrix(6);
		mtx.fillMatrixOneCrossLine();
		mtx.printMatrixArray();
		mtx.fillMatrixDoubleCrossLine();
		mtx.printMatrixArray();
		
    }

}
