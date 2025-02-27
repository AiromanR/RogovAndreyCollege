fun main() {
    try {
        print("Введите коэффициент a: ")
        val a: Double = readln()!!.toDouble()
        print("Введите коэффициент b: ")
        val b: Double = readln()!!.toDouble()
        print("Введите коэффициент c: ")
        val c: Double = readln()!!.toDouble()
        print("Введите начало отрезка u: ")
        val u: Double = readln()!!.toDouble()
        print("Введите конец отрезка v: ")
        val v: Double = readln()!!.toDouble()

        val VershX = -b / (2 * a)

        val yU = a * u * u + b * u + c
        val yV = a * v * v + b * v + c
        
        val yVersh = if (VershX in u..v) a * VershX * VershX + b * VershX + c else null
        
        var minY = Math.min(yU, yV)
        var maxY = Math.max(yU, yV)

        minY = Math.min(minY, yVersh!!.toDouble())
        maxY = Math.max(maxY, yVersh)

        println("Минимальное значение функции на отрезке [$u, $v]: $minY")
        println("Максимальное значение функции на отрезке [$u, $v]: $maxY")
    } catch (e: NumberFormatException) {
        println("Неверный формат данных. Пожалуйста, введите числа.")
    }
}