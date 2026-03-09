package task5

import it.unibo.pps.u02.Part4.{Expr, evaluate, show}
import org.junit.Assert.assertEquals
import org.junit.Test

class Part4Test {

  @Test def testEvaluateLiteral(): Unit = {
    val expression: Expr = Expr.Literal(6)
    val result: Int = 6
    assertEquals(result, evaluate(expression))
  }

  @Test def testEvaluateAdd(): Unit = {
    val expression:Expr = Expr.Add(Expr.Literal(6), Expr.Literal(4))
    val result: Int = 10
    assertEquals(result, evaluate(expression))
  }

  @Test def testEvaluateMultiply(): Unit = {
    val expression: Expr = Expr.Multiply(Expr.Literal(6), Expr.Literal(4))
    val result: Int = 24
    assertEquals(result, evaluate(expression))
  }

  @Test def testEvaluateComplexExpression(): Unit = {
    // (6+4)*5 = 50
    val expression:Expr = Expr.Multiply(Expr.Add(Expr.Literal(6), Expr.Literal(4)), Expr.Literal(5))
    val result:Int = 50
    assertEquals(result, evaluate(expression))
  }

  @Test def testShowLiteral(): Unit = {
    val expression: Expr = Expr.Literal(6)
    val result: String = "6"
    assertEquals(result, show(expression))
  }

  @Test def testShowAdd(): Unit = {
    val expression: Expr = Expr.Add(Expr.Literal(6), Expr.Literal(4))
    val result: String = "(6 + 4)"
    assertEquals(result, show(expression))
  }

  @Test def testShowMultiply(): Unit = {
    val expression: Expr = Expr.Multiply(Expr.Literal(6), Expr.Literal(4))
    val result: String = "6 * 4"
    assertEquals(result, show(expression))
  }

}
