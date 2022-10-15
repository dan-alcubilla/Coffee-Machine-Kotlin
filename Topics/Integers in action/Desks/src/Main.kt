fun desk(num: Int): Int {
    return if (num % 2 == 0) {
        num / 2
    } else {
        num / 2 + 1
    }
}

fun main() {
    println(desk(readLine()!!.toInt()) + desk(readLine()!!.toInt()) + desk(readLine()!!.toInt()))
}