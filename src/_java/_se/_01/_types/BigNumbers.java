package _java._se._01._types;

import java.math.BigInteger;

public class BigNumbers {

	public static void main(String[] args) {
		BigInteger numI1, numI2, bigNumI;
		
		numI1 = BigInteger.valueOf(1_000_000_000_000L);
		numI2 = numI1.multiply(numI1);
		
		System.out.println("numI2 - " + numI2);
		
		numI2 = numI1.multiply(numI1).multiply(numI1);
		System.out.println("numI2 - " + numI2);
		
		numI2 = numI1.multiply(numI1).multiply(numI1).multiply(numI1);
		System.out.println("numI2 - " + numI2);
		
		numI2 = numI1.multiply(numI1).multiply(numI1).multiply(numI1)
				.multiply(numI1).multiply(numI1).multiply(numI1);
		System.out.println("numI2 - " + numI2);
		

	}

}
