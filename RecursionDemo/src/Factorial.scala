class Factorial
{

}
object findFactorial{

  def main(args: Array[String]): Unit = {
    println("RECURSION: Finding Factorial of a Number")
    println("----------------------------\n")
    println("Enter an Integer: ")
    var a = scala.io.StdIn.readInt()
    print(a+"! = "+fact(a))

  }
  def fact(a:Int):Int =
  {
      if(a==1)
        {
          return 1
        }
      else
        {
          return a*fact(a-1)
        }
  }
}
