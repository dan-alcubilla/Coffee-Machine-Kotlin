fun main() {
    val num = readLine()!!.toInt()
    var max = Int.MIN_VALUE
    var answer = "YES"

    for (i in 1..num) {
        val number = readLine()!!.toInt()
        if (max > number) {
            answer = "NO"
            break
        }
        max = number
    }
    println(answer)
}