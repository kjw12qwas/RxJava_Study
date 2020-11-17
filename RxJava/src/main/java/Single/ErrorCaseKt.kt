package Single

import io.reactivex.rxjava3.core.Observable

class ErrorCaseKt {
    fun emit(){
        val source = Observable.just("Hello Single", "error").single("default item")
        source.subscribe(System.out::println)
    }
}

fun main() {
    val demo = ErrorCaseKt()
    demo.emit()
}