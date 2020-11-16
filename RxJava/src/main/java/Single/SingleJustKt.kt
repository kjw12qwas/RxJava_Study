package Single

import io.reactivex.rxjava3.core.Single

class SingleJustKt {
    fun emit(){
        val source = Single.just("Hello Single")
        source.subscribe(System.out::println)
    }
}

fun main() {
    val demo = SingleJustKt()
    demo.emit()
}