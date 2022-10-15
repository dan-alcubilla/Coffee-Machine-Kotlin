package machine

const val ESPRESSO_WATER = 250
const val ESPRESSO_COFFEE = 16
const val ESPRESSO_MONEY = 4
const val LATTE_WATER = 350
const val LATTE_MILK = 75
const val LATTE_COFFEE = 20
const val LATTE_MONEY = 7
const val CAPPUCCINO_WATER = 200
const val CAPPUCCINO_MILK = 100
const val CAPPUCCINO_COFFEE = 12
const val CAPPUCCINO_MONEY = 6
const val CUPS = 1

fun coffeeMachineState(w: Int, m: Int, cb: Int, dc: Int, mo: Int) {
    println("The coffee machine has:")
    println("$w of water")
    println("$m of milk")
    println("$cb of coffee beans")
    println("$dc of disposable cups")
    println("$mo of money")
    println("")
}

fun main() {
    var water = 400
    var milk = 540
    var coffeeBeans = 120
    var disposableCups = 9
    var money = 550

    do {
        println("Write action (buy, fill, take, remaining, exit):")
        val action = readLine()!!
        when (action) {
            "buy" -> {
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
                val coffeeType = readLine()!!
                // Espresso
                if (coffeeType == "1") {
                    if (
                        water >= ESPRESSO_WATER
                        && coffeeBeans >= ESPRESSO_COFFEE
                        && disposableCups > 0
                    ) {
                        water -= ESPRESSO_WATER
                        coffeeBeans -= ESPRESSO_COFFEE
                        disposableCups -= CUPS
                        money += ESPRESSO_MONEY
                        println("I have enough resources, making you a coffee!")
                        println("")
                    } else {
                        val cupsWater = water / ESPRESSO_WATER
                        val cupsCoffee = coffeeBeans / ESPRESSO_COFFEE
                        var min = ""

                        if (cupsWater <= cupsCoffee) {
                            min = "water"
                        } else if (cupsCoffee <= cupsWater) {
                            min = "coffee"
                        }
                        println("Sorry, not enough $min!")
                        println("")
                    }
                }
                // Latte
                if (coffeeType == "2") {
                    if (
                        water >= LATTE_WATER
                        && milk >= LATTE_MILK
                        && coffeeBeans >= LATTE_COFFEE
                        && disposableCups > 0
                    ) {
                        water -= LATTE_WATER
                        milk -= LATTE_MILK
                        coffeeBeans -= LATTE_COFFEE
                        disposableCups -= CUPS
                        money += LATTE_MONEY
                        println("I have enough resources, making you a coffee!")
                        println("")
                    } else {
                        val cupsWater = water / LATTE_WATER
                        val cupsMilk = milk / LATTE_MILK
                        val cupsCoffee = coffeeBeans / LATTE_COFFEE
                        var min = ""

                        if (cupsWater <= cupsMilk && cupsWater <= cupsCoffee) {
                            min = "water"
                        } else if(cupsMilk <= cupsWater && cupsMilk <= cupsCoffee) {
                            min = "milk"
                        } else if (cupsCoffee <= cupsWater && cupsCoffee <= cupsMilk) {
                            min = "coffee"
                        }
                        println("Sorry, not enough $min!")
                        println("")
                    }
                }
                // Cappuccino
                if (coffeeType == "3") {
                    if (
                        water >= CAPPUCCINO_WATER
                        && milk >= CAPPUCCINO_MILK
                        && coffeeBeans >= CAPPUCCINO_COFFEE
                        && disposableCups > 0
                    ) {
                        water -= CAPPUCCINO_WATER
                        milk -= CAPPUCCINO_MILK
                        coffeeBeans -= CAPPUCCINO_COFFEE
                        disposableCups -= CUPS
                        money += CAPPUCCINO_MONEY
                        println("I have enough resources, making you a coffee!")
                        println("")
                    } else {
                        val cupsWater = water / CAPPUCCINO_WATER
                        val cupsMilk = milk / CAPPUCCINO_MILK
                        val cupsCoffee = coffeeBeans / CAPPUCCINO_COFFEE
                        var min = ""

                        if (cupsWater <= cupsMilk && cupsWater <= cupsCoffee) {
                            min = "water"
                        } else if(cupsMilk <= cupsWater && cupsMilk <= cupsCoffee) {
                            min = "milk"
                        } else if (cupsCoffee <= cupsWater && cupsCoffee <= cupsMilk) {
                            min = "coffee"
                        }
                        println("Sorry, not enough $min!")
                        println("")
                    }
                }
                if (coffeeType == "back") {
                    println("")
                    continue
                }
            }
            "fill" -> {
                println("Write how many ml of water do you want to add:")
                water += readLine()!!.toInt()
                println("Write how many ml of milk do you want to add:")
                milk += readLine()!!.toInt()
                println("Write how many grams of coffee beans do you want to add:")
                coffeeBeans += readLine()!!.toInt()
                println("Write how many disposable cups of coffee do you want to add:")
                disposableCups += readLine()!!.toInt()
            }
            "take" -> {
                println("I gave you \$$money")
                money = 0
                println("")
            }
            "remaining" -> {
                println("")
                coffeeMachineState(water, milk, coffeeBeans, disposableCups, money)
            }
        }
    } while (action != "exit")
}