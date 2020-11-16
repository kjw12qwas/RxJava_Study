package Observable

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.ObservableEmitter

class CreateKotlin {
    fun emit() {
        val source = Observable.create{ emitter: ObservableEmitter<Int> ->
            emitter.onNext(100);
            emitter.onNext(200)
            emitter.onNext(300)
            emitter.onComplete()
        }
        source.subscribe(System.out::println)
    }
}
fun main(){
    val demo = CreateKotlin()
    demo.emit()
}