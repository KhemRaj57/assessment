package secondPart

class OrderService
{
    var appleCount:Int=0
    var orangeCount:Int=0
    var appleCost:Int=60
    var orangeCost:Int=25

    fun placeOrder(orders:Array<String>)
    {
        for(element in orders)
        {
            if(element.toUpperCase()=="APPLE")
            {
                this.appleCount++
            }
            if(element.toUpperCase()=="ORANGE")
            {
                this.orangeCount++
            }

        }

        this.calculatePrice(this.appleCount,this.orangeCount)

    }

    private fun calculatePrice(appleCount:Int, orangeCount:Int)
    {
        println("$"+(appleCount*this.appleCost+orangeCount*this.orangeCost).toDouble()/100)
    }

    fun getSimpleOfferDetail()
    {
        println("buy one get one free on Apples")
        println("3 for the price of 2 on Oranges")
    }

    fun applySimpleOffer(appleCount:Int,orangeCount:Int)
    {
        var offeredApples=this.appleCount*2
        var offeredOranges=this.orangeCount + this.orangeCount/2
        println("Offered Apple is  :  $offeredApples")
        println("Offered Orange is  :  $offeredOranges")
    }

}


fun main(args:Array<String>) {


    var orders=args
    var orderService=OrderService()
    orderService.placeOrder(orders)
    orderService.getSimpleOfferDetail()
    orderService.applySimpleOffer(orderService.appleCount,orderService.orangeCount)
}