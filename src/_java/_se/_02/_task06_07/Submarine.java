/**
 * 
 */
package _java._se._02._task06_07;

/**
 * @author Lartsev
 *
 */
public class Submarine {
	
	private double fuelLevel;
	private boolean isCrewOnBoard;
	private Engine engine;
	
	

	/**
	 * @param fuelLevel
	 */
	public Submarine(double fuelLevel) {
		this.fuelLevel = fuelLevel;
		isCrewOnBoard = false;
		engine = new Engine();
	}
	
	/**
	 * @param fuelLevel
	 * @param isCrewOnBoard
	 */
	public Submarine(double fuelLevel, boolean isCrewOnBoard) {
		this.fuelLevel = fuelLevel;
		this.isCrewOnBoard = isCrewOnBoard;
		engine = new Engine();
		System.out.println("submarine witn fuel level = " + fuelLevel + "\t" + "with crew on board: " + isCrewOnBoard + "\t" + "with engine started: " + engine.isStart());
	}
	
	
	/**
	 * @return the fuelLevel
	 */
	public double getFuelLevel() {
		return fuelLevel;
	}

	/**
	 * @param fuelLevel the fuelLevel to set
	 */
	public void setFuelLevel(double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	/**
	 * @return the isCrewOnBoard
	 */
	public boolean isCrewOnBoard() {
		return isCrewOnBoard;
	}

	/**
	 * @param isCrewOnBoard the isCrewOnBoard to set
	 */
	public void setCrewOnBoard(boolean isCrewOnBoard) {
		this.isCrewOnBoard = isCrewOnBoard;
	}

	/**
	 * 
	 * @return
	 */
	public boolean checkSubmarine() {
		boolean ret = false;
		if (fuelLevel > 0 && isCrewOnBoard == true) {
			ret = true;
		}
		System.out.println("submarine witn fuel level = " + fuelLevel + "\t" + "with crew on board: " + isCrewOnBoard + "\t" + "is CHECKED");
		return ret;
	}
	
	/**
	 * 
	 */
	public void engineStart(){
		System.out.println("engine started and submarine ready to go");
		engine.setStart(true);
	}
	
	/**
	 * 
	 */
	public void engineStop() {
		engine.setStart(false);
		System.out.println("engine stopped");
	}

	//===========================================================
	/**
	 * 
	 * @author Lartsev
	 *
	 */
    private class Engine {
    	boolean start;

    	
		/**
		 * 
		 */
		public Engine() {
			start = false;
		}


		/**
		 * @param start
		 */
		public Engine(boolean start) {
			this.start = start;
		}


		/**
		 * @return the start
		 */
		public boolean isStart() {
			return start;
		}
    //===========================================================
		
		/**
		 * @param start the start to set
		 */
		public void setStart(boolean start) {
			this.start = start;
		}
		
		
    	
		
    	
    }



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//create submarine with no crew
		Submarine sb = new Submarine(400, false);
		
		//crew onboard
		sb.setCrewOnBoard(true);
		
		//check submarine
		sb.checkSubmarine();
		
		//go to the vojage
		sb.engineStart();
		
		
		

	}

}
