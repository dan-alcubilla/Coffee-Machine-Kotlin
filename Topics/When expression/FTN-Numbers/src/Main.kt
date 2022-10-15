fun main() {
    val f = mutableListOf(0, 1, 2, 3, 5, 8, 13, 21, 34, 55)
    val t = mutableListOf(0, 1, 3, 6, 10, 15, 21, 28, 36, 45)
    val p = mutableListOf(1, 10, 100, 1000, 10000, 100000)

    println(
        when (readLine()!!.toInt()) {
            in f -> "F"
            in t -> "T"
            in p -> "P"
            else -> "N"
        }
    )
}