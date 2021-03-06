package from_TIJ4.concurrency.daemons;
//: concurrency/DaemonFromFactory.java
// Using a Thread Factory to create daemons.
import java.util.concurrent.*;
//import net.mindview.util.*;
//import static net.mindview.util.Print.*;
import static from_TIJ4.concurrency.daemons.Print.*;

public class DaemonFromFactory implements Runnable {
	
	@Override
	public void run() {
		try {
			while(true) {
				TimeUnit.MILLISECONDS.sleep(100);
				print(Thread.currentThread() + " " + this);
			}
		} catch(InterruptedException e) {
			print("Interrupted");
		}
	}
  
	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newCachedThreadPool(
				new DaemonThreadFactory());
		for(int i = 0; i < 10; i++)
			//always create a new thread and run DaemonFromFactory.run() 
			exec.execute(new DaemonFromFactory()); 
		print("All daemons started");
		TimeUnit.MILLISECONDS.sleep(500); // Run for a while
	}
} /* (Execute to see output) *///:~
