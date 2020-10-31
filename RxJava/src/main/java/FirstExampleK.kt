import io.reactivex.rxjava3.core.Observable

class FirstExampleK {
    fun emitKt() {
        Observable.just(1, 2, 3, 4, 5, 6)
                .subscribe(System.out::println)
    }
}

fun main() {
    val demo = FirstExampleK()
    demo.emitKt()
}