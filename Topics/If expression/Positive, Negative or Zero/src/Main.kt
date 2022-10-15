fun main() {
    val num = readLine()!!.toInt()

    print(
        if (num < 0) {
            "negative"
        } else if (num > 0) {
            "positive"
        } else {
            "zero"
        }
    )
}