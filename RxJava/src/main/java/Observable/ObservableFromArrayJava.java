package Observable;

import io.reactivex.rxjava3.core.Observable;

public class ObservableFromArrayJava {
    public void integerArray() {
        Integer[] arr = {100,200,300};
        Observable<Integer> source = Observable.fromArray(arr);
        source.subscribe(System.out::println);
    }

    public static void main(String[] args) {
        ObservableFromArrayJava demo  = new ObservableFromArrayJava();
        demo.integerArray();
    }
}
