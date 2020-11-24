package thirdPart

class OrderService
{
    var appleCount:Int=0
    var orangeCount:Int=0
    var appleCost:Int=60
    var orangeCost:Int=25

    fun placeOrder(orders:Array<String>)
    {
        if(orders.isEmpty())
        {
            println("Empty order cannot be place")
            return
        }
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

        var price:Double=this.calculatePrice(this.appleCount,this.orangeCount)
        var notificationHeader =" Your Order has been Placed Successfully"
        var orderDetail:String=" Apples : Qty= "+this.appleCount+"\n"+ "Oranges : Qty= "+this.orangeCount
        var mailService=MailServices()
        mailService.sendNotification(notificationHeader,orderDetail)


    }

    private fun calculatePrice(appleCount:Int, orangeCount:Int):Double
    {

        return (appleCount* appleCost +orangeCount* orangeCost).toDouble()/100

    }

    fun getSimpleOfferDetail()
    {
        println("buy one get one free on Apples")
        println("3 for the price of 2 on Oranges")
    }

    fun applySimpleOffer()
    {
        var offeredApples=this.appleCount*2
        var offeredOranges=this.orangeCount + this.orangeCount/2
        println("Offered Apple is  : $offeredApples")
        println("Offered Orange is  : $offeredOranges")
    }

}


fun main(args:Array<String>) {

    var orders=args
    var orderService=OrderService()
    orderService.placeOrder(orders)
    orderService.getSimpleOfferDetail()
    orderService.applySimpleOffer()
}