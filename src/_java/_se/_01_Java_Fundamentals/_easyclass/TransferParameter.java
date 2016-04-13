package _java._se._01_Java_Fundamentals._easyclass;

import java.util.Date;

public class TransferParameter {

	public static void main(String[] args) {
		Date myDate = new Date();
		System.out.println("Before" + "\t" + myDate.getDate());
		changeDate(myDate);
		System.out.println("After"+ "\t" + myDate.getDate());

	}

	private static void changeDate(Date myDate) {
		System.out.println("\t" + "\t" + "Before change"+ "\t" + myDate.getDate());
		myDate.setDate(12);
		System.out.println("\t" + "\t" + "After change"+ "\t" + myDate.getDate());
		
	}

}
