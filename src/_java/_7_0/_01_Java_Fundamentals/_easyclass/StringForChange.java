package _java._7_0._01_Java_Fundamentals._easyclass;

public class StringForChange {

	public static void main(String[] args) {
		String str = "I like ";
		System.out.println("Before" + "\t" + str);
		changeString(str);
		System.out.println("After" + "\t" + str);

	}

	private static void changeString(String str) {
		System.out.println("\t" + "\t" + "Before change"+ "\t" + str);
		str = str + "Java";
		System.out.println("\t" + "\t" + "After change"+ "\t" + str);
	}

}
