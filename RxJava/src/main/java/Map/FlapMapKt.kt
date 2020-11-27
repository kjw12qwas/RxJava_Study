package Map

import io.reactivex.rxjava3.core.Observable

class FlapMapKt {
    fun emit(){
        val balls = arrayOf("1", "3", "5")
        val source = Observable.fromArray(*balls)
                .flatMap { ball -> Observable.just("$ball <>, $ball <>") }
        source.subscribe(System.out::println)
    }
}

fun main() {
    val demo = FlapMapKt()
    demo.emit()
}