package Collections.Lists

object Main {
  def main(args: Array[String]): Unit = {

    // Arrays are good but they have fixed length after they are instantiated and are immutable
    // for dynamic length array we use List
    // Scala list's are immutable as compared to Java list which is mutable
    val oneTwoThree = List(1, 2, 3)

    // use ::: for list concatenation
    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwo +" and "+ threeFour +" were not mutated.")
    println("Thus, "+ oneTwoThreeFour +" is a new list.")

    /*
        most common operator you will use with list is "::", which is
        pronounced as cons. Cons prepends a new element to the begining
        of an existing list

    */
    val threeFourFive = 5 :: threeFour
    println(threeFourFive)

    /*
    Note
    In the expression “ 1 :: twoThree ”, :: is a method of its right operand,
    the list, twoThree . You might suspect there’s something amiss with the
    associativity of the :: method, but it is actually a simple rule to
    remember: If a method is used in operator notation, such as a * b , the
    method is invoked on the left operand, as in a.*(b) —unless the method
    name ends in a colon. If the method name ends in a colon, the method is
    invoked on the right operand. Therefore, in 1 :: twoThree , the :: method
    is invoked on twoThree , passing in 1 , like this: twoThree.::(1) .
    */


    // initialising list using cons operator
    // Nil is used to signify empty list
    val helloworld = "hello" :: "world" :: Nil
    println(helloworld)

  }
}
