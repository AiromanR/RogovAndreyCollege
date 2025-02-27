fun main() {
    try {
        print("Введите начальную скорость (V0): ")
        val V0: Double = readln()!!.toDouble()
        print("Введите ускорение (a): ")
        val a: Double = readln()!!.toDouble()
        print("Введите время (t): ")
        val t: Double = readln()!!.toDouble()

        val S = V0 * t + (a * t * t) / 2

        println("Расстояние, пройденное телом: $S")
    } catch (e: NumberFormatException) {
        println("Неверный формат данных. Введите числа.")
    }
}