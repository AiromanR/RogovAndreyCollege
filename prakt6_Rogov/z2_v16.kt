fun main() {
    try {
        print("Введите первое число: ")
        val num1: Int = readln()!!.toInt()
        print("Введите второе число: ")
        val num2: Int = readln()!!.toInt()
        print("Введите третье число: ")
        val num3: Int = readln()!!.toInt()

        val middle = when {
            (num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3) -> num1
            (num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3) -> num2
            else -> num3
        }

        println("Среднее число: $middle")
    } catch (e: NumberFormatException) {
        println("Неверный формат данных")
    }
}