package Classes4

class greet(prefix : String, suffix : String){
  def greet(name : String): Unit = {
    println(this.prefix + " " + name + " " + this.suffix)
  }
}
object SimpleClassDemo1 {
  def main(args: Array[String]): Unit = {
    val greetObj : greet = new greet(prefix = "Good Morning", suffix = "how are you")
    greetObj.greet("abhishek")
  }
}
