package oobasics

class Counter(val count: Int = 0) {

  def increment(): Counter =  new Counter(this.count + 1)
  def decrement : Counter = new Counter(this.count - 1)
  def increment(incrementBy: Int): Counter = new Counter(this.count + incrementBy)
  def decrement(decrementBy: Int): Counter = new Counter(this.count - decrementBy)

  override def toString = s"oobasics.Counter($count)"
}
