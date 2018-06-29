class Functions {

}
object Functions {
  import scala.util.control.Breaks._
  def square(n:Int):Int={
    return n*n
  }
  def sumOfSquare(n:Int,m:Int):Int = {
    return ((n*n)+(m*m))
  }
  def guess(n:Int,x:Int):Unit = {
   if(x==square(n) || x==square(n)-1 || x== square(n)+1)
     {
       println("*********************")
       println("Good Job, Well Played")
       break
     }
    else
     println((n*n)-x)
  }

  def main(args: Array[String]){

    print("Enter a number: ")
    //variable declaration
    var bool = true:Boolean
    var a= scala.io.StdIn.readInt():Int
    //calling square function and print the result
    println("Square of "+a+" is: "+square(a))
    print("Enter another number: ")
    //calling sumOfSquare function and print the result
    var b = scala.io.StdIn.readInt():Int
    println("The sum of "+a+" squared and "+b+" squared is: "+sumOfSquare(a,b))
    //last function
    println("--------------------------------------------------")
    println("It's time to have some fun with SQUARE of a NUMBER")
    print("Enter an Integer: ")
    var c = scala.io.StdIn.readInt():Int
    guess2(c)
//    breakable {
//      while (bool) {
//        print("Enter a guessing number: ")
//        var d = scala.io.StdIn.readInt(): Int
//        guess(c, d)
//      }
//    }
  }
  def guess2(n:Int):Unit={
    println("Enter a guessing number: ")
    var x = scala.io.StdIn.readInt():Int
    if(x==square(n) || x==square(n)-1 || x == square(n)+1)
      {
        println("*************")
        println("There you go!")
      }
    else {
      println(square(n)-x)
      guess2(n)
    }
  }
}
