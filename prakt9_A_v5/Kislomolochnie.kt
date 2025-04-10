class Kislomolochnie(
    Name: String,
    Weight: Double,
    FatContent: Double,
    Manufacturer: String,
    Price: Double
) : Molochka(Name, Weight, FatContent, Manufacturer, Price) {

    var hasProbiotics: Boolean = false  // наличие пробиотиков

    init {
        println("Содержит пробиотики? (1 - Да, 2 - Нет)")
        hasProbiotics = readLine()!!.toInt() == 1
    }

    // Проверка наличия пробиотиков
    fun CheckProbiotics() {
        if (hasProbiotics) {
            println("Продукт содержит полезные пробиотики")
        } else {
            println("Продукт не содержит пробиотиков")
        }
    }

    override fun GetInfo() {
        super.GetInfo()
        println("Содержит пробиотики: ${if (hasProbiotics) "Да" else "Нет"}")
    }

    override fun CalculateShelfLife() {
        println("Кисломолочные продукты обычно имеют срок годности 5-10 дней")
        super.CalculateShelfLife()
    }
}