package Classes4

/*
    A minimal class definition is simply the keyword class and an identifier. Class names should be capitalized.
*/
class User

object MinimalClassDemo2 {
  def main(args : Array[String]): Unit = {
    val obj : User = new User
    println(obj)
  }
}
