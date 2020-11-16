package Observable

import io.reactivex.rxjava3.core.Observable

class FirstExampleK {
    /*fun emitKt() {
        Observable.just(1, 2, 3, 4, 5, 6)
                .subscribe(System.out::println)
    }*/
    fun emit(){
        val source = Observable.just("RED","GREEM","BLUE")

        val d = source.subscribe(
                { v -> println("onNext() : value : $v")},
                { err -> println("onError() : err : ${err.message}") },
                { println("onComplete()")}
        )

        println("isDisPosed() : " + d.isDisposed)
    }
}

fun main() {
    val demo = FirstExampleK()
    demo.emit()
}