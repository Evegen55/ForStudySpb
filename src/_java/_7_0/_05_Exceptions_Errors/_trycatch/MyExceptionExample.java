package _java._7_0._05_Exceptions_Errors._trycatch;

public class MyExceptionExample {

	public static void main(String[] args) {

		procD();

	}

	private static void procD() {

		try {
			System.out.println("Incide procD()");
			throw new MyException(0);
		} catch (MyException e) {
			e.printStackTrace();
		}


}

}
