package InternetShop

import InternetShop.Products.Product

class Order(
    val orderId: UInt,
    val items: List<Product>,
    val totalPrice: Double
) {
    fun OrderInfo(): String {
        val itemsInfo = items.joinToString("\n") { "  - ${it.Info()}" }
        return """
            |Заказ #$orderId
            |Товары:
            |$itemsInfo
            |Итого: $totalPrice руб.
        """.trimMargin()
    }
}