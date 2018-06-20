
  object Foobar
  {
    def main(args: Array[String]): Unit = {
       var i = 1;
        var n = scala.io.StdIn.readInt()
      for(i <- 1 to n)
        {
          if(i%15!=0)
            {
              if(i%3==0)
                {
                  println("foo")
                }
              else if(i%5==0)
                {
                  println("bar")
                }
              else
                {
                  println(i)
                }
            }
          else
            {
              println("foobar")
            }
        }
    }
  }
