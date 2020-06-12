package ArraysDemo

object Main {

  def demo() : Unit = {
    // creating array of length 3
    val greetings = new Array[String](3)
    greetings(0) = "Hello "
    greetings(1) = ", "
    greetings(2) = "world\n"

    for(i <- 0 to 2) print(greetings(i))


    // same as above code
    val greetStrings = new Array[String](3)
    greetStrings.update(0, "Hello")
    greetStrings.update(1, ", ")
    greetStrings.update(2, "world!\n")
    for (i <- 0.to(2))
      print(greetStrings.apply(i))


    /*
    as you can see above we are assigning a value to a final variable greetings.
    This is possible because when you define a variable with val, the variable
    can't be reassigned, but the object to which it still refers could potentially
    still be changed.

    The to in the for is a method that takes one Int argument. The code 0 to 2 is transformed
    into the method call (0).to(2)

    Note that this syntax only works if you explicitly specify the
    receiver of the method call. You cannot write “ println 10 ”, but you can
    write “ Console println 10


    Scala doesn’t technically have operator overloading, because it doesn’t
    actually have operators in the traditional sense. Instead, characters such as
    + , - , * , and / can be used in method names. Thus, when you typed 1 + 2
    into the Scala interpreter in Step 1, you were actually invoking a method
    named + on the Int object 1 , passing in 2 as a parameter

    Another important idea illustrated by this example will give you insight
    into why arrays are accessed with parentheses in Scala.

    Arrays are simply instances of classes like any other
    class in Scala. When you apply parentheses surrounding one or more values
    to a variable, Scala will transform the code into an invocation of a method
    named apply on that variable. So greetStrings(i) gets transformed into
    greetStrings.apply(i) .

    Thus accessing an element of an array in Scala
    is simply a method call like any other. This principle is not restricted to
    arrays: any application of an object to some arguments in parentheses will
    be transformed to an apply method call.


    greetStrings(0) = "Hello"
    will be transformed into:
    greetStrings.update(0, "Hello")

    Scala achieves a conceptual simplicity by treating everything, from ar-
    rays to expressions, as objects with methods. You don’t have to remember
    special cases, such as the differences in Java between primitive and their cor-
    responding wrapper types, or between arrays and regular objects.

    The Scala compiler uses Java arrays, primitive types, and native arithmetic where possible
    in the compiled code.

    */

    // Creating and initialising array
    val numNames = Array("one", "two", "three")

    val numNames2 = Array.apply("one", "two", "three")

    /*
    what you are actually doing above is calling a factory method, named apply which creates
    and returns a new array. This apply method takes variable number of arguments and is defined
    in Array companion object.
    */
  }

  def main(args: Array[String]): Unit = {

  }
}
