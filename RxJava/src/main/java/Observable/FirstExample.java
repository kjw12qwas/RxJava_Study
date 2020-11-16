package Observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;

public class FirstExample {
    /*public void emit(){
        Observable.just("Hello!!", "RxJava 2 !!")
                .subscribe(System.out::println);
    }*/
    public void emit(){
        Observable<String> source = Observable.just("RED", "GREEN", "YELLOW");

        Disposable d = source.subscribe(
                v -> System.out.println("onNext() : value : " + v),
                err -> System.out.println("onError() : err : " + err.getMessage()),
                () -> System.out.println("onComplete()")
        );
        System.out.println("isDisposed() : " + d.isDisposed());
    }

    public static void main(String[] args) {
        FirstExample demo = new FirstExample();
        demo.emit();
    }
}
