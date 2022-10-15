import kotlin.system.exitProcess

fun main() {
    val num = readLine()!!.toInt()
    var max = num
    var cou = 1
    var cou2 = Int.MIN_VALUE

    if (num == 1) {
        val num2 = readLine()!!.toInt()
        println(1)
        return exitProcess(0)
    }

    for (i in 1..num) {
        val num2 = readLine()!!.toInt()
        if (num2 >= max) {
            max = num2
            cou++
        } else {
            if (cou > cou2) cou2 = cou
            max = num2
            cou = 1
        }
    }

    println(
        if (cou > cou2) cou else cou2
    )
}