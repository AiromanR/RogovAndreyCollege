fun main() {
    try {
        print("Введите первое число (a): ")
        val a: Double = readln()!!.toDouble()
        print("Введите второе число (b): ")
        val b: Double = readln()!!.toDouble()
        print("Введите третье число (c): ")
        val c: Double = readln()!!.toDouble()

        val p = (a + b + c) / 3

        println("Среднее арифметическое: $p")
    } catch (e: NumberFormatException) {
        println("Неверный формат данных. Введите числа.")
    }
}