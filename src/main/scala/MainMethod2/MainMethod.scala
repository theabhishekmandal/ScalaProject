package MainMethod2

/*
    Till now we were extending App to
    write programs, Now we will use main method to
    start the execution of our program

    The main method is the entry point of the program.
    The java virtual machine requires main method to named
    as main and take one argument, an array of Strings.

    The return type of the main method is Unit that is
    it is returning nothing.
*/
object MainMethod {
  def main(args : Array[String]) :Unit ={
    println("hello world")
  }
}
