fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    var result: Long = 1

    for (i in num1 until num2) {
        result *= i
    }

    print(result)
}