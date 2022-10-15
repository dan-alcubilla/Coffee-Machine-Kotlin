const val A = 5
const val B = 4
const val C = 3
const val D = 2

fun main() {
    val n = readLine()!!.toInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0

    repeat(n) {
        when (readLine()!!.toInt()) {
            D -> d++
            C -> c++
            B -> b++
            A -> a++
        }
    }
    print("$d $c $b $a")
}