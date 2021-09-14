package oobasics

object Test extends App {

  val myCounter = new Counter(5)
  println(myCounter)
  println(myCounter.decrement)
  println(myCounter.increment())
  println(myCounter.increment(4))
  println(myCounter.decrement(6))
  val newCounter = myCounter.decrement(7).decrement.increment(8)
  println(newCounter)
  println(newCounter.increment(5))
  val writer1 = new Writer("Rahul", "Rathore", 1997)
  val novel1 = new Novel("Ek Kahani Meri Bhi", 2029, writer1)
  println(writer1)
  println(writer1.getFullName)
  println(novel1.getAuthorAge)
  println(novel1.isWrittenBy(writer1))
  println(novel1.isWrittenBy(null))
  println(novel1.copy(2030))
}
