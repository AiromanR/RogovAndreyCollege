fun main() {
    try {
        print("Введите число a: ")
        val a: Double = readln()!!.toDouble()
        print("Введите число b: ")
        val b: Double = readln()!!.toDouble()
        print("Введите число c: ")
        val c: Double = readln()!!.toDouble()

        val maxVal = maxOf(a, b, c)
        val minVal = minOf(a, b, c)
        val P = (maxVal + minVal) / 2

        println("P = $P")
    } catch (e: NumberFormatException) {
        println("Неверный формат данных. Введите числа.")
    }
}