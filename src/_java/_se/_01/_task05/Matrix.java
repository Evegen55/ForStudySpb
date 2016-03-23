/**
 *
 */
package _java._se._01._task05;

/**
 * @author Lartsev
 *
 */
public class Matrix {

	private int size;
	private int[][] matrix;

	
	/**
	 * 
	 */
	public Matrix() {
		this.size = 0;
		this.matrix = new int[0][0];
	}

	/**
	 * @param size
	 */
	public Matrix(int size) {
		this.size = size;
		this.matrix = new int[size][size];
	}
	
	/**
     * @param PrintedArr is an  array which has to be printed. 
     * 
     */   
    public void printMatrixArray() {
    	for (int[] PrintedArr1 : matrix) {
    		for (int k = 0; k<matrix[0].length; k++) {
    			System.out.print(PrintedArr1[k] + "\t");
            }
            System.out.println();
        }
    }



}
