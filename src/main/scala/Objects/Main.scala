package Objects
/*
Singleton objects

Classes in scala cannot have static members, instead they have singleton objects

A singleton object looks like a class definition except instead of keyword class you use
the keyword object
*/
import scala.collection.mutable

class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte): Unit = sum += b
  def checksum(): Int = ~ (sum & 0xFF) + 1
}

/*
    When a singleton object shares the same name as that of the class then it is called
    that class's companion object.
    and the class is called the companion class for that singleton object

    A class and it's companion object can access each other private members

    A singleton object is more than a holder of static methods, however. It is a
    first-class object.

    Defining a singleton object doesn’t define a type (at the Scala level of
    abstraction). Given just a definition of object ChecksumAccumulator , you
    can’t make a variable of type ChecksumAccumulator . Rather, the type
    named ChecksumAccumulator is defined by the singleton object’s com-
    panion class. However, singleton objects extend a superclass and can mix
    in traits. Given each singleton object is an instance of its superclasses and
    mixed-in traits, you can invoke its methods via these types, refer to it from
    variables of these types, and pass it to methods expecting these types.


    One difference between classes and singleton objects is that singleton
    objects cannot take parameters, whereas classes can. Because you can’t instantiate
    a singleton object with the new keyword, you have no way to pass
    parameters to it. Each singleton object is implemented as an instance of
    a synthetic class referenced from a static variable, so they have the same
    initialization semantics as Java statics


    A singleton object that does not share the same name with a companion
    class is called a standalone object
*/
object ChecksumAccumulator{
  private val cache = mutable.Map[String, Int]()
  def calculate(s:String): Int = {
    if(cache.contains(s))
      cache(s)
    else{
      val acc = new ChecksumAccumulator
      for(c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    for(arg <- args)
      println(arg + " : " + ChecksumAccumulator.calculate(arg))
  }
}
