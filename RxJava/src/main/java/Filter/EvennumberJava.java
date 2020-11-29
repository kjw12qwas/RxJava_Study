package Filter;

import io.reactivex.rxjava3.core.Observable;

public class EvennumberJava {
    public void emit() {
        Integer[] data = {100, 34, 27, 99, 50};
        Observable<Integer> source = Observable.fromArray(data)
                .filter(number -> number % 2 == 0);
        source.subscribe(System.out::println);
    }

    public static void main(String[] args) {
        EvennumberJava demo = new EvennumberJava();
        demo.emit();
    }
}
