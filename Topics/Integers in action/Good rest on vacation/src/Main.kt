fun calculateTotalSum(
    days: Int,
    food: Int,
    flight: Int,
    hotel: Int
): Int = days * food + (days - 1) * hotel + flight * 2

fun main() {
    val durationDays = readLine()!!.toInt()
    val foodCostPerDay = readLine()!!.toInt()
    val flightCost = readLine()!!.toInt()
    val oneNightHotel = readLine()!!.toInt()

    println(calculateTotalSum(durationDays, foodCostPerDay, flightCost, oneNightHotel))
}
