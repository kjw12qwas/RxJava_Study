package Single;

import io.reactivex.rxjava3.core.Single;

public class SingleJustJava {
    public void emit(){
        Single<String> source = Single.just("Hello Single");
        source.subscribe(System.out::println);
    }

    public static void main(String[] args) {
        SingleJustJava demo = new SingleJustJava();
        demo.emit();
    }
}
