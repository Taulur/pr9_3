import Merchendisers.*
class Buyer (name : String, unit : String, price : Double, type : String, quantity : Int, var money : Double, var buyername : String) : Merchandiser(name,unit,price,type,quantity)
{
    override fun Input() {
        try {
        println("Введите имя покупателя")
        buyername = readln()
            do {
            println("Введите количество денег покупателя")
            money = readln()!!.toDouble()
            } while (money <= 0)
        } catch (e: Exception) {
            println("Данные введены неверно")
        }
    }
}