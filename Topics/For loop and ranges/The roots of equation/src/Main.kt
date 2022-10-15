const val MIN = 0
const val MAX = 1000

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()

    for (i in MIN..MAX) {
        if (a * (i * i * i) + b * (i * i) + c * i + d == 0) {
            println(i)
        }
    }
}