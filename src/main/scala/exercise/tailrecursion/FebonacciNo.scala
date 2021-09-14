package exercise.tailrecursion

import scala.annotation.tailrec

object FibonacciNo extends App {

  def getNFibonacciNumber(n: Int): Int = {
    @tailrec
    def helper(n: Int, accumulator1: Int, accumulator2: Int): Int = {
      if (n <= 2) accumulator1 + accumulator2
      else helper(n - 1, accumulator2, accumulator1 + accumulator2)
    }

    helper(n, 0, 1)
  }

  @tailrec
  def iterateNthTimes(n: Int): Unit = {
    if (n == 0) ()
    else {
      println(n + " Fibonacci number is " + getNFibonacciNumber(n))
      iterateNthTimes(n - 1)
    }
  }

  iterateNthTimes(10)
}
