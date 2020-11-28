package Map

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.functions.Function
import java.util.*

class Gugudan2Kt {
    fun emit() {
        val scanner = Scanner(System.`in`)
        print("Gugudan Input : ")
        val dan = scanner.nextInt()

        val gugudan = Function<Int, Observable<String>> { num ->
            Observable.just(1, 9)
                    .map { row : Int -> "$num * $row = ${num * row }" }
        }
        val source = Observable.just(dan).flatMap(gugudan)
        source.subscribe { data -> println(data) }

        scanner.close()
    }
}

fun main() {
    val demo = Gugudan2Kt()
    demo.emit()
}