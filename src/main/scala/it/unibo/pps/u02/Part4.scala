package it.unibo.pps.u02

import it.unibo.pps.u02.Part4.Expr.{Add, Literal, Multiply}

object Part4 {
  enum Expr:
    case Literal(number:Int)
    case Add(expr1:Expr, expr2: Expr)
    case Multiply(expr1:Expr, expr2: Expr)

  def evaluate(expr: Expr):Int = expr match
    case Literal(number) => number
    case Add(expr1, expr2) => evaluate(expr1) + evaluate(expr2)
    case Multiply(expr1, expr2) => evaluate(expr1) * evaluate(expr2)

  def show(expr:Expr):String = expr match {
    case Literal(number) => number.toString()
  }
}
