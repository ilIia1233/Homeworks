package org.example.lesson_1

fun main(){
    val year: Short = 1961
    var hour: Byte? = null
    var minute: Byte? = null

    println(year)
    println(hour)
    println(minute)

    hour = 9
    minute = 7
    print("0$hour:0$minute ")
    hour = 10
    minute = 55
    print("$hour:$minute")
}