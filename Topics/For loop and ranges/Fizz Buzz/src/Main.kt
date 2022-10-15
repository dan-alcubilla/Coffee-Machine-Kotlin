const val FIZZ = 3
const val BUZZ = 5

fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()

    for (i in num1..num2) {
        if (i % FIZZ == 0 && i % BUZZ == 0) {
            println("FizzBuzz")
        } else if (i % BUZZ == 0) {
            println("Buzz")
        } else if (i % FIZZ == 0) {
            println("Fizz")
        } else println(i)
    }
}
