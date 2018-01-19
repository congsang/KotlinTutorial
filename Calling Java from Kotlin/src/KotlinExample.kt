import java.util.*
import kotlin.collections.ArrayList

class Person(var name: String) : Cloneable {
    public override fun clone(): Any {
        val newObject = Person(this.name)
        return newObject
    }
}

fun main(args: Array<String>) {
    val list: List<Int> = Arrays.asList(1, 2, 3, 4, 5)
    val arrayList = ArrayList<Int>()
    // 'for' - loop work for Java collections
    for (item in list) {
        arrayList.add(item)
    }
    for (i in 0 until list.size - 1) {
        arrayList[i] = list[i] // get and set are called
    }

    val calendar = Calendar.getInstance()
    println("First day of week : ${calendar.getFirstDayOfWeek()}")
    println("First day of week : ${calendar.firstDayOfWeek}")

    val firstItem = list[0]
    val person = Person("Sang")
    val clonedPerson = person.clone()
    println("person = $person")
    println("clonedPerson = $clonedPerson")
}