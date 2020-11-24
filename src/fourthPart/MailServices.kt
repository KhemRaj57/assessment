package fourthPart

class MailServices
{
    var heading:String=""
    var content:String=""
    fun sendNotification(message:String,heading:String)
    {
        println(" Heading: $heading")
        println(" Content: $message")
    }
}
