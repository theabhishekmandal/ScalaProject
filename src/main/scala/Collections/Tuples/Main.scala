package Collections.Tuples

object Main {
  def main(args: Array[String]): Unit = {
    /*
     tuple is another container object.
     unlike lists tuples can contain different types of elements.
     Indexing in tuples starts from 1 and can be accessed by ._Number
     through ._1 we are acessing the field and not the method
 */
    val pair = (99, "hello world")
    println(pair._1 + " " + pair._2)

    val another = (1, 12.0, 'a', "something")
    println(another._1)
    println(another._2)
    println(another._3)
    println(another._4)
  }
}
