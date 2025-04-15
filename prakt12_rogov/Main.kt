import kotlinx.coroutines.*

suspend fun main(){
    try{
        println("Введите количество функций(n): ")
        val n = readLine()!!.toInt()
        var result: String = ""
        val jobs = List(n) { index ->
            GlobalScope.launch {

                result = result + nFunction(index)+"\n"
            }
        }
        runBlocking {
            delay(7000L)
            println(result)
        }
    }
    catch(e:Exception){
        println("Неверный формат данных")
    }
}
suspend fun nFunction(index: Int) : String {
    return "Функция $index выполнена"
}