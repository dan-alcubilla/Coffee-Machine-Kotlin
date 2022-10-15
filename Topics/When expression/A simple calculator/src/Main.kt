fun main() {
    val (num1, operator, num2) = readLine()!!.split(" ")

    val a = num1.toLong()
    val c = num2.toLong()

    when (operator) {
        "+" -> print(a + c)
        "-" -> print(a - c)
        "*" -> print(a * c)
        "/" -> if (c.toInt() == 0) print("Division by 0!") else print(a / c)
        else -> print("Unknown operator")
    }
}
