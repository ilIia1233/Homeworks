package org.example.lesson_1

fun main(){
    val seconds: Short = 6480
    /*так сам котлин предложил исправить, хотя я не пойму почему он не может просто посчитать.
   Значение ответа 108 что <128 и >-128, так что должно быть все ок*/
    val minutes: Byte = (seconds / 60).toByte()
    val hours: Byte = (minutes / 60).toByte()
    val percentOfSeconds: Byte = (seconds % 60).toByte()
    val percentOfMinutes: Byte = (minutes % 60).toByte()

    print("0$hours:$percentOfMinutes:0$percentOfSeconds")

}