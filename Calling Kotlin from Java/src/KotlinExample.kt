@file:JvmName("DemoUtils")
@file:JvmMultifileClass

package demo

class Person(val firstName: String, val lastName: String, val age: Int?) {
    private val fullName = "$firstName $lastName"

    // initializer blocks
    init {
        println("Initialed with firstName: $this.firstName, lastName: $lastName, age: $age")
    }

    fun talk(message: String = "") {
        println("$firstName $lastName says $message")
    }

    // make field in Java
    @JvmField
    val creditCardNumber: String = "12345678"
}

class Calculation() {
    lateinit var aRandomString: String

    companion object {
        @JvmField
        var PI = 3.1416F
        const val VERSION = 10
        @JvmStatic
        fun aStaticFunction() {
            println("This is a static function in Kotlin")
        }
    }
}
