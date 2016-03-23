package _java._se._01._task03;

public class TanCycle {
	
	public void calcFunc(double a, double b, double h) {
		double result = 0;
		while (a <= b) {
			result = Math.tan(2.0*a)-3.0;
			System.out.println("x=" + "\t" + a  + "\t" + "F(x)=" + "\t" + result + "\n");
			a = a + h;
			//normalize a
			a = (double) Math.round(a*10)/10;
			
		}
	}
	
	public static void main(String[] args) {
		double a = 0.0;
		double b = 1.0;
		double h = 0.1;
		
		TanCycle fx = new TanCycle ();
		fx.calcFunc(a, b, h);
	}

}
