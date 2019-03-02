object Classes {

  class Department(departmentID : Int, departmentName : String){
    println("The department id is : " + departmentID +
    "The department name is : "+ departmentName)
    override def toString: String = "Department(" + departmentID + "," + departmentName + ")"

  }

  def main(args: Array[String]): Unit = {

    val a = new Department(1, "some shop")


  }

}
