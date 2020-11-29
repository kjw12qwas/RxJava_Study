package Filter;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class OtherFiltersJava {
    public void emit() {
        Integer[] numbers = {100, 200, 300, 400, 500};
        Single<Integer> single;
        Observable<Integer> source;

        // 1. first
        single = Observable.fromArray(numbers).first(-1);
        single.subscribe(data -> System.out.println("first() value = " + data));

        // 2. last
        single = Observable.fromArray(numbers).last(999);
        single.subscribe(data -> System.out.println("last() value = " + data));

        // 3. take(N)
        source = Observable.fromArray(numbers).take(3);
        source.subscribe(data -> System.out.println("take(3) values = " + data));

        // 4. takeLast(N)
        source = Observable.fromArray(numbers).takeLast(3);
        source.subscribe(data -> System.out.println("takeLast(3) values = " + data));

        // 5. skip(N)
        source = Observable.fromArray(numbers).skip(2);
        source.subscribe(data -> System.out.println("skip(2) values = " + data));

        // 6. skipLast(N)
        source = Observable.fromArray(numbers).skipLast(2);
        source.subscribe(data -> System.out.println("skipLast(2) values = " + data));
    }

    public static void main(String[] args) {
        OtherFiltersJava demo = new OtherFiltersJava();
        demo.emit();
    }
}
