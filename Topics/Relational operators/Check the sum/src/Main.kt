const val NUMBER = 20

fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()

    println(num1 + num2 == NUMBER || num1 + num3 == NUMBER || num2 + num3 == NUMBER)
}