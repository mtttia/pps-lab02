package task5

import org.junit.*
import org.junit.Assert.*
import Optionals.*

class OptionalIntTest:
  @Test def emptyOptionalShouldBeEmpty(): Unit =
    val empty = OptionalInt.Empty()
    assertTrue(OptionalInt.isEmpty(empty))

  @Test def nonEmptyOptionalShouldNotBeEmpty(): Unit =
    val nonEmpty = OptionalInt.Just(0)
    assertFalse(OptionalInt.isEmpty(nonEmpty))

  @Test def orElseShouldReturnDefaultWhenEmpty(): Unit =
    val nonEmpty = OptionalInt.Just(0)
    assertEquals(0, OptionalInt.orElse(nonEmpty, 1))

  @Test def orElseShouldReturnValueWhenNonEmpty(): Unit =
    val empty = OptionalInt.Empty()
    assertEquals(1, OptionalInt.orElse(empty, 1))

  /** Task 5: do test for map **/

  @Test def testMapIntWithEmpty():Unit =
    val empty = OptionalInt.Empty()
    val expr: Int => Int = _ + 1
    assertEquals(OptionalInt.Empty(), OptionalInt.mapInt(empty)(expr))

  @Test def testMapIntWithNotEmpty(): Unit =
    val notEmpty = OptionalInt.Just(5)
    val expr: Int => Int = _ + 1
    val result:OptionalInt.Just = OptionalInt.Just(6)
    assertEquals(result, OptionalInt.mapInt(notEmpty)(expr))

  @Test def testFilterEmpty(): Unit =
    val empty = OptionalInt.Empty()
    val filter: Int => Boolean = _ > 5
    assertEquals(OptionalInt.Empty(), OptionalInt.filter(empty)(filter))

  @Test def testFilterJust(): Unit =
    val just = OptionalInt.Just(7)
    val filter: Int => Boolean = _ > 5
    assertEquals(just, OptionalInt.filter(just)(filter))

  @Test def testFilterNotMatchedJust(): Unit =
    val just = OptionalInt.Just(4)
    val filter: Int => Boolean = _ > 5
    assertEquals(OptionalInt.Empty(), OptionalInt.filter(just)(filter))