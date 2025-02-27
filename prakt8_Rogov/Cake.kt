class Cake {
    var name: String = "name"
    var testo: String = "vidTes"
    var cream: String = "vidCre"
    var calories: Int = -1
    var price: Int = -1
    fun Zapolnenie(){
        try {
            print("Название пирожного: ")
            name = readln()
            print("Из какого теста: ")
            testo = readln()
            print("С каким кремом: ")
            cream = readln()
            while (calories == -1) {
                print("Калорийность на 100г: ")
                var n: Int = readln().toInt()
                when (n > 0){
                    true -> calories = n
                    else -> print("Введите положительное число\n")
                }
            }
            while (price == -1) {
                print("Цена: ")
                var n: Int = readln().toInt()
                when (n > 0){
                    true -> price = n
                    else -> print("Введите положительное число\n")
                }
            }
        }
        catch (e: Exception) {
            println("Неверный формат данных")
        }
    }
    fun Information(): String{
        return "Пирожное ${name}\nТесто: ${testo}\nКрем: ${cream}\nКалорийность: ${calories}\nЦена: ${price}"
    }
}