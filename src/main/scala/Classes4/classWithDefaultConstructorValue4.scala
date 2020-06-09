package Classes4

class Pointer(var x : Int = 10, var y : Int = 0){
  def move(dx : Int, dy : Int):Unit = {
    x += dx
    y += dy
  }

  override def toString: String = {
    super.toString
    s"($x, $y)"
  }
}
object classWithDefaultConstructorValue4 {
  def main(args : Array[String]): Unit = {
    val point : Pointer = new Pointer
    point.move(1, 2)
    println(point)
  }
}
