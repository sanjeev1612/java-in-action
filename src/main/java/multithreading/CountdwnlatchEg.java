package multithreading;

import lombok.val;

import java.util.concurrent.CountDownLatch;

class Service implements Runnable {
  private String name;
  private int timeTaken;
  private CountDownLatch latch;
  private int initialLatchValue;

  public Service(String name, int timeTaken, CountDownLatch latch, int initialLatchValue) {
    this.name = name;
    this.timeTaken = timeTaken;
    this.latch = latch;
    this.initialLatchValue = initialLatchValue;
  }

  @Override
  public void run() {
    try {
      Thread.sleep(timeTaken);
      System.out.println("running service -> " + name);
      latch.countDown();
      if (initialLatchValue - latch.getCount() == 2) {
        latch.countDown();
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}

public class CountdwnlatchEg {

  public static void main(String[] args) {
    val latch = new CountDownLatch(3);
    val service1 = new Thread(new Service("starter", 1000, latch, 3));
    val service2 = new Thread(new Service("beginner", 500, latch, 3));
    val service3 = new Thread(new Service("validator", 100000, latch, 3));
    service1.start();
    service2.start();
    service3.start();

    try {
      latch.await();
      System.out.println("required services completed .... processing starts here ...");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}