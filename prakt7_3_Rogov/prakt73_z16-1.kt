fun main() {
    try {
        print("Введите скорость первого автомобиля (V1, км/ч): ")
        val V1: Double = readln()!!.toDouble()
        print("Введите скорость второго автомобиля (V2, км/ч): ")
        val V2: Double = readln()!!.toDouble()
        print("Введите начальное расстояние между автомобилями (S, км): ")
        val S: Double = readln()!!.toDouble()
        print("Введите время (t, часов): ")
        val t: Double = readln()!!.toDouble()

        val distance = S - (V1 + V2) * t

        if (distance < 0) {
            println("Автомобили уже встретились.")
        } else {
            println("Расстояние между автомобилями через $t часов: $distance км")
        }
    } catch (e: NumberFormatException) {
        println("Неверный формат данных. Пожалуйста, введите числа.")
    }
}