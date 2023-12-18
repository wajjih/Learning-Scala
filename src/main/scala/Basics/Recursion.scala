package Basics

import scala.annotation.tailrec

object Recursion extends App {
  def greeting(name: String, age: Int): String = s"name is ${name}, age is ${age}"

  //  def multiGreeting(n: Int): String = {
  //    def myGreeting(name: String, age: Int): String = s"name is ${name}, age is ${age}"
  //    
  //  }
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing Factorial of " + n + " - First I need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }

  factorial(4)
  println("----------")
  println(factorial(4))

  def anotherFactorial(i: Int): Int = {
    @tailrec
    def factHelper(x: Int, acc: Int): Int =
      if (x <= 1) acc
      else factHelper(x - 1, x * acc) // Tail Recursion = use recursive call as the LAST expression

    factHelper(i, 1)
  }

  println(anotherFactorial(100))


  @tailrec
  def greeting(name: String, n: Int, acc: String): String = {
    if (n <= 0) acc
    else greeting(name, n - 1, name + acc)
  }

  println(greeting("My name is wajjih and I am 21 years old", 3, ""))

}
