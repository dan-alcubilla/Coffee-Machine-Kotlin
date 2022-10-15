fun main() {
    val hourMoment1 = readLine()!!.toInt()
    val minuteMoment1 = readLine()!!.toInt()
    val secondMoment1 = readLine()!!.toInt()
    val hourMoment2 = readLine()!!.toInt()
    val minuteMoment2 = readLine()!!.toInt()
    val secondMoment2 = readLine()!!.toInt()

    val moment1TotalSeconds = secondMoment1 + minuteMoment1 * 60 + hourMoment1 * 3600
    val moment2TotalSeconds = secondMoment2 + minuteMoment2 * 60 + hourMoment2 * 3600

    println(moment2TotalSeconds - moment1TotalSeconds)
}