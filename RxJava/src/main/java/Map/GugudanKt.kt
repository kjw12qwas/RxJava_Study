package Map

import io.reactivex.rxjava3.core.Observable
import java.util.*

class GugudanKt {
    fun emit() {
        val scanner = Scanner(System.`in`)
        print("Gugudan Input : ")
        val dan = scanner.nextInt()

        val source = Observable.range(1, 9)
        source.subscribe { row -> println("$dan * $row = ${dan * row}") }

        scanner.close()
    }
}

fun main() {
    val demo = GugudanKt()
    demo.emit()
}