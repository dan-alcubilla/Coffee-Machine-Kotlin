// write your function here
fun sum(num1: Int, num2: Int, num3: Int): Int = num1 + num2 + num3

fun main() {    
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(sum(a, b, c))
}