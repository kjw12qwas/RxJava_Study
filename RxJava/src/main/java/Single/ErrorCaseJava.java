package Single;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class ErrorCaseJava {
    public void emit(){
        Single<String> source = Observable
                .just("Hello Single", "Error").single("default value");
        source.subscribe(System.out::println);
    }

    public static void main(String[] args) {
        ErrorCaseJava demo = new ErrorCaseJava();
        demo.emit();
    }
}
