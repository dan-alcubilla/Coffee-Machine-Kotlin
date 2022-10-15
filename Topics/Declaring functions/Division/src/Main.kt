// write your code here
fun divide(numerator: Long, denominator: Long): Double = numerator.toDouble() / denominator.toDouble()
/* Do not change code below */
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}