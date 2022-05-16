
val PI = 3.14
var q = 0

fun main() {
    println("Hello world!")
    println(sum(1, 3))

    val a = 1
    val b = 2
    val c = 3
    println("a = $a, b = $b, c = $c")

    var x = 5
    x += 1
    println("x = $x")

    println("q = $q; PI = $PI")
    incrementQ()
    println("incrementQ()")
    println("q = $q; PI = $PI")

    val rectangle = Rectangle(5.0, 2.0)
    println("the perimeter is ${rectangle.perimeter}")

    var d = 1
    val s1 = "a is $d"

    d = 2
    val s2 = "${s1.replace("is", "was")}, but now is $d"
    println(s2)

    println("max of 0 and 42 is ${maxOf(0, 42)}")

    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is find too")
    }

    val e = 10
    val f = 9

    if (e in 1..f+1) {
        println("fits in range")
    }

    val list = listOf("a", "b", "c")

    if (-1 !in list.indices) {
        println("-1 is out of range")
    }

    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }

    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")


}

open class Shape

class Rectangle(var height: Double, var length: Double): Shape() {
    var perimeter = (height + length) * 2
}

fun sum(a: Int, b: Int) = a + b

fun incrementQ() {
    q += 1
}

fun maxOf(a: Int, b: Int): Int = if (a > b) {
    a
} else {
    b
}

fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if(x != null && y != null) {
        println(x * y)
    } else {
        println("$arg1 or $arg2 is not a number")
    }
}

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}
