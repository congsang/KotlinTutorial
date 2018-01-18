// "Data class" purpose to hold data
data class User(var name: String, var age: Int) {

}

fun main(args: Array<String>) {
    val user = User(name = "Test Name", age = 18)
    println(user.toString())
    val backupUser = user.copy()
    user.age = 30
    println("After copy")
    println(user.toString())
    println(backupUser.toString())
    //"hashCode" = object's content
    println(backupUser.hashCode())
    println(user.hashCode())
    // if (user.hashCode() == backupUser.hashCode()) {
    if (user.equals(backupUser)) {
        println("2 objects have the same content")
    } else {
        println("2 objects have NOT the same content")
    }
}


