package design.singleton;

public class ThreadSafeSingleton {

  private static ThreadSafeSingleton onlyInstance = null;

  private ThreadSafeSingleton() {
  }

  public static synchronized ThreadSafeSingleton getInstance() {
    if (onlyInstance == null) {
      onlyInstance = new ThreadSafeSingleton();
    }
    return onlyInstance;
  }
}
