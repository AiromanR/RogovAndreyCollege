fun main() {
    try {
        print("Введите количество пропущенных часов для первой группы (N1): ")
        val N1: Int = readln().toInt()
        print("Введите количество пропущенных часов для второй группы (N2): ")
        val N2: Int = readln().toInt()
        print("Введите количество пропущенных часов для третьей группы (N3): ")
        val N3: Int = readln().toInt()

        val minHours = minOf(N1, N2, N3)

        if (minHours < 10) {
            println("Есть хорошая группа")
        } else {
            println("Нет хорошей группы")
        }
    }
    catch(e: NumberFormatException) {
        println("Неверный формат данных. Введите целые числа.")
    }
}