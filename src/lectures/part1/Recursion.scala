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

  println(goodFactorial(155))

  // If we want our compiler to check if our function is truly tail recursive we can put
  // a @tailrec annotation above the function and the compiler will tell us.
}
