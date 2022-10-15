fun checkSpeedLimit(speed: Int, limitOnTheRoad: Int = 60) {
    if (speed > limitOnTheRoad) {
        print("Exceeds the limit by ${speed - limitOnTheRoad} kilometers per hour")
    } else {
        print("Within the limit")
    }
}

fun main(args: Array<String>) {
    val actualSpeed = readLine()!!.toInt()
    val limitSpeed = readLine()!!

    if (limitSpeed == "no limit") {
        checkSpeedLimit(actualSpeed)
    } else {
        checkSpeedLimit(actualSpeed, limitSpeed.toInt())
    }
}