import Merchendisers.Merchandiser as NewMerchandiser
fun main() {
    try {
        var merchandiser1 = NewMerchandiser("unnamed","unnamed",0.0,"unnamed",0)
        merchandiser1.Input()
        var buyer1 = Buyer(merchandiser1.name,merchandiser1.unit,merchandiser1.price,merchandiser1.type,merchandiser1.quantity, money = 0.0,"unnamed")
        buyer1.Input()
        merchandiser1.CanAfford(buyer1.money,buyer1.buyername)
        merchandiser1.Output()
    }
    catch (e:Exception)
    {
        println("Данные введены неверно")
    }
}