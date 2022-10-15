fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()

    println(num2 in num3..num1 || num2 in num1..num3)
}
