package Reduce;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;

public class ReduceJava {
    public void emit(){
        String[] balls = {"1", "3", "5"};
        Maybe<String> source = Observable.fromArray(balls)
                .reduce((ball1, ball2) -> ball2 + "(" + ball1 + ")");
        source.subscribe(System.out::println);
    }

    public static void main(String[] args) {
        ReduceJava demo = new ReduceJava();
        demo.emit();
    }
}
