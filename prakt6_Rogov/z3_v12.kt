fun main() {
    try {
        print("Введите количество пятерок (P): ")
        val P: Int = readln()!!.toInt()
        print("Введите количество четверок (CH): ")
        val CH: Int = readln()!!.toInt()
        print("Введите количество троек (TR): ")
        val TR: Int = readln()!!.toInt()
        print("Введите количество двоек (DV): ")
        val DV: Int = readln()!!.toInt()

        val totalGrades = P + CH + TR + DV
        val sumGrades = P * 5 + CH * 4 + TR * 3 + DV * 2
        val averageGrade = sumGrades.toDouble() / totalGrades
        println("Средний балл: " + averageGrade)
    } catch (e: NumberFormatException) {
        println("Неверный формат данных. Введите целые числа.")
    }
}