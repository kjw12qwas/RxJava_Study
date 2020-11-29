package Reduce

import io.reactivex.rxjava3.core.Observable

class ReduceKt {
    fun emit(){
        val balls = arrayOf("1","3","5")
        val source = Observable.fromArray(*balls)
                .reduce{ ball1, ball2 -> "$ball2($ball1)"}
        source.subscribe { data -> println(data)}
    }
}

fun main() {
    val demo = ReduceKt()
    demo.emit()
}