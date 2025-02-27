fun main() {
    try {
        print("Введите значение x: ")
        val x: Double = readln()!!.toDouble()
        print("Введите значение y: ")
        val y: Double = readln()!!.toDouble()
        print("Введите значение z: ")
        val z: Double = readln()!!.toDouble()

        val verhA = Math.sqrt(Math.abs(x - 1)) - Math.cbrt(Math.abs(y))
        val nizA = 1 + (x * x) / 2 + (y * y) / 4
        val a = verhA / nizA

        val b = x * (Math.atan(z) + Math.exp(-(z + z)))

        println("a = $a")
        println("b = $b")
    } catch (e: NumberFormatException) {
        println("Неверный формат данных. Введите числа.")
    }
}