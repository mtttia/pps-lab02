package it.unibo.pps.u02

object Part2 {

  def positive(number: Int):String = number match
    case n if n >= 0 => "Positive"
    case _ => "Negative"

  def neg(predicate: String => Boolean)(something: String):Boolean = predicate(something) match
    case pred if pred => false
    case _ => true

  def checkRelation(x: Int, y: Int, z:Int):Boolean = x <= y && y == z

  def curriedCheckRelation(x: Int)(y:Int)(z:Int):Boolean = x <= y && y == z

  val valCheckRelation: (Int, Int, Int)=>Boolean = (x,y,z) => x <= y && y == z

  val valCurriedCheckRelation: Int => Int => Int => Boolean = x => y => z => x <= y && y == z

  def compose(f: Int => Int, g: Int => Int)(x: Int): Int = f(g(x))
}