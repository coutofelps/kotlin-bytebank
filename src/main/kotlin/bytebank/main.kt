fun main() {
    printIt(1)
    printIt(1.1)
    printIt(Any())
}

fun printIt(value: Any): Unit {
    println(value)
}