package InternetShop
import InternetShop.Products.Product

open class Customer {
    var name: String = ""
    var address: String = ""
    var isBlacklisted: Boolean = false

    fun isInBlacklist(): Boolean = isBlacklisted

    fun MakeOrder(productList: List<Product>): Order {
        println("Доступные товары:")
        productList.forEachIndexed { index, product ->
            println("${index + 1}. ${product.Info()}")
        }

        val orderItems = mutableListOf<Product>()
        var totalPrice = 0.0

        while (true) {
            print("Введите номер товара (0 - завершить): ")
            val choice = readln().toIntOrNull() ?: continue

            when {
                choice == 0 -> break
                choice in 1..productList.size -> {
                    val product = productList[choice - 1]
                    orderItems.add(product)
                    totalPrice += product.price
                    println("Товар '${product.name}' добавлен в заказ")
                }
                else -> println("Неверный номер товара")
            }
        }

        return Order((1..1000).random().toUInt(), orderItems, totalPrice)
    }
}