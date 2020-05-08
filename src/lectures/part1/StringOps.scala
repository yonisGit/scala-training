package lectures.part1

object StringOps extends App {

  val str: String = "Hello, my name is Michael Jordan!"

  println(str.charAt(4))
  println(str.startsWith("Hello"))
  // prepending & appending
  println("Wow" +: str :+ "!!!")
  println(str.reverse)
  println(str.take(5))

  // Scala Specific : String Interpolators.
  val name = "Michael"
  val age = 28
  val greeting = s"Hello, my name is $name and I am $age years old"
  val greetingNew = s"Hello, my name is $name and I will be ${age + 1} years old"
  println(greeting)
  println(greetingNew)

  // F - Interpolators
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute!"
  println(myth)

  // Raw - Interpolators
  // printed as is.
  println(raw"\n\n\n")
  // but the values injected to it with $ will be treated as regular.
  val regular = "hey!\nwatch this!"
  println(raw"$regular")
}

