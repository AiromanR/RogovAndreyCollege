package InternetShop.Products

open class Product(
    open val name: String,
    open val price: Double,
    open var quantity: UInt
) {

    open fun Info(): String {
        return "Товар: $name, цена: $price, количество: $quantity"
    }
}

class Electronics(name: String, price: Double, quantity: UInt) : Product(name, price, quantity) {
    override fun Info(): String = "[Электроника] ${super.Info()}"
}

class Clothing(name: String, price: Double, quantity: UInt) : Product(name, price, quantity) {
    override fun Info(): String = "[Одежда] ${super.Info()}"
}