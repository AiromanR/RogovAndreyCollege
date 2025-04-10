package InternetShop

import InternetShop.Products.Product
import InternetShop.Products.Electronics as ElProduct
import InternetShop.Products.Clothing as ClProduct

class ProductManager(val name: String) {

    fun RegisterSale(order: Order) {
        println("Регистрация продажи:")
        println(order.OrderInfo())
    }

    fun AddCustomerToBlackList(customer: Customer) {
        customer.isBlacklisted = true
        println("Клиент ${customer.name} добавлен в черный список")
    }

    fun AddProduct(): Product {
        return try {
            print("Тип товара (1 - электроника, 2 - одежда): ")
            when (readln().toInt()) {
                1 -> AddElectronics()
                2 -> AddClothing()
                else -> AddProduct("Товар", 0.0, 0u)
            }
        } catch (e: Exception) {
            println("Ошибка: ${e.message}")
            AddProduct("Неизвестно", 0.0, 0u)
        }
    }

    private fun AddElectronics(): ElProduct {
        print("Введите название электроники: ")
        val name = readln()
        print("Введите цену: ")
        val price = readln().toDouble()
        print("Введите количество: ")
        val quantity = readln().toUInt()
        return ElProduct(name, price, quantity)
    }

    private fun AddClothing(): ClProduct {
        print("Введите название одежды: ")
        val name = readln()
        print("Введите цену: ")
        val price = readln().toDouble()
        print("Введите количество: ")
        val quantity = readln().toUInt()
        return ClProduct(name, price, quantity)
    }

    fun AddProduct(name: String, price: Double, quantity: UInt): Product {
        return Product(name, price, quantity)
    }
}