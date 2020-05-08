package lectures.part1

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  // in the calledByValue we get same values, because the argument is computed before the function evaluates.
  // while in calledByName the argument is passed to the function 'as is' and the is being evaluated every time.

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  printFirst(34, infinite())
  // Because the second value is called by name, it wont get calculated before its called.
}
