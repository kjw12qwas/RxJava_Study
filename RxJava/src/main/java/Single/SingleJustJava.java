package Single;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class SingleJustJava {
    public void emit(){
//        Single<String> source = Single.just("Hello Single");
//        source.subscribe(System.out::println);

        // 1. 기존 Observable에서 Single 객체로 변환하기
        Observable<String> source = Observable.just("Hello Single");
        Single.fromObservable(source)
                .subscribe(System.out::println);

        // 2. Single() 함수를 호출해 Single 객체 생성하기
        Observable.just("Hello Single")
                .single("default item")
                .subscribe(System.out::println);

        // 3. first() 함수를 호출해 Single 객체 생성하기
        String[] colors = {"Red", "Blue", " Gold"};
        Observable.fromArray(colors)
                .first("default value")
                .subscribe(System.out::println);

        // 4. empty Observable에서 Single 객체 생성하기
        Observable.empty()
                .single("default value")
                .subscribe(System.out::println);

        // 5. take() 함수에서 Single 객체 생성하기
        Observable.just(new Order("ORD-1"), new Order("ORD-2"))
                .take(1)
                .single(new Order("default order"))
                .subscribe(System.out::println);
    }

    public static void main(String[] args) {
        SingleJustJava demo = new SingleJustJava();
        demo.emit();
    }
}
