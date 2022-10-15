import kotlin.math.abs

fun main() {
    val k1 = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    val k2 = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    if (
        abs(k2[1] - k1[1]) == 1 && abs(k2[0] - k1[0]) == 2 ||
        abs(k2[1] - k1[1]) == 2 && abs(k2[0] - k1[0]) == 1
    ) print("YES") else print("NO")
}