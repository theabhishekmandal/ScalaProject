import scala.language.implicitConversions

/**
 * Creating a class Rational that represents number in form of n/d where n is numerator
 * and d is denominator. also d cannot be 0
 */

/*
class Rational(x : Int = 0, y : Int = 1) {
  /*
    you need to assign constructor variables to field variables. Otherwise, in below add
    method value.x and value.y won't be accessible

    Better way of doing this is prefix val or var in the constructor field names, to avoid
    writing these extra fields
   */
  val n : Int = x
  val d : Int = y
  if(y == 0) throw new IllegalArgumentException("denominator cannot be null")
  def add(value : Rational) : Rational = new Rational(this.n * value.d + value.n * this.d, value.d * d)
  override def toString: String = n + "/" + d
}
*/

class Rational(var numer : Int = 0, var denom : Int) {
  // Multiple constructors note that it does not have return type
  def this(x : Int) = this(x, 1)
  def this() = this(0, 1)


  if(denom == 0) throw new IllegalArgumentException("denominator cannot be null")
  private val g = gcd(this.numer.abs, this.denom.abs)

  // performing some operations on the constructor values after they are assigned
  this.numer = this.numer / g
  this.denom = this.denom / g

  def gcd(a : Int, b : Int) : Int = if(b == 0) a else gcd(b, a % b)

  // changing method to operators
//  def add(that : Rational) : Rational = new Rational(this.numer * that.denom + that.numer * this.denom, that.denom * denom)
  def +(that : Rational) : Rational = new Rational(this.numer * that.denom + that.numer * this.denom, that.denom * denom)
  def +(numer : Int) : Rational = new Rational(this.numer + numer, this.denom)

  def -(that : Rational) : Rational = new Rational(this.numer * that.denom - that.numer * this.denom, that.denom * denom)
  def -(numer : Int) : Rational = new Rational(this.numer - numer, this.denom)

  def *(that : Rational) : Rational = new Rational(this.numer * that.numer, this.denom * that.denom)
  def *(numer : Int) : Rational = new Rational(this.numer * numer, this.denom)

  def /(that : Rational) : Rational = new Rational(this.numer * that.denom, this.denom * that.numer)
  def /(numer : Int) : Rational = new Rational(this.numer, this.denom * numer)

  def lessThan(that : Rational) : Boolean = {
    this.numer * that.denom < that.numer * this.denom
  }
  def max(that : Rational) : Rational = if(this.lessThan(that)) that else this

  override def toString: String = numer + "/" + denom
}


object test{
  // this is necessary to work for 2 * rational number
  implicit def intToRational(x: Int) : Rational = new Rational(x)
  def main(args: Array[String]): Unit = {
    val arr = List(new Rational, new Rational(1), new Rational(1, 2), new Rational(5, 6))
    arr.foreach(println)
    println(arr(arr.length - 2).lessThan(arr.last))
    println(arr(arr.length - 2) + arr.last)
    println(arr(arr.length - 2) * arr.last)
    val one = new Rational(66, 42)
    println(one)

    val last = arr.last
    println(last * 2)
    println(2 * last)
  }
}
