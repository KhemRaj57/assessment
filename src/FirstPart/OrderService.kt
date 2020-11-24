package FirstPart

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

}


fun main(args:Array<String>) {

    var orders=args
    var orderService= OrderService()
    orderService.placeOrder(orders)
}