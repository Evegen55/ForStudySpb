package _java._se._02_OOP_in_Java._annotation;

import java.lang.annotation.Documented;

@Documented
public @interface ClassPreamble {
	
	String author();
	int date();
	

}
