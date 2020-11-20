package Single

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

class ConnectableObservableKt {
    fun emit() {
        val dt = arrayOf("1","3","5")

        val balls = Observable.interval(100, TimeUnit.MILLISECONDS)
                .map { data -> data.toInt() }
                .map { i -> dt[i] }
                .map { dt.size.toLong() }

        val source = balls.publish()
        source.subscribe { data -> println("Subscriber #1 => $data")}
        source.subscribe { data -> println("Subscriber #2 => $data")}
        source.connect()

        Thread.sleep(250)
        source.subscribe { data -> println("Subscriber #3 => $data")}

        Thread.sleep(100)
    }
}

fun main() {
    val demo = ConnectableObservableKt()
    demo.emit()
}