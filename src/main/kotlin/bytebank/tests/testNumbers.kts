fun testNumbers() {
    val x: Int = 15
    val y: Int = 14.5
    val z: x

    z += 10

    test(x)
    test(y)

    println(z)
    println(x.toDouble())
    println(x.toLong())
}

fun test(value: Number) {
}