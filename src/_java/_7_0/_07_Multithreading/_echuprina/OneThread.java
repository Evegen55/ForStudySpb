/**
 * 
 */
package _java._7_0._07_Multithreading._echuprina;

/**
 * @author Lartsev
 *
 */
public class OneThread {
	 public OneThread() {
		 System.out.println("Запускаем счетчик.");
         Counter();
         System.out.println("Пока выполняется цикл счетчика–Выведем это сообщение.");
         System.out.println("Ну и наверно посчитаем значение Pi в квадрате: " +
         Math.PI * Math.PI);
     }
	 private void Counter() {
		 long num = 0;
		 while(num < 999999999) {
			 num++;
         }
		 System.out.println("Результат работы счетчика: " + num);
	 }
}
