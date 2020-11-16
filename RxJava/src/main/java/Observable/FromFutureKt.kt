package Observable

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.Executors

class FromFutureKt {
    fun emit(){
        val future = Executors.newSingleThreadExecutor().submit<String>{
            Thread.sleep(1000)
            "Hello Future"
        }

        val source = Observable.fromFuture(future)
        source.subscribe(System.out::println)
    }
}

fun main() {
    val demo = FromFutureKt()
    demo.emit()
}