package it.unibo.pps.u02

object Part3 {
  def power(base: Double, exponent: Int): Double = exponent match
    case _ if exponent == 0 => 1
    case _ => base * power(base, exponent-1)
}
