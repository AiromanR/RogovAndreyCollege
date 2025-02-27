fun main() {
    try {
        print("Сколько видов пирожных будет в базе: ")
        val count = readln().toInt()
        when
        {
            count <= 0 -> println("Количество пирожных не может быть меньше 1")
            else -> {
                val cakes = Array(count) {
                    Cake()
                }
                for (i in 0..<count)
                {
                    cakes[i].Zapolnenie()
                }
                while (true) {
                    println("1. Информация о пирожном")
                    println("2. Закончить")
                    val x = readln().toInt()
                    when (x){
                        1 -> {
                            print("Номер пирожного: ")
                            val cak = readln().toInt()
                            when{
                                (cak in 1..count) -> println(cakes[cak-1].Information())
                                else -> println("Нет информации")
                            }
                        }
                        2 -> break
                        else -> println("Неизвестная команда")
                    }
                }
            }
        }
    }
    catch (e: Exception)
    {
        println("Неверный формат данных")
    }
}
