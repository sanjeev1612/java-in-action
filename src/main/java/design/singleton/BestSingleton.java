package design.singleton;

public class BestSingleton {
  private static BestSingleton onlyInstance;

  private BestSingleton() {
  }

  static class SingletonHelper {
    public static final BestSingleton INSTANCE = new BestSingleton();
  }

  public BestSingleton getOnlyInstance() {
    return SingletonHelper.INSTANCE;
  }
}
