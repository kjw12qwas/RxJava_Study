package Observable

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.ObservableEmitter
import io.reactivex.rxjava3.functions.Consumer

class SubscribeKt (){
    fun demo() {/*
        val source = Observable.create { emitter : ObservableEmitter<Int> ->
            emitter.onNext(100)
            emitter.onNext(200)
            emitter.onNext(300)
            emitter.onComplete()
        }
        source.subscribe { data -> println("Result :  $data")}*/

        val source = Observable.create { emitter : ObservableEmitter<Int> ->
            emitter.onNext(100)
            emitter.onNext(200)
            emitter.onNext(300)
            emitter.onComplete()
        }
        source.subscribe(Consumer<Int> { data -> println("Result : $data") })
    }
}

fun main() {
    val rest = SubscribeKt()
    rest.demo()
}