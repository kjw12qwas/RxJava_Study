import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;

public class CreateJava {
    public void emit() {
        Observable<Integer> source = Observable.create(
                (ObservableEmitter<Integer> emitter) -> {
                 emitter.onNext(100);
                    emitter.onNext(200);
                    emitter.onNext(300);
                    emitter.onComplete();
                });
        source.subscribe(System.out::println);
    }

    public static void main(String[] args) {
        CreateJava demo = new CreateJava();
        demo.emit();
    }
}
