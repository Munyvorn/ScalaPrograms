class TwoStudentsScore {

}
object TwoStudentsScore{

  def main(args: Array[String]): Unit = {
//      var alice = Array(5,6,20,35)
//      var bob = Array(10,6,15,44)
//      var aPoint:Int=0
//      var bPoint:Int=0
//
//      println("Alice marks are: ")
//      for( x<- alice)
//          println(x)
//      println("Bob marks are: ")
//      for( x<- bob)
//          println(x)
//      println("-----------------")
//
//      for(i<-0 to (alice.length-1))
//        {
//          if(alice(i)!=bob(i))
//            print("1 ")
//        }
      println("Enter number of subjects to calculate: ")
       var n = scala.io.StdIn.readInt():Int
      var allice:Array[Int] = new Array[Int](n)
      var bob: Array[Int] = new Array[Int](n)
//      println("Enter number of subjects to calculate: ")
//      var n = scala.io.StdIn.readInt():Int
      println("Enter scores for first student: ")
      for(i<-0 to (n-1))
        {
          allice(i)=scala.io.StdIn.readInt():Int
        }
      println("Enter scores for second student: ")
      for(i<-0 to (n-1))
        {
          bob(i) = scala.io.StdIn.readInt():Int
        }
      println("The result is: ")
      for(i<-0 to (n-1))
        {
          if(allice(i)!=bob(i))
            print("1 ")
        }
  }
}
