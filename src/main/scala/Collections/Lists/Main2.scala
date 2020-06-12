package Collections.Lists

object Main2 {
  def main(args: Array[String]): Unit = {
    // List methods

    // create empty list
    val value = List() // or value = Nil
    println("empty list " + value)

    // create a list with three values
    var first = List("Cool", "tools", "rule")
    println("list with three values\n" + first)

    // creates a list with three values
    first = "Will" :: "fill" :: "until" :: Nil
    println("list with cons operator\n" + first)

    // returns values at index 2
    println("returns values at index 2\n" + first(2))

    // counts the number of elements that have length 2
    println("counts the number of elements that have length 4\n" + first.count(s => s.length == 4))

    // returns list without its first two elements
    println("returns list without its first two elements\n" + first.drop(2))

    // returns list without its rightmost two elements
    println("returns list without its rightmost two elements\n" + first.dropRight(2))

    // determines a whether a string element with value until exists in the list
    println("determines a whether a string element with value until exists in the list\n"
      + first.contains("until"))

    // returns a list of all values that have length 4
    println("returns a list of all values that have length 4\n" + first.filter(s => s.length == 4))

    // checks whether all the elements in the list ends with l or not
    println("checks whether all the elements in the list ends with l or not\n" +
      first.forall(s => s.endsWith("l")))

    // executes print statement for all the elements
    println("executes print statements for all of the elements")
    first.foreach(println)

    // returns first element
    println("first element\n" + first.head)

    // returns the list except the last element
    println("returns the list except the last element\n" + first.init)

    // checks whether the list is empty or not
    println("checks whether the list is empty or not\n" + first.isEmpty)

    // returns the last element in the list
    Console println "returns the last element in the list\n" + first.last

    // returns a list by adding "y" to the end of the value
    println("returns a list by adding \"y\" to the end of the value\n" +
      first.map(s => s + "y"))

    // return a string from the list seperated by ","
    println("returns a string from the list seperated by \",\"\n" + (first mkString ","))

    // returns a list containing all the elements except those that have length 4
    println("returns a list containing all the elements except those that have length 4\n" +
      first.filterNot(s => s.length == 4))

    // reverses a list
    println("reverses a list\n" + first.reverse)

    // sorts and returns a list by first character
    println("sorts and returns a list by first character\n" +
      first.sortWith((a:String, b:String) => a.charAt(0).toLower < b.charAt(0).toLower))

    // returns the list except the first element
    println("returns a list except the first element\n" + first.tail)
  }
}
