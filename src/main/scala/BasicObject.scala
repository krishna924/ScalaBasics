object BasicObject {


  def ncr(i: Int, j: Int): Int ={

    def fact(f:Int => Int,j:Int): Int ={

      if (j <= 1) 1 else f(j) * fact(f, j-1)

    }

    val a = (i:Int)=> i
    fact(a,i) / fact(a, (i-j))

  }

  def main(args: Array[String]): Unit = {

    println(ncr(5,3))


  }

}
