import io.reactivex.rxjava3.core.Observable

class FromlterableKt {
    fun listExample() {
        val names: MutableList<String> = ArrayList()
        names.add("Jerry")
        names.add("William")
        names.add("Bod")

        val source = Observable.fromIterable(names)
        source.subscribe(System.out::println)
    }
}

fun main() {
    val demo = FromlterableKt()
    demo.listExample()
}