open class Molochka(
    var name: String,
    var weight: Double,         // вес в граммах
    var fatContent: Double,     // жирность в процентах
    var manufacturer: String,   // производитель
    var price: Double          // цена в рублях
    )

{
    open fun GetInfo() {
        println("Название: $name")
        println("Вес: ${weight}г")
        println("Жирность: ${fatContent}%")
        println("Производитель: $manufacturer")
        println("Цена: ${price}р")
    }

    fun CalculatePricePerKg() {
        val pricePerKg = (price / weight) * 1000
        println("Цена за 1 кг: ${String.format("%.2f", pricePerKg)}р")
    }

    open fun CalculateShelfLife() {
        println("Введите срок годности в днях:")
        val shelfLife = readLine()!!.toInt()
        when {
            shelfLife <= 0 -> {
                println("Неверный срок годности")
                CalculateShelfLife()
            }
            shelfLife <= 3 -> println("Скоропортящийся продукт")
            shelfLife <= 10 -> println("Средний срок хранения")
            else -> println("Длительный срок хранения")
        }
    }
}