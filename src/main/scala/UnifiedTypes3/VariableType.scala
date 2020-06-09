package UnifiedTypes3

/*
    TypeCasting in java
    Byte -> Short -> Int -> Long -> Float -> Double
    Char -> Int
*/
object VariableType{
  def main(args : Array[String]) : Unit ={

    var list : List[Any] = List(
      12,
      true,
      'c',
      "hello",
      () => "anonymous function returning a string"
    )
    list.foreach(element => println(element))

    // Int can be casted to Long
    val x : Int = 12345
    val y : Long =  x
    println(x + "\n" + y)

    //  Long can be casted to Int using toInt
    val z : Int = y.toInt
    println(z)

    /*
        -   Nothing is the subtype of all types, also called the Bottom type.
        -   There is no value that has type Nothing.
        -   A common use is to signal non termination such as a thrown exception, program exit, or infinite loop

        -   Null is a subtype of all reference types (i.e. any subtype of AnyRef)
        -   It has a single value identified by the keyword literal null
        -   Null is provided mostly for interoperability with other JVM languages and should almost never be used in Scala code
    */
  }
}
