fun main() {
    val num = readLine()!!.toInt()
    if (num == 1) {
        val number = readLine()!!.toInt()
        println(number)
    } else {
        val numbers = MutableList(num) { readLine()!!.toInt() }
        numbers.sortDescending()
        println(numbers[0] * numbers[1])
    }
}