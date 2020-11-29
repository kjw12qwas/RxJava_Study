package Filter

import io.reactivex.rxjava3.core.Observable

class FilterExampleKt {
    fun emit() {
        val objs = arrayOf("1 CIRCLE", "2 DIAMOND", "3 TRIANGLE",
                "4 DIAMOND", "5 CIRCLE", "6 HEXAGON")
        val source = Observable.fromArray(*objs)
                .filter {obj -> obj.endsWith("CIRCLE")}
        source.subscribe(System.out::println)
    }
}

fun main() {
    val demo = FilterExampleKt()
    demo.emit()
}