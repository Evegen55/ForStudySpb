//: net/mindview/util/DaemonThreadFactory.java
package from_TIJ4.concurrency.daemons;
import java.util.concurrent.*;

public class DaemonThreadFactory implements ThreadFactory {
  public Thread newThread(Runnable r) {
    Thread t = new Thread(r);
    t.setDaemon(true);
    return t;
  }
} ///:~
