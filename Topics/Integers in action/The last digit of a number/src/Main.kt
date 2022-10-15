const val DIGIT = 10

fun main() {
    val num = readLine()!!.toInt()
    val result = num % DIGIT
    print(result)
}
