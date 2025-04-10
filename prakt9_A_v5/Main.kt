fun main() {
    try {
        println("Введите название, вес, жирность, производителя, цену")
        val product1 = Sivorotka(
            readLine()!!.toString(),
            readLine()!!.toDouble(),
            readLine()!!.toDouble(),
            readLine()!!.toString(),
            readLine()!!.toDouble()
        )

        when {
            (product1.weight <= 0) -> println("Неверный вес")
            (product1.fatContent < 0) -> println("Неверная жирность")
            (product1.price < 0) -> println("Неверная цена")
            else -> {
                product1.GetInfo()
                product1.CalculatePricePerKg()
                product1.CheckQuality()
                product1.CalculateShelfLife()
            }
        }

        println("---------------")
        println("Введите название, вес, жирность, производителя, цену")
        val product2 = Kislomolochnie(
            readLine()!!.toString(),
            readLine()!!.toDouble(),
            readLine()!!.toDouble(),
            readLine()!!.toString(),
            readLine()!!.toDouble()
        )

        when {
            (product2.weight <= 0) -> println("Неверный вес")
            (product2.fatContent < 0) -> println("Неверная жирность")
            (product2.price < 0) -> println("Неверная цена")
            else -> {
                product2.GetInfo()
                product2.CalculatePricePerKg()
                product2.CheckProbiotics()
                product2.CalculateShelfLife()
            }
        }

        println("----------------")
        println("Введите название, вес, жирность, производителя, цену")
        val product3 = Molochka(
            readLine()!!.toString(),
            readLine()!!.toDouble(),
            readLine()!!.toDouble(),
            readLine()!!.toString(),
            readLine()!!.toDouble()
        )

        when {
            (product3.weight <= 0) -> println("Неверный вес")
            (product3.fatContent < 0) -> println("Неверная жирность")
            (product3.price < 0) -> println("Неверная цена")
            else -> {
                product3.GetInfo()
                product3.CalculatePricePerKg()
                product3.CalculateShelfLife()
            }
        }
    } catch (e: Exception) {
        println("Неверный формат ввода")
    }
}
