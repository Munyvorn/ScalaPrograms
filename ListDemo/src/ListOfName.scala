class ListOfName {

}
object ListOfName {
  def main(args: Array[String]): Unit = {


    println("Program to print names start with 'A' ")
    println("------------------------------------")
    var myList = List(): List[String]
    print("Enter The Total number of name: ")
    var n = scala.io.StdIn.readInt(): Int
    var i: Int = 0
    for (i <- 0 to n-1) {
      println("Enter a name: ")
      var name = scala.io.StdIn.readLine(): String
      myList = name :: myList
    }
    println(myList)
    println("Names that start with 'A' are: ")
    for (i <- 0 to (myList.length-1)) {
      if (myList(i).startsWith("A")) {
        print(myList(i) + " ")
      }
      // use for each to assign all the element.
    }
  }
}
