package task5

import it.unibo.pps.u02.Part2
import it.unibo.pps.u02.Part2.{checkRelation, compose, curriedCheckRelation, neg, valCheckRelation, valCurriedCheckRelation}
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

  @Test def testCheckRelation(): Unit = {
    val x: Int = 3
    val y: Int = 4
    val z: Int = 4
    assertTrue(checkRelation(x,y,z))
  }

  @Test def testCheckRelationTestNotSatisfied(): Unit = {
    val x: Int = 3
    val y: Int = 5
    val z: Int = 4
    assertFalse(checkRelation(x,y,z))
  }

  @Test def testCheckCurriedRelation(): Unit = {
    val x: Int = 3
    val y: Int = 4
    val z: Int = 4
    assertTrue(curriedCheckRelation(x)(y)(z))
  }

  @Test def testCheckCurriedRelationTestNotSatisfied(): Unit = {
    val x: Int = 3
    val y: Int = 5
    val z: Int = 4
    assertFalse(curriedCheckRelation(x)(y)(z))
  }

  @Test def testValCheckRelation(): Unit = {
    val x: Int = 3
    val y: Int = 4
    val z: Int = 4
    assertTrue(valCheckRelation(x, y, z))
  }

  @Test def testValCheckRelationTestNotSatisfied(): Unit = {
    val x: Int = 3
    val y: Int = 5
    val z: Int = 4
    assertFalse(valCheckRelation(x, y, z))
  }

  @Test def testValCheckCurriedRelation(): Unit = {
    val x: Int = 3
    val y: Int = 4
    val z: Int = 4
    assertTrue(valCurriedCheckRelation(x)(y)(z))
  }

  @Test def testValCheckCurriedRelationTestNotSatisfied(): Unit = {
    val x: Int = 3
    val y: Int = 5
    val z: Int = 4
    assertFalse(valCurriedCheckRelation(x)(y)(z))
  }

  @Test def testCompose():Unit ={
    val result: Int = 9
    val f:Int => Int = _ - 1
    val g:Int => Int = _ * 2
    val x: Int = 5
    assertEquals(result, compose(f, g)(x))
  }
