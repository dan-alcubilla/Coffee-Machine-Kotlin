fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()

    println(num1 in num2..num3 || num1 in num3..num2)
}