fun main() {
    var max = Int.MIN_VALUE
    var num = 0

    do {
        num = readLine()!!.toInt()
        if (num > max) max = num
    } while (num != 0)

    print(max)
}