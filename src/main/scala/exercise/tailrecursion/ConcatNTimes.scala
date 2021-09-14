package exercise.tailrecursion

/**
 * Concatenate a String n times using tail recursion
 */
object ConcatNTimes extends App{
  def concatenate(str: String ,n: Int): String = {
    def concatenateHelper(str: String, n: Int, accumulator: String): String ={
      if (n == 0 ) accumulator
      else concatenateHelper(str,n-1,accumulator+str)
    }
    concatenateHelper(str,n,"")
  }
  println(concatenate("Hi",5))
}
