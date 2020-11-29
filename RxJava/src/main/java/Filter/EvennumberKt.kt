package Filter

import io.reactivex.rxjava3.core.Observable

class EvennumberKt {
    fun emit() {
        val data = arrayOf(100, 34, 27 ,99 ,50)
        val source = Observable.fromArray(*data)
                .filter { number -> number % 2 == 0 }
        source.subscribe(System.out::println)
    }
}

fun main() {
    val demo = EvennumberKt()
    demo.emit()
}