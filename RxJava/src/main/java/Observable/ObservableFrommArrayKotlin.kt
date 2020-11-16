package Observable

import io.reactivex.rxjava3.core.Observable

class ObservableFrommArrayKotlin {
    fun integerArray() {
        val arr = arrayOf(100,200,300)

        val source = Observable.fromArray(*arr)
        source.subscribe(System.out::println)
    }
}
fun main(){
    val demo = ObservableFrommArrayKotlin()
    demo.integerArray()
}