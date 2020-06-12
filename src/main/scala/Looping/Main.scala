package Looping

import java.io.File
import java.util

import scala.collection.mutable.ListBuffer
import scala.util.Random
object Main {

  def simpleLooping() : Unit = {
    val list = new ListBuffer[String]
    val rand = new Random
    val n = rand.nextInt(10)
    for(_ <- 0 until n){
      val arr = new Array[Int](rand.nextInt(20))
      for(i <- arr.indices)
        arr(i) = rand.nextInt(20)
      list += "\n" + util.Arrays.toString(arr)
    }
    println(list)
  }

 def loopingBy2() : Unit = {
   val rand = new Random
   println("printing alternate numbers")
   var br : StringBuilder = null
   for(i <- 0 until rand.nextInt(20) by 2) {
     if(br == null){
       br = new StringBuilder("[")
     }
     else{
       br.append(", ")
     }
     br.append(i)
   }
   if(br == null) br = new StringBuilder("[]") else br.append("]")
   println(br)
 }

  def reverseLooping() : Unit = {
    val rand = new Random
    println("printing alternate elements reverse order")
    val n = 10 + rand.nextInt(20)
    var br : StringBuilder = null
    for(i <- n to 0 by -1) {
      if(br == null){
        br = new StringBuilder("[")
      }
      else{
        br.append(", ")
      }
      br.append(i)
    }
    br.append("]")
    println(br)
  }

  def whileLooping() : Unit = {
    var n = 0
    while(n < 10){
      n += 1
    }
    println("did nothing in while loop")
  }

  def loopingAgain() : Unit = {
    // adding if condition inside loop
    for(i <- 1 to 10 if i % 2 == 0) println(i)

    val filesHere = new File("./src/main/scala/").listFiles()
    for(file <- filesHere if file.isFile && file.getName.endsWith(".scala")) println(file)

    // nested iteration
    println("nested iteration")
    val getLines = (file : File) => {
      val source = scala.io.Source.fromFile(file)
      val list = source.getLines().toList
      source.close()
      list
    }

    /*
    using for loop without curly braces
    for(file <- filesHere
        if file.isFile && file.getName.endsWith(".scala");
        line <- getLines(file)
        if line.contains("Rational")
        ) println(line)

     */

    /*
       for loop with curly braces and it has advantage over the above one
       as you can omit the semicolon
     */
    for{file <- filesHere
        if file.isFile && file.getName.endsWith(".scala")
        line <- getLines(file)
        if line.contains("Rational")
        } println(line)
  }

  def main(args: Array[String]): Unit = {
    simpleLooping()
    loopingBy2()
    reverseLooping()
    Array(1, 2, 3, 4).foreach(println)
    loopingAgain()
  }
}
