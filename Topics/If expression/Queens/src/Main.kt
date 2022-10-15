import kotlin.math.abs

fun main() {
    val q1 = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    val q2 = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    if (
        q1[0] == q2[0] || q1[1] == q2[1] ||
        abs(q1[0] - q2[0]) == abs(q1[1] - q2[1])
    ) print("YES") else print("NO")
}