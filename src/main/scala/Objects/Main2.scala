package Objects

object Main2 extends App{
  // objects are single instances of their own definitions
  object IdFactory{
    private var counter : Int = 0
    def create() : Int ={
      counter += 1
      counter
    }
  }
  // Single instance is created even though we change the value many times
  val first = IdFactory.create()
  val second = IdFactory.create()
  println(first)
  println(second)
}
