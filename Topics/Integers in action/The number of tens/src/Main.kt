const val HUNDRED = 100
const val TEN = 10

fun main() {
    val num = readLine()!!.toInt()
    val mod = num % HUNDRED
    val div = mod / TEN
    print(div)
}
