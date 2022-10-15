import kotlin.math.pow
const val HUNDRED = 100

fun compoundInterest(startingAmount: Int = 1000, yearlyPercent: Double = 5.0, years: Int = 10) {
    val result = startingAmount * (1 + yearlyPercent / HUNDRED).pow(years)
    println(result.toInt())
}

fun main() {

    when (readLine()!!) {
        "amount" -> compoundInterest(startingAmount = readLine()!!.toInt())
        "percent" -> compoundInterest(yearlyPercent = readLine()!!.toDouble())
        "years" -> compoundInterest(years = readLine()!!.toInt())
    }
}