const val FIRST = 1
const val TENTH = 10
const val HUNDRETH = 100

fun main() {
    val numbers = MutableList(HUNDRETH) { 0 }
    numbers[0] = FIRST
    numbers[9] = TENTH
    numbers[99] = HUNDRETH

    // do not touch the lines below 
    println(numbers.joinToString())
}
