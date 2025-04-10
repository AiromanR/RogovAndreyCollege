import InternetShop.*

fun main() {
    print("Введите имя товароведа: ")
    val nameManager = readln()
    val manager = ProductManager(nameManager)

    val products = listOf(
        manager.AddProduct(),
        manager.AddProduct(),
        manager.AddProduct()
    )

    products.forEach { println(it.Info()) }

    val customer = Customer().apply {
        print("Введите имя заказчика: ")
        name = readln()
        print("Введите адрес заказчика: ")
        address = readln()
    }

    val order = customer.MakeOrder(products)
    println("Сумма заказа = ${order.totalPrice}")

    manager.RegisterSale(order)

    //Проверка на оплату
    print("Заказ оплачен? (да/нет)((если не оплатит то в чёрный список)): ")
    val isPaid = readln().equals("да", ignoreCase = true)
    if (!isPaid) {
        manager.AddCustomerToBlackList(customer)
    }
}
