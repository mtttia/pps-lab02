package it.unibo.pps.u02

object Part2 extends App {

  def positive(number: Int):String = number match
    case n if n >= 0 => "Positive"
    case _ => "Negative"

  println("The number 5 is: " + positive(5))
  println("The number -1 is: " + positive(-1))

  def neg(predicate: String => Boolean)(something: String):Boolean = predicate(something) match
    case pred if pred => false
    case _ => true

  val empty: String => Boolean = _ == ""
  val notEmpty = neg(empty)
  println(notEmpty("foo")) // true
  println(notEmpty("")) // false
  println(notEmpty("foo") && !notEmpty("")) // true.. a comprehensive test
}