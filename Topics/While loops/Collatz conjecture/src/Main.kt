fun main() {
    var n = readLine()!!.toInt()
    var natural = 0

    if (n == 1) {
        print(1)
    } else {
        print(n)
        print(" ")
        while (n != 1) {
            natural = if (n % 2 == 0) {
                n / 2
            } else {
                n * 3 + 1
            }
            n = natural
            print("$n ")
        }
    }
}