package lectures.part1

object ValuesVariablesTypes extends App {
  val x: Int = 5 // val is immutable!!!
  // the type of val/var is optional! the compiler can infer the type for us.
  println(x)

  var y: Int = 8
  y = 9
  println(y)

  val aLong: Long = 324234234325423545L // The L at the end indicates this number is a long.
  val aFloat: Float = 2.02f // The f at the end indicates this number is a float and not double.
  // a float has precision of 7 digits after the '.' and a double has 15 (double from float).

}
