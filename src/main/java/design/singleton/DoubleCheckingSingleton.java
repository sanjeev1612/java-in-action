package design.singleton;

public class DoubleCheckingSingleton {
  private static DoubleCheckingSingleton onlyInstance = null;

  private DoubleCheckingSingleton() {
  }

  public static DoubleCheckingSingleton getInstance() {
    if (onlyInstance == null) {
      synchronized (DoubleCheckingSingleton.class) {
        if (onlyInstance == null) {
          onlyInstance = new DoubleCheckingSingleton();
        }
      }
    }
    return onlyInstance;
  }
}
