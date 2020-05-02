package lectures.part1

object Functions extends App {

  def aFunction(a: String, b: Int): String =
    a + " " + b

  println(aFunction("hello", 8))

  def aCodeBlockFunction(a: String, b: Int): String = {
    a + " " + b
  }

  def repeatedFunction(str: String, n: Int): String = {
    if (n == 1) str
    else str + repeatedFunction(str, n - 1)
  }

  println(repeatedFunction("hello! ", 3))

  // in Scala we use recursive functions instead of loops.

  // we dont have to put return type on regular functions... but if the function is recursive we have to write the return type.

  def bigFunc(n: Int): Int = {
    def smallFunc(a: Int, b: Int): Int = a + b

    smallFunc(n, n - 1)
  }

  println(bigFunc(6))

  def greeting(name: String, age: Int): String = "Hi I am " + name + ", and I am " + age + " years old."

  println(greeting("yoni", 23))

  def factorial(n: Int): Int = {
    if (n == 1) 1
    else n * factorial(n - 1)
  }

  println(factorial(3))

  def fibonacci(n: Int): Int = {
    if (n <= 1) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  println(fibonacci(5))

  def isPrime(n: Int): Boolean = {
    def isPrimeTillNum(a: Int): Boolean = {
      if (a == 1) true
      else n % a != 0 && isPrimeTillNum(a - 1)
    }

    isPrimeTillNum(n / 2)
  }
  println(isPrime(11))
  
}
