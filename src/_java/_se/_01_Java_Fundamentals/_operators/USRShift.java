package _java._se._01_Java_Fundamentals._operators;

public class USRShift {

	public static void main(String[] args) {
		int i = -1; //11111111111111111111111111111111
		System.out.println(i);
		i >>>= 10;  //00000000011111111111111111111111
		System.out.println(i);
		
		long l = -1; 
		System.out.println(l);
		l >>>= 10;  
		System.out.println(l);
		
		short s = -1; 
		System.out.println(s);
		s >>>= 10;  
		System.out.println(s);
		
		byte b = -1; 
		System.out.println(b);
		b >>>= 10;  
		System.out.println(b);
		
		int r = 3;
		r = -r++ + r++ + -r;
		System.out.println(r);
		
		int w = 3;
		w = -w++;
		System.out.println(r);

	}

}
