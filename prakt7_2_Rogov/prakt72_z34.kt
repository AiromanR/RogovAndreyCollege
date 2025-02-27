fun main() {
    try {
        print("Введите коэффициент k: ")
        val k: Double = readln().toDouble()
        print("Введите коэффициент a: ")
        val a: Double = readln().toDouble()
        print("Введите коэффициент b: ")
        val b: Double = readln().toDouble()

        val discriminant = b * b + 4 * k * a

        when {
            discriminant > 0 -> {
                val x1 = (-b + Math.sqrt(discriminant)) / (2 * k)
                val x2 = (-b - Math.sqrt(discriminant)) / (2 * k)
                val y1 = k * x1 + b
                val y2 = k * x2 + b
                println("Две точки пересечения: (${x1}, ${y1}) и (${x2}, ${y2})")
            }
            discriminant == 0.0 -> {
                val x = -b / (2 * k)
                val y = k * x + b
                println("Одна точка пересечения: (${x}, ${y})")
            }
            else -> println("Точек пересечения нет.")
        }
    }
    catch(e: NumberFormatException) {
        println("Неверный формат данных. Введите числовые значения.")
    }
}