fun main() {
    try {
        print("Введите номер первого члена прогрессии (M): ")
        val M: Int = readln()!!.toInt()
        print("Введите значение члена прогрессии с номером M: ")
        val aM: Double = readln()!!.toDouble()
        print("Введите номер второго члена прогрессии (N): ")
        val N: Int = readln()!!.toInt()
        print("Введите значение члена прогрессии с номером N: ")
        val aN: Double = readln()!!.toDouble()

        if (M >= N) {
            println("Ошибка: M должно быть меньше N")
            return
        }
        val d = (aN - aM) / (N - M)
        val a1 = aM - (M - 1) * d
        val sum = (N - M + 1) * (aM + aN) / 2

        println("Сумма членов прогрессии с номерами от $M до $N: $sum")
    } catch (e: NumberFormatException) {
        println("Неверный формат данных. Введите числа.")
    }
}