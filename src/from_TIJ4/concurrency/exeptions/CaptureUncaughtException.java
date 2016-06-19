package from_TIJ4.concurrency.exeptions;
//: concurrency/CaptureUncaughtException.java
import java.util.concurrent.*;

//single task
class ExceptionThread2 implements Runnable {
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("run() by " + t);
		System.out.println(
				"eh = " + t.getUncaughtExceptionHandler());
		//THROW EXCEPTION
		throw new RuntimeException();
	}
}

//exception handler for single task
class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
	
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("caught " + e);
	}
}

//thread factory
class HandlerThreadFactory implements ThreadFactory {
	
	public Thread newThread(Runnable r) {
		System.out.println(this + " creating new Thread");
		Thread t = new Thread(r);
		System.out.println("created " + t + "\n");
		//set exception handler to a single task
		t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
		System.out.println(
		"eh = " + t.getUncaughtExceptionHandler());
		return t;
	}
}

//test code
public class CaptureUncaughtException {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool(
				new HandlerThreadFactory());
		exec.execute(new ExceptionThread2());
	}
} /* Output: (90% match)
HandlerThreadFactory@de6ced creating new Thread
created Thread[Thread-0,5,main]
eh = MyUncaughtExceptionHandler@1fb8ee3
run() by Thread[Thread-0,5,main]
eh = MyUncaughtExceptionHandler@1fb8ee3
caught java.lang.RuntimeException
*///:~
