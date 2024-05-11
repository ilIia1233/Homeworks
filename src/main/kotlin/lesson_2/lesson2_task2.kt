package org.example.lesson_2

fun main(){
    val companyWorkers = 50
    val companyInterns = 30
    val workerSalary = 30000
    val internSalary = 20000
    val allEmployees = companyInterns + companyWorkers

    val workersCost = companyWorkers * workerSalary
    val allCost = companyInterns * internSalary + workersCost
    val averageSalary = allCost / allEmployees

    print("""
        $workersCost
        $allCost
        $averageSalary
    """.trimIndent())

}