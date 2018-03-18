package _java._7_0._02_OOP_in_Java._annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ProcessAnnotation {

	public static void main(String[] args) throws ClassNotFoundException {
		final Class cl = Class.forName("_java._7_0._02_OOP_in_Java._annotation.AnnotationClass");

		final Constructor<AnnotationClass>[] constructors = cl.getConstructors();
		for (final Constructor<AnnotationClass> c : constructors) {
			if (c.isAnnotationPresent(ClassPreamble.class)) {
				System.out.println("Annotation for next constructor: " + c);
			} else {
				System.err.println("There is no annotations for for next constructor: " + c);
			}
		}
	}

}
