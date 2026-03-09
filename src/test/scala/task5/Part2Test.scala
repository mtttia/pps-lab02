package task5

import it.unibo.pps.u02.Part2
import it.unibo.pps.u02.Part2.{checkRelation, curriedCheckRelation, neg}
import org.junit.Assert.{assertEquals, assertFalse, assertTrue}
import org.junit.Test

class Part2Test :
  @Test def testPositiveOnPositiveNumber(): Unit = {
    val positiveNumber: Int = 5
    val positiveString: String = "Positive"
    assertEquals(positiveString, Part2.positive(positiveNumber))
  }

  @Test def testPositiveOnNegativeNumber(): Unit = {
    val negativeNumber: Int = -1
    val negativeString: String = "Negative"
    assertEquals(negativeString, Part2.positive(negativeNumber))
  }

  @Test def testPositiveOnZero(): Unit = {
    val zeroNumber: Int = 0
    val positiveString: String = "Positive"
    assertEquals(positiveString, Part2.positive(zeroNumber))
  }

  @Test def testNegOnNonEmpty(): Unit = {
    val empty: String => Boolean = _ == ""
    val notEmpty = neg(empty)
    assertTrue(notEmpty("foo"))
    assertFalse(notEmpty(""))
    assertTrue(notEmpty("foo") && !notEmpty(""))
  }

  @Test def checkRelationTest(): Unit = {
    val x: Int = 3
    val y: Int = 4
    val z: Int = 4
    assertTrue(checkRelation(x,y,z))
  }

  @Test def checkRelationTestNotSatisfied(): Unit = {
    val x: Int = 3
    val y: Int = 5
    val z: Int = 4
    assertFalse(checkRelation(x,y,z))
  }

  @Test def checkCurriedRelationTest(): Unit = {
    val x: Int = 3
    val y: Int = 4
    val z: Int = 4
    assertTrue(curriedCheckRelation(x)(y)(z))
  }

  @Test def checkCurriedRelationTestNotSatisfied(): Unit = {
    val x: Int = 3
    val y: Int = 5
    val z: Int = 4
    assertFalse(curriedCheckRelation(x)(y)(z))
  }
