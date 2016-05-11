package _java._7_0._07_Multithreading._echuprina;

public class NewThread implements Runnable {

	@Override
	public void run() {
		long num = 0;
        while(num < 999999999) {
        	num++;
        }
        System.out.println("Результат работы счетчика: " + num);

	}

}
