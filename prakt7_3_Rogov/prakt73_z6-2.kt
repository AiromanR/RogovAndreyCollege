fun main() {
    try {
        print("Введите трехзначное число K: ")
        val K: Int = readln()!!.toInt()

        if (K in 100..999) {
            val hundreds = K / 100
            val tens = (K / 10) % 10
            val units = K % 10

            val isIncreasing = hundreds < tens && tens < units
            val isDecreasing = hundreds > tens && tens > units

            if (isIncreasing) {
                println("Цифры числа $K образуют возрастающую последовательность.")
            } else if (isDecreasing) {
                println("Цифры числа $K образуют убывающую последовательность.")
            } else {
                println("Цифры числа $K не образуют упорядоченную последовательность.")
            }
        } else {
            println("Введено не трехзначное число.")
        }
    } catch (e: NumberFormatException) {
        println("Неверный формат данных. Введите целое число.")
    }
}