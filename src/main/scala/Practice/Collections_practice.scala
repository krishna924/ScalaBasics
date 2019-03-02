package Practice
import scala.math.BigDecimal

import org.graalvm.compiler.graph.Node.Input

import scala.io.Source

object Collections_practice {

  //Users/krishna/IJSolutions/Datals2014.rtf

  def getData(fileName: String): List[String] = {

    val results = Source.fromFile(fileName).getLines.toList
    results
    //println(results.getClass)

  }

  def NOTA_Num (result : List[String]): Unit ={
    val NOTA_Rec: Seq[String] = result.filter(x => x.split("\t")(2) == "None of the Above")
    /*NOTA_Rec.take(100).foreach(println)
    println("******************")*/
    val NOTA_num = NOTA_Rec.map(x => x.split("\t")).groupBy(cols => cols(0)).mapValues(x => x.size).toSeq.sortBy( r => -r._2)
    NOTA_num.foreach(println)

  }

  def Dist_Const (result : List[String]): Unit ={

  val dist_sonstituencies = result.map(x => x.split("\t")(1)).distinct
    dist_sonstituencies.foreach(println)
    println("***********************************************************************************")

  }

  def Num_Const_perState (result : List[String]): Unit ={

    val a =  result.map(x => x.split("\t")).groupBy(a => a(0)).map(x => (x._1, (x._2.map(x => x(1))).distinct.size)).toSeq.sortBy(e => -e._2)
    a.take(100).foreach(println)
    println("***********************************************************************************")


  }

  def Num_Seats_PerState (result : List[String]): Unit ={

    val a = result.map(x=> x.split("\t")).groupBy((a => a(0))).map(c => (c._1, (c._2).map(x=> (x(6),1))))
    val b = a.map(x => (x._1, x._2.groupBy(_._1).mapValues(x => x.size).toSeq.sortBy(a => -a._2)))
    b.take(100).foreach(println)
    println()
  }


  def NoVotes_perParty(result : List[String]): Unit ={

    // number of votes per party across all the constituencies / total number of votes all the constituencies
    val avl_votes = result.filter(x => x.split("\t")(2) != "None of the Above")
    val nVotes_pParty = avl_votes.map(x=> x.split("\t")).groupBy(x => x(6)).mapValues(x => x.size)
    val total_count = avl_votes.size
    println(total_count)
    val output = nVotes_pParty.map(x => (x._1, (BigDecimal((x._2.toInt/total_count.toInt)*100)).toFloat))
    output.take(100).foreach(println)
    val a = 3/7845
    println(BigDecimal(a))
  }




case class test_r (col1:String,col2:Seq[Array[String]])
  def main(args: Array[String]): Unit = {

    val result = getData("//Users/krishna/IJSolutions/Data/ls2014.tsv")
    result.take(10).foreach(println)
    println("***********************************************************************************")
    //NOTA_Num(result)
    //Dist_Const(result)
    //Num_Const_perState(result)
    //Num_Seats_PerState(result)
    NoVotes_perParty(result)

  }

}
