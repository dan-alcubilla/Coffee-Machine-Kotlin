const val FOUR = 4

fun main() {
    val number = readLine()!!.toInt()
    var numMax = Int.MIN_VALUE

    repeat(number) {
        val num = readLine()!!.toInt()
        if (num % FOUR == 0) if (num > numMax) numMax = num
    }
    println(numMax)
}