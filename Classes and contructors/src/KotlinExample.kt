class Person(val firstName: String, val lastName: String, var age: Int?) {
    private var fullName = "$firstName $lastName"

    //initializer blocks
    init {
        println("Initialized with firstName: $this.firstName, lastName: $lastName, age: $age")
    }

    fun talk(message: String = "") {
        // println("$fullName says $message")
        println("$firstName $lastName says $message")
    }
}

fun main(args: Array<String>) {
    val person = Person(firstName = "Nguyen", lastName = "Cong Sang", age = 10)
    println("Function details. Firstname = ${person.firstName}, lastName = ${person.lastName}, age = ${person.age}")
    //person.fullName
    person.talk("Good morning")
}