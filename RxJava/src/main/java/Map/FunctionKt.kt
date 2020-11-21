package Map

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.functions.Function

class FunctionKt {
    fun emit(){
        val getDiamond = Function<String,String> { ball -> "$ball<>" }

        val balls = arrayOf("1","2","3","5")
        val source = Observable.fromArray(*balls)
                .map(getDiamond)
        source.subscribe { data -> println(data)}
    }
}

fun main() {
    val demo = FunctionKt()
    demo.emit()
}