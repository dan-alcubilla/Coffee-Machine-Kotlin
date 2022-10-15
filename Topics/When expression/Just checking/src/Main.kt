fun main() {
    println(
        when (readLine()!!.toInt()) {
            1 -> "No!"
            2 -> "Yes!"
            3 -> "No!"
            4 -> "No!"
            else -> "Unknown number"
        }
    )
}