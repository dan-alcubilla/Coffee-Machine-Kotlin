fun concatStrings(s1: String, s2: String, s3: String, sep: String = " ") {
    println("$s1$sep$s2$sep$s3")
}

fun main() {
    val a = readLine()!!
    val b = readLine()!!
    val c = readLine()!!
    val d = readLine()!!
    if (d == "NO SEPARATOR") {
        concatStrings(a, b, c)
    } else {
        concatStrings(a, b, c, d)
    }
}