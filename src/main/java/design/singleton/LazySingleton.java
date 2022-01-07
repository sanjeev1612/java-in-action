package design.singleton;

public class LazySingleton {
  private static LazySingleton onlyInstance = null;

  private LazySingleton() {
  }

  public static LazySingleton getInstance() {
    if (onlyInstance == null) {
      onlyInstance = new LazySingleton();
    }
    return onlyInstance;
  }
}
