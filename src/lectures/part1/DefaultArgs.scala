package lectures.part1

object DefaultArgs extends App {

  def tailRecFactorial(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else tailRecFactorial(n - 1, n * acc)
  }

  println(tailRecFactorial(10))
  // Sometimes we want to specify only specific args and give others default values.

  def multiply(a: Int = 2, b: Int = 9, c: Int = 22, d: Int = 12): Int = a * b * c * d

  println(multiply(c=1))

  // If we specify the arg name we dont need to care about the order.
}
