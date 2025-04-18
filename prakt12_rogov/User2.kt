class User {
    var nickname = ""
    var password = ""
    var countReposi = 0

    fun userSet(){
        try {
            println("Введите имя пользователя")
            nickname = readLine()!!
            println("Введите токен(пароль)")
            password = readLine()!!
            println("Введите количество репозиториев")
            countReposi = readLine()!!.toInt()
        }
        catch (e:Exception){
            println("Неверный формат")
        }
    }
    fun userGet(user: User){
        println("Имя пользователя: ${user.nickname}\nТокен(пароль): ${user.password}\nКоличество репозиториев: ${user.countReposi}\n")
    }
}