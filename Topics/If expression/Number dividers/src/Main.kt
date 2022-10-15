fun main() {
    val m = readLine()!!.toInt()

    if (m % 2 == 0) println("Divided by 2")
    if (m % 3 == 0) println("Divided by 3")
    if (m % 5 == 0) println("Divided by 5")
    if (m % 6 == 0) println("Divided by 6")
}