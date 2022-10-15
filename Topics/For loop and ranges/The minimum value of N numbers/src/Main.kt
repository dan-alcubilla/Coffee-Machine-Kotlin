fun main() {
    val num1 = readLine()!!.toInt()
    var temp = Int.MAX_VALUE

    for (i in 1..num1) {
        val num2 = readLine()!!.toInt()
        if (num2 < temp) temp = num2
    }
    print(temp)
}