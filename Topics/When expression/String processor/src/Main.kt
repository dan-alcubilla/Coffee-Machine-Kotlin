fun main() {
    val str1 = readLine()!!
    val operator = readLine()!!
    val str2 = readLine()!!

    when (operator) {
        "equals" -> print(str1 == str2)
        "plus" -> print(str1 + str2)
        "endsWith" -> print(str1.endsWith(str2))
        else -> print("Unknown operation")
    }
}