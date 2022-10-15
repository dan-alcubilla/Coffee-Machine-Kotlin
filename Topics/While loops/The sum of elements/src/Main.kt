fun main() {
    var sum = 0
    var num = 0

    do {
        num = readLine()!!.toInt()
        sum += num

    } while (num != 0)

    print(sum)
}