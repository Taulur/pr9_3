
    package Merchendisers

    open class Merchandiser (var name : String, var unit : String, var price : Double, var type : String, var quantity : Int) {
        var blacklist = ""
        var profit = 0.0

    open fun Input() {
        try {
            println("Введите название товара")
            name = readln()
            do {
                println("Введите цену в рублях")
                price = readln()!!.toDouble()
            } while (price <= 0)
            println("Введите единицу измерения")
            unit = readln()
            do {
                println("Введите тип товара (Продукт | Мебель | Инструмент)")
                type = readln()
            } while (!(type == "Продукт") && !(type == "Мебель") && !(type == "Инструмент"))
            do {
                println("Введите количество товаров")
                quantity = readln()!!.toInt()
            } while (quantity <= 0)
        } catch (e: Exception) {
            println("Данные введены неверно")
        }
    }
    fun Output()
    {
        println("Название товара - ${name}")
        println("Цена товара - ${price} рублей")
        println("Единица измерения - ${unit}")
        println("Тип товара - ${type}")
        println("Количество товаров - ${quantity}")
        println("В черном списке - ${blacklist}")
        println("Заработок - ${profit}")
    }
        fun CanAfford(money : Double,buyername : String)
        {
            if (quantity * price > money)
            {
                blacklist = blacklist + "${buyername} "
            }
            else
            {
                profit = price * quantity
            }
        }
}