class ListOfList {

}
object ListOfList {
  def main(args: Array[String]): Unit = {

    var AList  = List("Apple","Coconut"): List[String]
    var BList  = List(): List[List[String]]
    var CList  = List(): List[List[List[String]]]
    var DList  = List(): List[List[List[List[String]]]]
    var EList  = List(): List[List[List[List[List[String]]]]]
    var AList2 = List("Book","Pen")
    BList = AList :: AList2:: Nil
    CList = BList :: Nil
    DList = CList :: Nil
    EList = DList :: Nil
    println(EList)
    println(BList.flatten)
    println(EList.flatten.flatten.flatten.flatten)
    println(EList.flatten.flatten.flatten.flatten.mkString(" "))
    var HList = EList.flatten.flatten.flatten.flatten
    //printing particular elements
    println(HList.slice(1,3).mkString(" "))
    println(HList(0)+" ^^^^ "+ HList(1))

    var FList: List[List[String]] = List(List("Apple","Banana"), List("Coca Cola","Sprite"))
    print(FList.flatten+"\n")
    var GList= List() : List[Any]
    val input = scala.io.StdIn.readLine("Input ANYTHING :\n")
    GList = input :: Nil
    println(GList)

  }
}