import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var max = Int.MIN_VALUE
    var pos = 0
    var cou = 0
    var out = false
    var num = 0

    while (!out) {
        cou++
        if (scanner.hasNextInt()) {
            num = scanner.nextInt()
        } else {
            out = true
        }
        if (num == max) {
            out = true
        } else if (num > max) {
            max = num
            pos = cou
        }
    }
    println("$max $pos")
}