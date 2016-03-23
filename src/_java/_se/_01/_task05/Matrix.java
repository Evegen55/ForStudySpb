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
     *
     */
    public void printMatrixArray() {
    	for (int[] PrintedArr1 : matrix) {
    		for (int k = 0; k<this.size; k++) {
    			System.out.print(PrintedArr1[k] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * just for myself
     */
    public void fillMatrixOneCrossLine() {
    	for (int i = 0; i<this.size; i++) {
    		for (int k = 0; k<this.size; k++) {
    			if (i == k) {
    				matrix[i][k] = 1;
    			} else {
    				matrix[i][k] = 0;
    			}

            }
            System.out.println();
        }
    }

	public void fillMatrixDoubleCrossLine() {
		for (int i = 0; i<this.size; i++) {
    		for (int k = 0; k<this.size; k++) {
    			if ((i == k) || (i == this.size - k - 1) ) {
    				matrix[i][k] = 1;
    			} else {
    				matrix[i][k] = 0;
    			}

            }
            System.out.println();
        }
	}



}
