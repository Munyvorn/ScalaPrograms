class CompareThreeNumber {

}
object CompareThreeNumber {
  def main(args: Array[String]) {
    println("Program to compare three numbers")
    println("Enter three different numbers: ")
    var b = scala.io.StdIn.readInt():Int
    var a = scala.io.StdIn.readInt():Int
    var c = scala.io.StdIn.readInt():Int
//    if(a>b &&b>c)
//      println(a+'\n'+b+'\n'+c)
//    else if(a>b&&b<c)
//      {
//        println(a+'\n'+c+'\n'+b)
//      }
//    else if(b>a&&a>c)
//      {
//        println(b+'\n'+a+'\n'+c)
//      }
//    else if(b>a&&a<c)
//      {
//        println(b+'\n'+c+'\n'+c)
//      }
    if(a>b)
      {
        if(a>c&&b>c)
            println(a+"\n"+b+"\n"+c)
        else if(a>c&&b<c)
            println(b+"\n"+c+"\n"+a)
        else if(a<c)
            println(c+"\n"+a+"\n"+b)
        else if(b==c)
            println(a+" "+b+" "+c)
        else if(a==c)
            println(a+" "+c+"\n"+b)
      }
    else if(b>a)
      {
        if(b>c&&a>c)
          println(b+"\n"+a+"\n"+c)
        else if(b>c&&a<c)
          println(b+"\n"+a+"\n"+c)
        else if(b<c)
          println(c+"\n"+b+"\n"+a)
        else if(b==c)
          println(a+" "+b+" "+c)
        else if(a==c)
          println(b+"\n"+a+" "+b)
      }
//    else if(a==b&&a>c)
//      println(a+" "+b+"\n"+c)
//    else if(a==b&&a<c)
//      println(c+"\n"+b+" "+a)
//    else if(a==c&&a>b)
//      println(a+" "+c+"\n"+b)
//    else if(a==c&&a<b)
//      println(b+"\n"+a+" "+b)
//    else if(b==c&&b>a)
//      println(b+" "+c+"\n"+a)
//    else if(b==c&&b<a)
//      println(a+" "+b+" "+c)
//    else if(a==b&&a==c)
//      println(a+" "+b+" "+c)
  }
}
