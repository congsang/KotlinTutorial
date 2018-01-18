fun main(args: Array<String>) {
    // if clause
    println("if clause")
    var a: Double = 8.2
    var b: Double = 5.3
    if (a >= b)
        println("a is larger than equal b")
    else
        println("a is smaller than equal b")

    var aString = if (a > b) "large" else "smaller"
    println("aString = $aString")

    // "when" as a variable
    var c: Char = 'a'
    var stringResult: String = when (c) {
        'a' -> "First character of the alphabet"
        'z' -> "Last character of the alphabet"
        else -> "other character"
    }
    println("stringResult = $stringResult")

    // use "when" as a function
    fun checkNumber(inputNumber: Int) = when (inputNumber) {
        0 -> {
            println("do something...")
            println("this is zero")
        }
        1, 2 -> {
            println("one or two")
        }
        in 3..10 -> println("a few, serveral")
        else -> println("many")
    }
    checkNumber(9)

    // for loop
    val intNumbers: Array<Int> = arrayOf(11, 22, 43, 55)
    println("for loop")
    for (index in intNumbers) {
        println("intNumber = $index")
    }

    println("using indices")
    for (index in intNumbers.indices) {
        println("Value at index = $index is ${intNumbers[index]}")
    }

    // using index, value pair
    println("using index, value pair")
    for ((index, value) in intNumbers.withIndex()) {
        println("value at index = $index is $value")
    }

    // while loop
    println("while loop")
    var x: Long = 10
    while (x > 0) {
        x--
        println("x = $x")
    }
}