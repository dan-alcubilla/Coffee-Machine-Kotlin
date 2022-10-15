fun main() {
    val n = readLine()!!.toInt()
    var sumLarger = 0
    var sumSmaller = 0
    var sumPerfect = 0

    repeat(n) {
        when (readLine()!!.toInt()) {
            1 -> sumLarger++
            -1 -> sumSmaller++
            0 -> sumPerfect++
        }
    }

    print("$sumPerfect $sumLarger $sumSmaller")
}