package org.example.lesson_3

fun main() {
    val moveInfo = "D2-D4;0"

    val moveParts = moveInfo.split(";", "-")
    val moveFrom = moveParts[0]
    val moveTo = moveParts[1]
    val moveNumber = moveParts[2]

    print(
        """
        Откуда: $moveFrom
        Куда: $moveTo
        Номер хода: $moveNumber
    """.trimIndent()
    )
}