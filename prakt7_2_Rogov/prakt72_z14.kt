fun main() {
    try {
        print("Введите целое число x: ")
        var x: Int = readln()!!.toInt()
        print("Введите целое число y: ")
        val y: Int = readln()!!.toInt()
        print("Введите целое число m: ")
        val m: Int = readln()!!.toInt()
        print("Введите целое число n: ")
        val n: Int = readln()!!.toInt()

        val raznost = x - y
        val ostat = m % n

        if (raznost < ostat) {
            x += 1
        }

        println("Результат: x = $x")
    } catch (e: NumberFormatException) {
        println("Неверный формат данных. Введите целые числа.")
    }
}