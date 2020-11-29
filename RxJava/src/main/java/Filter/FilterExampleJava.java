package Filter;

import io.reactivex.rxjava3.core.Observable;

public class FilterExampleJava {
    public void emit() {
        String[] objs = {"1 CIRCLE", "2 DIAMOND", "3 TRIANGLE",
        "4 DIAMOND", "5 CIRCLE", "6 HEXAGON"};
        Observable<String> source = Observable.fromArray(objs)
                .filter(obj -> obj.endsWith("CIRCLE"));
        source.subscribe(System.out::println);
    }

    public static void main(String[] args) {
        FilterExampleJava demo = new FilterExampleJava();
        demo.emit();
    }
}
