package Single;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;

public class MapExampleJava {
    public void emit(){
        Function<String, Integer> ballToIndex = ball -> {
            switch (ball) {
                case "RED" : return 1;
                case "YELLOW" : return 2;
                case "GREEN" : return 3;
                case "BLUE" : return 4;
                default: return -1;
            }
        };

        String[] balls = {"RED","YELLOW","GREEN","BLUE"};
        Observable<Integer> source = Observable.fromArray(balls)
                .map(ballToIndex);
        source.subscribe(System.out::println);
    }

    public static void main(String[] args) {
        MapExampleJava demo = new MapExampleJava();
        demo.emit();
    }
}
