import kotlinx.coroutines.*

suspend fun main(){
    try{
        var UsersList = arrayListOf<User>()
        var count = 0

        println("Введите количество пользователей(базово 1)")
        count = readLine()!!.toInt();
        when {
            count < 1 -> count = 1
        }

        GlobalScope.launch {
            for(i in 1..count){
                val polzovat = User();
                polzovat.userSet()
                UsersList.add(polzovat)
                println("Пользователь номер ${i} загружен")
            }
        }

        runBlocking { delay(15000L) }

        println("[1] - Блокировка\n[2] - Загрузить пользователей")
        val otv = readLine()!!
        when(otv)
        {
            "1" -> runBlocking { delay(15000L) }
            "2" -> for(user in UsersList.sortedBy{ it.countReposi }){
                user.userGet(user)
            }
        }
    }
    catch(e:Exception){
        println("Неверный формат данных")
    }
}