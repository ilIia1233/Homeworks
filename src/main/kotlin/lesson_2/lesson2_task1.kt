package org.example.lesson_2

fun main() {
    val mark1 = 3
    val mark2 = 4
    val mark3 = 3
    val mark4 = 5
    val amountOFMarks = 4

    val sumOfMarks = mark1 + mark2 + mark3 + mark4
    val average = sumOfMarks.toFloat() / amountOFMarks

    println(average)
}