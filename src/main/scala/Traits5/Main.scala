package Traits5

// traits are types containing certain fields and methods
trait emptyTrait
class emptyClass extends emptyTrait

// trait with default implementation
trait Greeter{
  def greet(x : String) : Unit ={
    println("hello " + x)
  }
}
class defaultGreeter extends Greeter
class CustomGreeter(prefix : String, suffix : String) extends Greeter{
  override def greet(name : String): Unit ={
    println(prefix + " " + name + " " + suffix)
  }
}
trait GreeterWithNoDefault{
  def greet(x : String) : Unit
}
class CustomGreeter2 extends GreeterWithNoDefault{
  override def greet(name : String) : Unit = println("hello from GreeterWithNoDefault " + name)
}

object Main {
  def main(args: Array[String]): Unit = {
    // empty class obj with empty trait
    var value = new emptyClass()

    // class obj with default greeting implementation
    var obj = new defaultGreeter()
    obj.greet("Abhishek")

    // class obj with overridden greeting implementation
    var obj2 = new CustomGreeter(prefix = "Good Morning", suffix = "What are you doing")
    obj2.greet("Abhishek")

    // class obj with overridden greeting implementation
    var obj3 = new CustomGreeter2()
    obj3.greet("Abhishek")
  }
}
