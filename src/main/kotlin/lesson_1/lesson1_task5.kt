package org.example.lesson_1

fun main(){
    val seconds: Short = 6480
    val secInMinute = 60
    val minutes = seconds / secInMinute
    val hours = minutes / secInMinute
    val percentOfSeconds = seconds % secInMinute
    val percentOfMinutes = minutes % secInMinute

    println("%02d:%02d:%02d".format(hours, percentOfMinutes, percentOfSeconds))
}