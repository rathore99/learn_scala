object FunctionsLearn extends App{
 def getName : String = "rahul"
  def parameterLessFunction :Int  = {42}
  def aFunction (a:String, b:Int) : String = a + " " + b
  def greeting (name:String, age: Int ): String =
    "Hi, My name is "+ name + " and I am "+ age +" years old."
  def concatStringNTimes(str: String, noOfTimes: Int) : String =
    {
      if(noOfTimes == 1)
        str
      else
      str + concatStringNTimes(str, noOfTimes-1)
    }
    def calculateFactorial(n: Int): Int = {
      if (n == 1 )
        n
      else
       n * calculateFactorial(n-1)
    }
  def nThFebonacciNumber(n: Int): Int = {
    if( n == 1)
      1
    else if( n == 2)
     1
    else
    nThFebonacciNumber(n-1) + nThFebonacciNumber( n - 2)
  }
  def checkPrime(n: Int): Boolean = {
    def divide(a: Int, b: Int): Boolean = {
       a % b == 0
    }
    var temp: Int  = n/2;
    if (divide( n, temp) )
      true
    else if( temp == 1)
      false
    else
    divide(n,temp -1)
  }
  println(getName)
  println(greeting("rahul",24))
  println(parameterLessFunction)
  println(aFunction("Hello",9))
  println(concatStringNTimes("hello",3))
  println("Factorial of 10 is " + calculateFactorial(10))
  println("7 febonacci number is " + nThFebonacciNumber(7))
}
