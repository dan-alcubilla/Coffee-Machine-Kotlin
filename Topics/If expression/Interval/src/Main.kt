fun main() {
    val num = readLine()!!.toInt()
    print(if (num > -15 && num <= 12 || num in 15..16 || num >= 19) "True" else "False")
}