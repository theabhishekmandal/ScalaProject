package FunctionAndMethods

object Main extends App{
  /*--------Functions-------*/
  // Functions are expression that take parameters
  // val addOne : Int = (x : Int) => // wrong syntax cannot assign type to function name
  val addOne = (x : Int) => {
    x + 1    // no need to type return
  }
  println(addOne(100))

  /*
      This will give error
      because anonymous functions
      have the formal parameter as
      val and not var.
      var mul = (x : Int) => {
          x = x * x
          x
      }
      println(mul(10 * 10))
 */

  /*--------Methods-------*/
  /*
       Methods look and behave something like functions
       Methods are defined using def keyword
  */

  // no parameters method
  def hello() : Unit = println("hello world")
  hello()

  // method without parenthesis
  def helloWithoutBrackets : Unit = println("hello world")

  // method with parameters and calling them using parameters
  def hello(greet : String, name : String) : String = {
    "Hey! " + greet + " how are you " + name
  }
  println(hello(greet = "Good Morning", name = "Abhishek"))

  // multi parenthesis command
  def addThenMultiply(x : Int, y : Int)(k : Int = 10) : Int = (x + y) * k
  println(addThenMultiply(1, 2)(3))
  println(addThenMultiply(1, 2)())

  // recursive methods
  def factorial(n : Int) : Int = {
    if(n <= 0)
      return 1
   n * factorial(n - 1)
  }
  println("factorial of 5 " + factorial(5))

}
