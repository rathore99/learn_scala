object TailRecursion extends App{
  def factorial(n: Int): BigInt = {
    def factorialHelper(n: Int, accumulator: BigInt): BigInt = {
      if(n == 1) accumulator
      else factorialHelper(n - 1, n * accumulator)
    }
    factorialHelper(n,1)
  }
  println(factorial(5000))

}
