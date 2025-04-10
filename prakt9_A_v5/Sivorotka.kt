class Sivorotka(
    Name: String,
    Weight: Double,
    FatContent: Double,
    Manufacturer: String,
    Price: Double
) : Molochka(Name, Weight, FatContent, Manufacturer, Price) {

    var protein: Double = 0.0  // содержание белка

    init {
        println("Введите содержание белка в процентах:")
        protein = readLine()!!.toDouble()
    }

    // Проверка качества
    fun CheckQuality() {
        when {
            protein > 15 -> println("Высокое качество белка")
            protein > 10 -> println("Среднее качество белка")
            else -> println("Низкое качество белка")
        }
    }

    override fun GetInfo() {
        super.GetInfo()
        println("Содержание белка: ${protein}%")
    }

    override fun CalculateShelfLife() {
        println("Сывороточные продукты обычно имеют срок годности 7-14 дней")
        super.CalculateShelfLife()
    }
}