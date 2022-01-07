package design.singleton;

public class StaticBlockSingleton {
  private static StaticBlockSingleton onlyInstance = null;

  private StaticBlockSingleton() {
  }

  static {
    onlyInstance = new StaticBlockSingleton();
  }

  public static StaticBlockSingleton getInstance() {
    return onlyInstance;
  }
}
