/**
 * 
 */
package _java._se._07_Multithreading._echuprina;

/**
 * @author Lartsev
 *
 */
public class MultiThread {
	
	public MultiThread() {
		System.out.println("Запускаем счетчик.");
		
		Runnable r = new NewThread();
        Thread t = new Thread(r);
        t.start();
        System.out.println("Пока выполняется цикл счетчика – Выведем это сообщение.");
        System.out.println("Ну и наверно посчитаем значение Pi в квадрате: " +
        Math.PI * Math.PI);
    }
}
