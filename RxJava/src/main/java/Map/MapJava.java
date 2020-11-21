package Map;

import io.reactivex.rxjava3.core.Observable;

public class MapJava {
    public void emit(){
        String[] balls = {"1","2","3","5"};
        Observable<String> source = Observable.fromArray(balls)
                .map(ball -> ball + "<>");
        source.subscribe(data -> System.out.println(data));
    }

    public static void main(String[] args) {
        MapJava demo = new MapJava();
        demo.emit();
    }
}
