package lectures.part1

object Expressions extends App {

  val x = 1 +2
  println(x)

  // Instructions (Tell the pc to do something) .Vs. Expressions (Has a value)

  // If in scala is only an expression!!! it returns a value and cant do things instead.

  // Everything in Scala is an Expression!!!

  var aVar =5
  val aWeirdValue = (aVar = 3) // Type is Unit === void and it looks like this : ()

  // the type will be of the value of the last expression
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }
}
