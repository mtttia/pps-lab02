package it.unibo.pps.u02

import scala.annotation.tailrec

object Part3 {
  def power(base: Double, exponent: Int): Double = exponent match
    case _ if exponent == 0 => 1
    case _ => base * power(base, exponent-1)

  def _addNumberAsUnit(number: Int, toAdd: Int):Int = number * 10 + toAdd

  def _removeUnit(number:Int): Int = number / 10

  def _extractUnit(number:Int): Int = number % 10


  def reverseNumber(n: Int): Int = 
    @tailrec
    def _reverseNumberRecursion(remain: Int, accumulator: Int): Int = remain match
      case _ if remain < 10 => _addNumberAsUnit(accumulator, remain)
      case _ => _reverseNumberRecursion(_removeUnit(remain), _addNumberAsUnit(accumulator, _extractUnit(remain)))
    _reverseNumberRecursion(n, 0)
}
