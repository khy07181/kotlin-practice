package basics

import java.io.File

fun main() {
    val customer = Customer("hayoung", "khy07181@gmail.com")
    println("name : ${customer.name}, email : ${customer.email}")
    foo()

    val intList = listOf(-1, 2, -3, 4, -5)

    // 3. Filter a list
    val positives = intList.filter { it > 0 }
    println(positives)

    // 4. Check the presence of an element in a collection
    val emailList = listOf("qlalzl9@naver.com", "khy07181@gmail.com", "hayoung.kim@seavantage.com")
    if("khy07181@gmail.com" in emailList) {
        println("khy07181@gmail.com is exist.")
    }

    // 5. String interpolation
    val name = "hayoung"
    println("Name : $name, name length : ${name.length}")

    val foo = Foo("foo")
    println(instanceCheck(foo))

    // 7. Read-only
    val list = listOf("a", "b", "c")
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(list)
    println(map)

    // 8. Access a map entry
    println(map["a"])

    // 9. Traverse a map or a list of pairs
    for ((k, v) in map) {
        println("$k -> $v")
    }

    // 10. Iterate over a range
    for (i in 1..5) { // includes 5
        println("$i in 5")
    }

    for (i in 1 until 5) { // not include 5
        println("$i in 5")
    }

    for (i in 2..10 step 2) {
        println("$i")
    }

    for (i in 5 downTo 1) {
        println("$i")
    }

    (1..5).forEach {
        println(it)
    }

    // 11. Lazy property
    val s: String by lazy {
        "Initialized"
    }
    println(s)

    val myObject = object : MyAbstractClass() {
        override fun doSomething() {
            println("doSomething")
        }

        override fun sleep() {
            println("sleep")
        }
    }
    myObject.doSomething()
    myObject.sleep()

    // 16. Execute a statement if null
    val values = mapOf("name" to "hayoung", "email" to "khy07181@gmail.com")
    values["email"] ?: throw java.lang.IllegalStateException("Email is missing.")

}

// 1. Create DTOs
data class Customer(val name: String, val email: String)

// 2. Default values for function parameters
fun foo(a: Int = 0, b: String = "") {
    println("a = $a, b = $b")
}

// 6. Instance checks
fun instanceCheck(obj: Any): String =
    when (obj) {
        is Foo -> "Foo"
        is Bar -> "Bar"
        else   -> "Any"
    }

class Foo(var name: String) {

}

class Bar(var name: String) {

}

// 13. Create a singleton
object Resource {
    val name = "Name"
}

// 14. Instantiate an abstract class
abstract class MyAbstractClass {
    abstract fun doSomething()
    abstract fun sleep()
}