fun main() {
    val butter = readLine()!!.toInt()
    val isWeekend = readLine()!!.toBoolean()

    if (butter in 15..25 && isWeekend || butter in 10..20 && !isWeekend) {
        print(true)
    } else {
        print(false)
    }
}
