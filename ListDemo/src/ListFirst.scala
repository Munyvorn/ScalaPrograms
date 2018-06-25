class ListFirst {

}
object ListFirst{
  def main(args: Array[String]) {
    import scala.collection.mutable.ListBuffer
    val fruit: List[String] = List("Apple","Banana")
    println(fruit)
    val fruit2 = "Fig" :: fruit
    println(fruit2)
    val fruit3 = "StrawBerry" :: fruit2
    println(fruit3)
    var fruits = new ListBuffer[String]()
    fruits += "Apple"
    fruits += "Banana"
    fruits += "Orange"
    println(fruits)
    var x = fruit3.slice(0,2)
    println(x)
    var (l,r) = fruit3.splitAt(2)
    println(l)
    println(r)
  }
}