package Map;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;

public class FlatMapJava {
    public void emit(){
        Function<String, Observable<String>> getDoubleDiamonds =
                ball -> Observable.just(ball + "<>", ball + "<>");

        String[] balls = {"1", "3", "5"};

        Observable<String> source = Observable.fromArray(balls)
                .flatMap(getDoubleDiamonds);
        source.subscribe(System.out::println);
    }

    public static void main(String[] args) {
        FlatMapJava demo = new FlatMapJava();
        demo.emit();
    }
}
