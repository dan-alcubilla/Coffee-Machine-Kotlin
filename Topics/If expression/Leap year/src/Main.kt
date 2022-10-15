fun main() {
    val year = readLine()!!.toInt()

    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                println("Leap")
            } else {
                println("Regular")
            }
        } else {
            println("Leap")
        }
    } else {
        println("Regular")
    }
}