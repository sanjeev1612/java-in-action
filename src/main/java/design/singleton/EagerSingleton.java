package design.singleton;

public class EagerSingleton {
  private static EagerSingleton onlyInstance = new EagerSingleton();

  private EagerSingleton() {
  }

  public static EagerSingleton getInstance() {
    return onlyInstance;
  }
}
