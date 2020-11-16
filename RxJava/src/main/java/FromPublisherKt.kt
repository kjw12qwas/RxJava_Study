import io.reactivex.rxjava3.core.Observable
import org.reactivestreams.Publisher
import org.reactivestreams.Subscriber

class FromPublisherKt {
    fun emit(){
        val publisher = Publisher {s: Subscriber<in String?> ->
            s.onNext("Hello Observable.fromPublisher()")
            s.onComplete()
        }

        val source = Observable.fromPublisher(publisher)
        source.subscribe(System.out::println)
    }
}

fun main() {
    val demo = FromPublisherKt()
    demo.emit()
}