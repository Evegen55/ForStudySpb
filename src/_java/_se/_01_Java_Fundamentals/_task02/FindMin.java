package _java._se._01_Java_Fundamentals._task02;

public class FindMin {
	
	private double e;

	/**
	 * initialize with e
	 * @param e
	 */
	public FindMin(double e) {
		this.e = e;
	}
	
	/**
	 * 
	 * @param i
	 * @return
	 */
	public double findSeriesMember(int i) {
		return 1/Math.pow(i+1, 2);
	}
	
	public void findSeriesDependsOnE() {
		double serMember;
		for (int a = 1;; a++) {
			serMember = findSeriesMember(a);
			if (serMember<this.e) {
				System.out.println("value of member of the series with MIN  is" + "\t" + serMember + "\t" + 
						"with number" + "\t" + a);
				break;
			} else {
				System.out.println("value of member of the series is" + "\t" + serMember + "\t" + 
						"with number" + "\t" + a);
			}
		}
	}

}
