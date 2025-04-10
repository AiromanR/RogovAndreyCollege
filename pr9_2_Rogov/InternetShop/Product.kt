package InternetShop

class Product(val name: String,
              val price: Double,
              var quanity: UInt) {


    //Вывод информации о товаре
    fun Info(): String {
        return  "Товар: $name, цена: $price, количество: $quanity."
    }

}