package Reduce

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.functions.BiFunction

class BiFunctionKt {
    fun emit() {
        val mergeBalls = BiFunction<String, String, String> {
            ball1 , ball2 -> "$ball2($ball1)"
        }

        val balls = arrayOf("1", "3", "5")
        val source = Observable.fromArray(*balls)
                .reduce(mergeBalls)
        source.subscribe(System.out::println)
    }
}

fun main() {
    val demo = BiFunctionKt()
    demo.emit()
}