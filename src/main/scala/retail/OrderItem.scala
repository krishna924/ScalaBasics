package retail

class OrderItem (
                 var orderItemId: Int,
                 var  orderItemOrderId: Int,
                 var orderItemProductId: Int,
                 var orderItemQuantity: Int,
                 var orderItemSubtotal: Float,
                 var orderItemProductPrice: Float
                )
{
  require(
    orderItemSubtotal == orderItemQuantity * orderItemProductPrice, "Invalid orderItemSubtotal " + orderItemSubtotal
  )

  def this(
            orderItemId: Int,
            orderItemOrderId: Int,
            orderItemProductId: Int,
            orderItemQuantity: Int,

            orderItemProductPrice: Float
          ) = {
    // Invoking constructor
    this(
      orderItemId ,
      orderItemOrderId,
      orderItemProductId,
      orderItemQuantity,
      orderItemQuantity*orderItemProductPrice,
      orderItemProductPrice
    )

  }
  override def toString: String = "OrderItem(" +
    orderItemId +
    "," +
    orderItemOrderId +
    "," +
    orderItemProductId +
    "," +
    orderItemQuantity +
    "," +
    orderItemSubtotal +
    "," +
    orderItemProductPrice +
    ")"

}

object retail{

  def main(args: Array[String]): Unit = {
    val oi = new OrderItem(1, 1, 1, 2, 100, 50)
    println(oi)
    val ordItem = new OrderItem(2, 1, 3, 3, 50)
    println(ordItem)
  }

}
