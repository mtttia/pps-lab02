package it.unibo.pps.u02

object Part2 extends App {

  def positive(number: Int):String = number match
    case n if n >= 0 => "Positive"
    case _ => "Negative"

  def neg(predicate: String => Boolean)(something: String):Boolean = predicate(something) match
    case pred if pred => false
    case _ => true

  def checkRelation(x: Int, y: Int, z:Int):Boolean = x <= y && y == z
}