package starterRx;

import generated.Employer;
import io.reactivex.rxjava3.core.Observable;

public class RxJavaMain {
    public static void main(String[] args) {
        System.out.println("First Java Rx Application");
        getObservable().subscribe(System.out::println);
        var e1= Employer.newBuilder()
                .setName("Sanjeev")
                .setAge(32)
                .build();
        System.out.println(e1);

    }

    private static Observable<Integer> getObservable() {
        return Observable.just(1,2,3,4,5);
    }
}
