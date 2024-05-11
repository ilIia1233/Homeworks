package org.example.lesson_2

fun main(){
    val minuteInHour = 60
    val tripLength = 457
    var hour = 9
    var minute = 39
    val minuteInTotal = minute + tripLength

    hour += minuteInTotal / minuteInHour
    minute = minuteInTotal % minuteInHour

    println("$hour:$minute")

}