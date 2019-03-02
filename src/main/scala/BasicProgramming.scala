object BasicProgramming {

  import math._

  def isPerfectSquare(i : Int): Boolean ={

    val a = math.sqrt(i)

    a*a == i
/*    if(a == i*i)
      true
    else
      false*/
  }

  def isFibonacci(x:Int): Boolean ={

     isPerfectSquare(5*x*x + 4) || isPerfectSquare(5*x*x - 4)
  }



  def main(args: Array[String]): Unit = {


    var a = isFibonacci(11)
    println(a)
    var b = isFibonacci(13)
   // println((5*13*13 - 4))
    println(b)
/*
    val a = 5
    var m = 1
    for (i <- a to 2 by -1)
      m = m * i
    println("factorial of a is " + m)

    if (a>m || m>a) {

    }

    var pre = 0
    var curr = 1

    val a1 = 10

    println(pre)
    println(curr)

    for (i <- 1 to a1 by 1) {

      var res = pre + curr
      pre = curr
      curr = res
      println(res)
    }
*/

  }

}
