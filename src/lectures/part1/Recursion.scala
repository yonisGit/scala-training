package lectures.part1

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Compute factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }

  println(factorial(15))
  // With this implementation of factorial we keep every calculation that waits for an answer
  // in our stack. If we will call factorial(3000) we will get
  // Stack Overflow which means our recursive depth is too big and our stack is full.


  // With this goodFactorial implementation we avoid this problem.
  def goodFactorial(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator) // TAIL RECURSION - use recursive calls as the last expression
    }

    factorialHelper(n, 1)
  }

  // println(goodFactorial(155))

  // If we want our compiler to check if our function is truly tail recursive we can put
  // a @tailrec annotation above the function and the compiler will tell us.

  @tailrec
  def concatString(str: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else concatString(str, n - 1, str + accumulator)
  }

  println(concatString("hello ", 5, ""))


  def isPrime(n: Int): Boolean = {
    @tailrec
    def helper(divider: Int, acc: Boolean): Boolean = {
      if (!acc) false
      else if (divider <= 1) true
      else helper((divider - 1), (n % divider != 0) && acc)
    }

    helper(n / 2, true)
  }

  println(isPrime(11))


  def fibonacci(n: Int): Int = {
    @tailrec
    def fibHelper(index: Int, last: Int, nextToLast: Int): Int = {
      if (index >= n) last
      else fibHelper(index + 1, nextToLast + last, last)
    }

    if (n <= 2) 1
    else fibHelper(2, 1, 1)
  }

  println(fibonacci(9))
}
