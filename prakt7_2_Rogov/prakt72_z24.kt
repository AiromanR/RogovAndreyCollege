fun main() {
    try {
        print("Введите координату x: ")
        val x: Double = readln().toDouble()
        print("Введите координату y: ")
        val y: Double = readln().toDouble()

        when {
            x > 0 && y > 0 -> println("Точка находится в первой координатной четверти.")
            x < 0 && y > 0 -> println("Точка находится во второй координатной четверти.")
            x < 0 && y < 0 -> println("Точка находится в третьей координатной четверти.")
            x > 0 && y < 0 -> println("Точка находится в четвертой координатной четверти.")
            x == 0.0 && y == 0.0 -> println("Точка находится в начале координат.")
            x == 0.0 -> println("Точка находится на оси Y.")
            y == 0.0 -> println("Точка находится на оси X.")
        }
    }
    catch(e: NumberFormatException) {
        println("Неверный формат данных. Введите числовые значения.")
    }
}