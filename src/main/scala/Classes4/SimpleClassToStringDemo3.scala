package Classes4

class Point(var x: Int, var y: Int) {
  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString = s"($x, $y)"
}

object SimpleClassToStringDemo3 {
  def main(args: Array[String]): Unit = {
    var obj = new Pointer(x = 10, y = 20)
    println(obj.x)
    obj.move(20, 10)
    println(obj)
  }
}


