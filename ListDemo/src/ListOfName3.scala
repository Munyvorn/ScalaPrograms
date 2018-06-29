
class ListOfName3 {

}
object ListOfName3 {

  def main(args: Array[String]): Unit = {
    println("Program to print YES if the name is of four characters otherwise print NO ")
    println("------------------------------------------------------------------------")
    println("Enter the number of name: ")
    var n = scala.io.StdIn.readInt():Int
    var myList = List():List[String]
    for(i<- 0 to (n-1))
    {
      var name = scala.io.StdIn.readLine("Enter a name: "):String
      myList = name :: myList
      if(name.length>=3)
      {
        println("YES")
      }
      else
        println("No")
    }
  }
}
