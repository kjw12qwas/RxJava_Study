package Observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.functions.Consumer;

public class Subscribe {
    public void emit() {
        // subscribe()를 호출하지 않은 create()
        /*Observable<Integer> source = Observable.create(
                (ObservableEmitter<Integer> emitter) -> {
                    emitter.onNext(100);
                    emitter.onNext(200);
                    emitter.onNext(300);
                    emitter.onComplete();
                }
        );*/
        // subscribe() 함수 변경
        /*Observable<Integer> source = Observable.create(
                (ObservableEmitter<Integer> emitter) -> {
                    emitter.onNext(100);
                    emitter.onNext(200);
                    emitter.onNext(300);
                    emitter.onComplete();
                }
        );

        // 익명 객체 활용 얘
        source.subscribe(data -> System.out.println("Result : " + data));*/
        Observable<Integer> source = Observable.create((ObservableEmitter<Integer> emitter) -> {
                    emitter.onNext(100);
                    emitter.onNext(200);
                    emitter.onNext(300);
                    emitter.onComplete();
                }
        );
        source.subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer data) throws Exception {
                System.out.println("Result : " + data);
            }
        });

    }

    public static void main(String[] args) {
        Subscribe demo = new Subscribe();
        demo.emit();
    }
}
