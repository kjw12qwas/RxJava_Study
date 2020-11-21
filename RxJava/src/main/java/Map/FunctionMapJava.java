package Map;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;


public class FunctionMapJava {
    public void emit(){
        Function<String, String> getDiamond = ball -> ball + "<>";

        String[] balls = {"1", "2", "3", "5"};
        Observable<String> source = Observable.fromArray(balls)
                .map(getDiamond);
        source.subscribe(data -> System.out.println(data));
    }

    public static void main(String[] args) {
        FunctionMapJava demo = new FunctionMapJava();
        demo.emit();
    }
}
