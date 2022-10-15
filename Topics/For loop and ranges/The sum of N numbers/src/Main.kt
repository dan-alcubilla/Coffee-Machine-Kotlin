fun main() {
    val num1 = readLine()!!.toInt()

    var sum = 0

    for (i in 1..num1) {
        val num2 = readLine()!!.toInt()
        sum += num2
    }
    print(sum)
}