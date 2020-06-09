package Classes4

/*
    In this version of the Point class, the data is stored in private variables _x and _y.
    There are methods def x and def y for accessing the private data. def x_= and def y_= are for validating and setting the value of _x and _y.
    Notice the special syntax for the setters: the method has _= appended to the identifier of the getter and the parameters come after.
*/
class PointerNew {
  private var _x = 0
  private var _y = 0
  private val bound = 200

  def x: Int = _x

  def x_=(newvalue: Int): Unit = if (newvalue < bound) _x = newvalue else printWarning()

  def y: Int = _y

  def y_=(newvalue: Int): Unit = if (newvalue < bound) _y = newvalue else printWarning()

  private def printWarning(): Unit = println("Warning: Out of Bounds")

  override def toString = s"($x, $y)" // don't use $_x and $_y because it will give error
}


/*
    -   Constructor variables without declaration are val and not var.
            -   variables without declaration are val and not war
            -   variables without var and val are private by default
            -   variables with var and val are public
            -   variables must be declared with the type

*/

class Student(private var _name: String = "", private var _age: Int = -1) {
  def name_=(newname: String): Unit = _name = newname

  def age_=(newage: Int): Unit = _age = newage

  def name: String = _name

  def age: Int = _age

  override def toString = s"($name, $age)"
}
class ClassWithPrivateMemberDemo5 {
  def main(args: Array[String]): Unit = {
    val point = new PointerNew
    point.x = 100
    point.y = 201
    println(point)

    val studobj = new Student
    studobj.name = "Abhishek"
    studobj.age = 23
    println(studobj)
  }
}
