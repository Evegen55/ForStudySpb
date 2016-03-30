/**
 *
 */
package _java._se._03._task02;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * @author Lartsev
 *
 */
public class InternationalizationExample {

	private ResourceBundle bundle;
	private Locale locale;

	/**
	 * 
	 */
	public void app() {
		Scanner sc = new Scanner(System.in);
		int next = 0;
		System.out.println("Select language: 1- English, 2 - Russian");
		if(sc.hasNextInt()) {
			next = sc.nextInt();
			//select locale and bundle file depends on user's preferrences
			if (next == 1) {locale = Locale.US;	}
            if (next == 2) {locale = Locale.getDefault(); }
            bundle = ResourceBundle.getBundle("_java._se._03._task02.QuestionBundle", locale);
			System.out.println(bundle.getString("MAIN"));

			
			if(sc.hasNextInt()) {
				next = sc.nextInt();
				if(next == 1) { System.out.println(bundle.getString("FOOD"));}
                if(next == 2) { System.out.println(bundle.getString("GAME"));}
                if(next == 3) { System.out.println(bundle.getString("MATH"));}
                if(next == 4) { System.out.println(bundle.getString("INVADERS"));}
			}
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InternationalizationExample ex = new InternationalizationExample();
		ex.app();
	}

}
