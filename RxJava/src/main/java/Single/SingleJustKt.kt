package Single

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.functions.Consumer

class SingleJustKt {
    fun emit(){
//        val source = Single.just("Hello Single")
//        source.subscribe(System.out::println)

        // 1. 기존 Observable에서 Single 객체로 변환하기
        val source = Observable.just("Hello Single")
        Single.fromObservable(source)
                .subscribe { x: String? -> println(x) }

        // 2. Single() 함수를 호출해 Single 객체 생성하기
        Observable.just("Hello Single")
                .single("default item")
                .subscribe { x: String? -> println(x) }

        // 3. first() 함수를 호출해 Single 객체 생성하기
        val colors = arrayOf("Red", "Blue", " Gold")
        Observable.fromArray(*colors)
                .first("default value")
                .subscribe { x: String? -> println(x) }

        // 4. empty Observable에서 Single 객체 생성하기
        Observable.empty<Any>()
                .single("default value")
                .subscribe { x: Any? -> println(x) }

        // 5. take() 함수에서 Single 객체 생성하기
        Observable.just(Order("ORD-1"), Order("ORD-2"))
                .take(1)
                .single(Order("default order"))
                .subscribe { x -> println(x) }
    }
}

fun main() {
    val demo = SingleJustKt()
    demo.emit()
}