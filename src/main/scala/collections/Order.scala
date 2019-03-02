package collections

 case class Order(orderId: Int,
                  orderDate: String,
                  orderCustomerId: Int,
                  orderStatus: String
                  ) {



}

object Order {
  def main(args: Array[String]): Unit = {

    val os = List(
      Order(1, "2017-01-01", 100, "COMPLETE"),
      Order(2, "2017-01-01", 20, "CLOSED"),
      Order(3, "2017-01-01", 301, "PENDING"),
      Order(4, "2017-01-01", 202, "CLOSED"),
      Order(5, "2017-01-01", 3013, "COMPLETE"),
      Order(6, "2017-01-01", 203, "PENDING"),
      Order(7, "2017-01-01", 3014, "COMPLETE"),
      Order(8, "2017-01-01", 20, "NEW"),
      Order(9, "2017-01-01", 301, "PENDING"),
      Order(10, "2017-01-02", 2, "CLOSED"),
      Order(11, "2017-01-01", 1, "COMPLETE"),
      Order(12, "2017-01-01", 3, "NEW"),
      Order(13, "2017-01-03", 301, "COMPLETE")
    )

    //val a = os.sorted
    val b = os.sortBy(x => x.orderCustomerId)
    //println(b)

    //val c = os.sortBy(_.orderDate).foreach(println)
    //println(c)

    val d = os.sortWith((a, b) => {
      if(a.orderCustomerId > b.orderCustomerId)
        false
      else if(a.orderCustomerId < b.orderCustomerId)
        true
      else {
        if(a.orderId > b.orderId)
          false
        else
          true
      }
    }
    )

/*Group by*/

    val e = os.groupBy(x => x.orderStatus).map(x => (x._1,x._2.size)).foreach(println)
    //println(e)
  }
}