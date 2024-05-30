package org.example.lesson_3

fun main() {
    var lastName = "Андреева"
    val firstName = "Татьяна"
    val middleName = "Сергеевна"
    var age = 20

    var userInfo = "$lastName $firstName $middleName, $age"
    println(userInfo)

    lastName = "Сидорова"
    age = 22
    userInfo = "$lastName $firstName $middleName, $age"
    println(userInfo)
}