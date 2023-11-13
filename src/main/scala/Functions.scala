object Functions extends App{

  def greeting(name:String,age:Int):String = s"Hi, my name is ${name} and I am ${age} years old."
  println(greeting("Wajjih", 21))

  def factorial(n:Int):Int = {
    if(n<=0) 1
    else n*factorial(n-1)
  }
  println(factorial(5))

  def fibonacci(n:Int):Int={
    if(n<=2)1
    else fibonacci(n-1) + fibonacci(n-2)
  }

  println(fibonacci(8))

  def isPrime(n:Int):Boolean = {
    def isPrimeUntil(t:Int): Boolean =
      if(t <=1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n/2)
  }
  println(isPrime(3))

}
