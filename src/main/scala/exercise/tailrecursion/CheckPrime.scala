package exercise.tailrecursion

/**
 * check given number is prime or not using tail
 * recursion
 */
object CheckPrime extends App{

  def isPrime(n: Int): Boolean = {
    def helper(n: Int, divisor: Int): Boolean = {
      true
    }
    helper(n,n/2)
  }

}
