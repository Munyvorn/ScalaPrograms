import scala.collection.mutable.ListBuffer

class CountConAndVowel {

}
object CountConAndVowel{

  def main(args: Array[String]): Unit = {
    println("Enter a line of String: ")
    var i:Int=0
    var j:Int=0
    var k:Int=0
    var countCon:Int =0
    var countVow:Int =0
    var str = scala.io.StdIn.readLine() : String
    val chars = Array[Char](30)
    var a:Int=1
    var e:Int=1
    var character = new ListBuffer[String]()
    character: scala.collection.mutable.ListBuffer[String]= ListBuffer()
    character += "Apple"
    scala.collection.mutable.ListBuffer[String] = ListBuffer(Apple)
    str.toCharArray()


//    for(i<-0 to str.length()-1)
//      {
//        for(j<-0 to str.length()-1)
//          {
//            var k:Int=0
//            if(str.charAt(i)==str.charAt(j))
//              {
//                str.charAt(i) =
//              }
//          }
//      }
    for(i<-0 to str.length()-1)
    {
      if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
      {

        countVow = countVow+1

      }
      else if((str.charAt(i)>='A'&&str.charAt(i)<='Z'||str.charAt(i)>='a'&&str.charAt(i)<'z')&& (!(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')))
      {
        countCon = countCon+1
      }
    }
    println("The number of Consonant is: "+countCon)
    println("The number of Vowel is: "+countVow)

  }


}
