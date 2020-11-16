package Observable

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.ArrayBlockingQueue
import java.util.concurrent.BlockingQueue

class FromlterableKt {
    fun listExample() {
        val names: MutableList<String> = ArrayList()
        names.add("Jerry")
        names.add("William")
        names.add("Bod")

        val source = Observable.fromIterable(names)
        source.subscribe(System.out::println)
    }
    fun setExample() {
        val cities : MutableSet<String> = HashSet()
        cities.add("Seoul")
        cities.add("London")
        cities.add("Paris")

        val source1 = Observable.fromIterable(cities)
        source1.subscribe(System.out::println)
    }
    fun blockingQueueExample() {
        val orderQueue : BlockingQueue<Order> = ArrayBlockingQueue(100)
        orderQueue.add(Order("ORD-1"))
        orderQueue.add(Order("ORD-2"))
        orderQueue.add(Order("ORD-3"))

        val source = Observable.fromIterable(orderQueue)
        source.subscribe { order -> println(order.getId())}
    }
}

fun main() {
    val demo = FromlterableKt()
    demo.listExample()
}