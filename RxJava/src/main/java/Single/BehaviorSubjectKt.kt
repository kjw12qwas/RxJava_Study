package Single

import io.reactivex.rxjava3.subjects.BehaviorSubject

class BehaviorSubjectKt {
    fun emit() {
        val subject = BehaviorSubject.createDefault("6")
        subject.subscribe { data -> println("Subscriber #1 => $data")}
        subject.onNext("1")
        subject.onNext("3")
        subject.subscribe { data -> println("Subscriber #2 => $data")}
        subject.onNext("5")
        subject.onComplete()
    }
}

fun main() {
    val demo = BehaviorSubjectKt()
    demo.emit()
}