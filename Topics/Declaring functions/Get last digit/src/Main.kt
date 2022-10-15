// write your code here
fun getLastDigit(num: Int): Char {
    val lastDigit = num.toString()
    return lastDigit.last()
}
/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}