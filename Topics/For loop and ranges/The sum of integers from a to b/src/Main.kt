fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()

    var sum = 0

    for (i in num1..num2) {
        sum += i
    }

    print(sum)
}