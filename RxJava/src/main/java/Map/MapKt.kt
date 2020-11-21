package Map

import io.reactivex.rxjava3.core.Observable

class MapKt{
    fun emit(){
        val balls = arrayOf("1","2","3","4")
        val source = Observable.fromArray(*balls)
                .map { ball -> "$ball<>" }
        source.subscribe { data -> println(data)}
    }
}

fun main() {
    val demo = MapKt()
    demo.emit()
}