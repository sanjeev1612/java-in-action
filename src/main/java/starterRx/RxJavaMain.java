package starterRx;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;

public class RxJavaMain {
    public static void main(String[] args) {
        System.out.println("First Java Rx Application");
        getObservable().subscribe(System.out::println);
    }

    private static Observable<Integer> getObservable() {
        return Observable.just(1,2,3,4,5);
    }
}
