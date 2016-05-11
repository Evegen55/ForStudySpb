package _java._7_0._01_Java_Fundamentals._task04;

public class SingleDimArray {
	
	public void maxInTwoArrays(double[] arr1){
		int maxIndex = arr1.length-1;
		double[] arr2 = new double[arr1.length];
		double[] arrSum = new double[arr1.length];
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		//test code ============================
		for (int i = 0; i<arr2.length; i++) {
			System.out.println("arr2[i]" + "\t" + arr2[i]);
			arrSum[i] = arr1[i] + arr2[maxIndex-i];
		}
		
		//test code ============================
		for (int i = 0; i<arrSum.length; i++) {
			System.out.println("arrSum[i]" + "\t" + arrSum[i]);
		}
		
		findMaxInSimpleArray(arrSum);
		
	}

	private void findMaxInSimpleArray(double[] arrSum) {
		double max = arrSum[0];
		for (int i = 0; i<arrSum.length; i++) {
			if (arrSum[i]>max) {
				max = arrSum[i];
			}
		}
		System.out.println("\n" + "Max value is:" + "\t" + max);
	}

	public static void main(String[] args) {
		
		//test code ============================
		double[] arr1 = {1,2,3,4,5,6,15,25.5,153};
		
		SingleDimArray sdm = new SingleDimArray();
		sdm.maxInTwoArrays(arr1);

	}

}
