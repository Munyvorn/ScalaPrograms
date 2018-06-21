object printNum{
def main(Args: Array[String]){
print("Enter a number: ")
var a = scala.io.StdIn.readInt()
while(a>=0)
{
println(a)
a -=1
}
println("Happy")
}
} 
