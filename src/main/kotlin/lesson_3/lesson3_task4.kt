package org.example.lesson_3

fun main() {
    var moveFrom = "E2"
    var moveTo = "E4"
    var moveNumber = 1

    var moveInfo = "$moveFrom-$moveTo,$moveNumber"

    println(moveInfo)

    moveFrom = "D2"
    moveTo = "D3"
    moveNumber++
    moveInfo = "$moveFrom-$moveTo,$moveNumber"

    println(moveInfo)
}