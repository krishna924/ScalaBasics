package Override

class AddFraction(val n : Int, val d: Int) {

  override def toString: String = n +"/"+d
  def result = n/d.toDouble

  def + (a: AddFraction) = {

    new AddFraction((n*a.d+d*a.n),d*a.d)

  }

  def - (b: AddFraction)={

    new AddFraction((n*b.d-d*b.n),d*b.d)

  }

  def * (c:AddFraction)={

    new AddFraction((n*c.n),(d*c.d))
  }

  def / (div: AddFraction)={
    new AddFraction((n*div.d),(d*div.n))
  }

}

object test{
  def main(args: Array[String]): Unit = {
    val o1 = new AddFraction(1,2)
    println(o1)
    val o2 = new AddFraction(3,4)
    println(o1+o2)
    //println(o2.result)
    println(o1-o2)
    println(o1*o2)
    println(o1/o2)
  }

}
