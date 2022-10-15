fun main() {
    val char1 = readLine()!!.first()

    println(char1.isUpperCase() || char1 in '\u0030'..'\u0039' && char1 != '0')
}