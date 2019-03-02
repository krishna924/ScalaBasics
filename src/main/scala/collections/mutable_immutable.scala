package collections

object mutable_immutable {

  def main(args: Array[String]): Unit = {

    val a = Traversable(1,3,4)

    val b = Array(1,2,3)
    var c = List(1,2,3)

    b(1)=4
    c = c :+ 9

    println(b)
    println(c)

    println((1 to 5).filter(_ % 2 == 0).reduce(_+_))

  }

}
