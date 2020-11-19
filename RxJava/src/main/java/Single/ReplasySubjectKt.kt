package Single

import io.reactivex.rxjava3.subjects.ReplaySubject

class ReplasySubjectKt {
    fun emit() {
        val subject = ReplaySubject.create<String>()
        subject.subscribe { data -> println("Subscriber #1 => $data")}
        subject.onNext("1")
        subject.onNext("3")
        subject.subscribe { data -> println("Subscriber #2 => $data")}
        subject.onNext("5")
        subject.onComplete()
    }
}

fun main() {
    val demo = ReplasySubjectKt()
    demo.emit()
}