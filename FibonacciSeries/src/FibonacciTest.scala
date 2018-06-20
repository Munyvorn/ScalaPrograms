import scala.io.StdIn

class FibonacciTest {

}
object FibonacciTest{
  var a:Int=0
  var b:Int=1
  var temp:Int=0
  def main(args: Array[String]): Unit = {

    println("Enter a number: ")
    var n = StdIn.readInt():Int
    print("The Fibonacci series is: 0 1 ")
    for(i<-1 to n-2)
      {
//        temp = a
//        a = b
//        b = temp + b
        a = a + b
        b = a - b
        a = a - b
        b = a + b

        print(b+" " )

      }

  }

}
