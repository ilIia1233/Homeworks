package org.example.lesson_2

fun main() {
    val depositedMoney = 70000.0
    val percentAmount = 0.167
    val depositTime = 20

    var totalMoney = depositedMoney

    for (i in 1..depositTime) {
        totalMoney *= (1 + percentAmount)
    }

    println("%.3f".format(totalMoney))
}