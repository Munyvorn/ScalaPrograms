class ConcatList {

}
object ListDemo2 {
  def main(args: Array[String]) {
    def isOdd(num: Int): Boolean = num % 2 == 1

    val list1 = List(1, 2, 3, 4, 5, 6)
    val list2 = List(10, 20, 30, 15, 25, 35)
    val list3 = (list1 ::: list2).reverse
    println(list3)
    var list4 =List():List[Int]
    println("Odd numbers are: ")
    for (n <- list3) {
      if (isOdd(n)) {
        list4 = n :: list4
      }
    }
    println(list4)
    //adding all lists
    var listAll = List():List[List[Int]]
    listAll = list1 :: (list2:: (list3::(list4::Nil)))
    println(listAll)
    // convert a list into a string
    val list5 = list1.mkString("")
    println(list5)
    // print all elements of a list except the last one
    var list6 = List():List[Int]
    for(n<- list1)
      {
        if(n!=list1.length)
        list6= n :: list6
      }
    println(list6.reverse)
    println(list6.reverse.init)

  }
}