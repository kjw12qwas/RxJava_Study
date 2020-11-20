package Single;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

import java.util.concurrent.TimeUnit;

public class ConnectableObservableJava {
    public void emit(){
        String[] dt = {"1","3","5"};
        Observable<String> balls = Observable.interval(100L, TimeUnit.MILLISECONDS)
                .map(Long::intValue)
                .map(i -> dt[i])
                .take(dt.length);
        ConnectableObservable<String> source = balls.publish();
        source.subscribe(data -> System.out.println("Subscriber #1 => " + data));
        source.subscribe(data -> System.out.println("Subscriber #2 => " + data));
        source.connect();

        source.subscribe(data -> System.out.println("Subscriber #3 => " + data));
    }

    public static void main(String[] args) {
        ConnectableObservableJava demo = new ConnectableObservableJava();
        demo.emit();
    }
}
