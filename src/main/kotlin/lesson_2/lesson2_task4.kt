package org.example.lesson_2

fun main() {
    val silverOre = 11
    val crystalOre = 7
    val buffModificator = 1.2f

    val modificatedSilverOre = silverOre * buffModificator
    val modificatedCrystalOre = crystalOre * buffModificator

    print(
        """
        Добыто серебряной руды: ${String.format("%.0f", modificatedSilverOre)}
        Добыто кристалической руды: ${String.format("%.0f", modificatedCrystalOre)}
    """.trimIndent()
    )
}