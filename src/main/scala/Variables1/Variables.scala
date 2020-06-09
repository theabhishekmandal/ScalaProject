package Variables1

object Variables extends App{

  /*--------VARIABLES-------*/
  // expressions
  println(1 + 1)

  // val values are constants and cannot be reassigned
  val onePlusOne = 1 + 1
  println(onePlusOne)
  //onePlusOne = 67 will not compile


  //values can be inferred but can be specified explicitly
  val values : Int = 1
  //val values : String = 1 // throw error because cannot assign Int to String

  // variables are like values but you can reassign them
  var variable : Int = 12
  variable = 13

}