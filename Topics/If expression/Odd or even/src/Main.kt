fun main() {
    val num = readLine()!!.toInt()

    print(
        if (num % 2 == 0) "EVEN" else "ODD"
    )
}